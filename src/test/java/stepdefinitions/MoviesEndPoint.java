package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class MoviesEndPoint {

    Response response;

    @Given("the user set the uri")
    public void the_user_set_the_uri() {

       baseURI = ConfigReader.getProperty("rakuten_uri");
    }

    @And("the user sends post request with {string} end point")
    public void theUserSendsPostRequestWithEndPoint(String endPoint,Map<String, Object> data) {

//        Map<String, Object> data = new HashMap<>();
//        data.put("title","Salamanca");
//        data.put("year",1920);
//        data.put("plot","anyword");
//        data.put("duration",110);
//        data.put("audio_qualities","");
//        data.put("video_qualities","");
//        data.put("genres","");

         response = given().accept(ContentType.JSON).contentType(ContentType.JSON).and().body(data).post(endPoint);

    }

    @Given("Verify the status code is {int}")
    public void verify_the_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());

         }

    @When("Verify the content Type is {string}")
    public void verify_the_content_type_is(String contentType) {

        Assert.assertEquals(contentType,response.contentType());

    }

    @Then("Print the response body")
    public void print_the_response_body() {
         response.prettyPrint();
    }


}
