package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {

    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET endpoints")
    public void setGetEndpoints(){
        get.setApiEndpoint();

    }
    @When("I send GET HTTP request")
    public void getHTTPrequest(){
        get.sendGetHttpRequest();

    }
    @Then("I receive valid data for detail user")
    public void HTTPresponse200(){
        get.validateHttpResposeCode200();

    }

    @And("I receive valid HTTP response code 200")
    public void valiData(){
        get.validateHttpResposeCode200();

    }

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }
    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDataNewUser();

    }

    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints(){
        put.setPutApiEndpoints();

    }
    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @And("I receive valid data for update user")
    public void validateUpdateUser(){
        put.validateDataUpdateUser();

    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints(){
        delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteApiEndpoints(){
        delete.sendDeleteHttpRequest();
    }

}
