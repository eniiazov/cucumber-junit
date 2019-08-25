package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.Map;

public class TeacherAPI_steps {

    @Given("teacher is created with values")
    public void teacher_is_created_with_values(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

        // we are going to covert to Map

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        



    }

    @When("user hits the web service {string}")
    public void user_hits_the_web_service(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("verify status code {string}")
    public void verify_status_code(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

}
