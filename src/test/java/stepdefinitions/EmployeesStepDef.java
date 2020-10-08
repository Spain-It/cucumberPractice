package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.EmployeesPage;

public class EmployeesStepDef {

    EmployeesPage employeesPage = new EmployeesPage();

    @Given("navigate to employees")
    public void navigate_to_employees() throws InterruptedException {

        Thread.sleep(2000);
     employeesPage.employee.click();
     Thread.sleep(2000);
    }


    @Given("click the list button")
    public void click_the_list_button() throws InterruptedException {
     employeesPage.listButton.click();
     Thread.sleep(2000);
    }

    @Then("print the email of David Samson")
    public void ptint_the_email_of_david_samson() {
        System.out.println(employeesPage.email.getText());
    }

    @Then("print email be name {string}")
    public void printEmailBeName(String name) {

        System.out.println(employeesPage.email(name));

    }
}
