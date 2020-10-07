package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;


public class login {
    @Given("user got the link")
    public void user_got_the_link() {

        Driver.getDriver().get("https://www.google.com");

          }


}
