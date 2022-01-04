package co.uk.mailnewspapers.api.core;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;

import java.util.Map;

@Data
public class RestClient {

    private final String host;
    private final int port;
    private final Map<String, ?> headers;
    private Response response;
    public RestClient(String host, int port, Map<String, ?> headers) {
        this.headers = headers;
        this.host = host;
        this.port = port;
    }

    public final Response get(String endPoint, Map<String, ?> headers) {
        return response= requestSpecification().headers(headers).get(endPoint)
                .then()
                .log()
                .all(true).extract().response();
    }

    public Response post(String endPoint, String requestBody) {
        return response= requestSpecification().body(requestBody)
                .post(endPoint).then()
                .log()
                .all(true)
                .extract().response();
    }

    public Response post(String endPoint, String requestBody, Map<String, Object> params) {
        return response= requestSpecification().body(requestBody)
                .post(endPoint, params).then()
                .log()
                .all(true)
                .extract().response();
    }

    public RequestSpecification requestSpecification() {
        return  RestAssured.given()
                .baseUri(host)
                .port(port)
                .headers(headers)
                .log().all(true)
                .relaxedHTTPSValidation();
    }

}
