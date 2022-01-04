package co.uk.mailnewspapers.context;

import co.uk.mailnewspapers.api.core.RestClient;
import io.restassured.response.Response;
import lombok.Data;

@Data
public class TestContext {

    private RestClient restClient;
    private Response lastResponse;

}
