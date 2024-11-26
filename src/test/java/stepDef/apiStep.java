package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.apiPage;

public class apiStep {

    apiPage ApiPage;

    public apiStep(){
        this.ApiPage = new apiPage();
    }

    @Given("prepare url valid for get list data")
    public void prepareValidURL(){
        ApiPage.prepareURL();
    }

    @When("hit url to get list data")
    public void hitURL(){

    }

    @Then("get status code 200")
    public void getStatusCode(){

    }

    @And("get all data users")
    public void getDataUsers(){

    }
}
