package co.uk.mailnewspapers.hooks;

import co.uk.mailnewspapers.context.Environment;
import co.uk.mailnewspapers.context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    TestContext testContext;
    @Autowired
    Environment environment;

    @Before
    public void init() {
      testContext.getRestClient().requestSpecification().baseUri(environment.getHost()+environment.getPort()).relaxedHTTPSValidation();
    }

    @After
    public void teardown() {

    }
}
