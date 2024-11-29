package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiPages;

public class ApiSteps {

    ApiPages apiPages;

    public ApiSteps(){
        this.apiPages = new ApiPages();
    }

    //scenario1
    @Given("prepare url valid for {string}")
    public void prepareValidUrl( String url){
        apiPages.prepareValidUrl(url);
    }

    @When("hit url to get list data")
    public void hitUrl(){
       apiPages.hitUrl();
    }

    @Then("validation get status code {int}")
    public void getStatusCode(int status_code){
        apiPages.getStatusCode(status_code);
    }

    @And("Validation response body list users")
    public void validationResponseBodyListUsers() {
        apiPages.validationResponseBodyListUsers();
    }

    @And("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String fileName) {
        apiPages.validationResponseJsonWithJSONSchema(fileName);
    }

    //scenario3
    @When("hit url to create new user")
    public void hitUrlToCreateNewUser() {
        apiPages.hitUrlToCreateNewUser();
    }

    @And("Validation response body new users")
    public void validationResponseBodyNewUsers() {
        apiPages.validationResponseBodyNewUsers();
    }

    //scenario4
    @When("hit url to create new user with empty data")
    public void hitUrlToCreateNewUserWithEmptyData() {
        apiPages.hitUrlToCreateNewUserWithEmptyData();
    }

    //scenario5
    @And("hit api delete user")
    public void hitApiDeleteUser() {
        apiPages.hitApiDeleteUser();

    }

    //scenario6
    @And("hit api update user")
    public void hitApiUpdateUser() {
        apiPages.hitApiUpdateUser();

    }

    @And("Validation response body update users")
    public void validationResponseBodyUpdateUsers() {
        apiPages.validationResponseBodyUpdateUsers();
    }
}
