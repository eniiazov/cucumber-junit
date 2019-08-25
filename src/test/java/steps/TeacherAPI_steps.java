package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.HelperMethods;
import io.cucumber.datatable.DataTable;
import models.CustomResponse;
import models.RequestBody;
import org.junit.Assert;
import utilities.APIrunner;

import java.util.Map;

public class TeacherAPI_steps {

    private RequestBody requestBody;
    private CustomResponse customResponse;

    @Given("teacher is created with values")
    public void teacher_is_created_with_values(DataTable dataTable) {

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        requestBody = HelperMethods.convertMapToObject(map);

    }

    @When("user hits the web service {string}")
    public void user_hits_the_web_service(String url) {
        // Write code here that turns the phrase above into concrete actions

        APIrunner.runPOST(url, requestBody);
    }

    @Then("verify status code {string}")
    public void verify_status_code(String statusCode) {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertTrue(APIrunner.getResponse().statusCode()==Integer.valueOf(statusCode));

    }

    @Then("verify with Database")
    public void verify_with_Database() {
        // Write code here that turns the phrase above into concrete actions


    }

}
