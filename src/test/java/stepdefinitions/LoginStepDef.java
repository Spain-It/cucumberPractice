package stepdefinitions;


import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;


public class LoginStepDef {
    @Given("the user goes to link")
    public void the_user_go_to_link() {

        Driver.getDriver().get(ConfigReader.getProperty("twiliaerp_link"));
    }

    @Given("the user logs in {string} {string}")
    public void the_user_logs_in(String email, String password) {

        LoginPage loginPage = new LoginPage();

        loginPage.login(email,password);

    }



}
