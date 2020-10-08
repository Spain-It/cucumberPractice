package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Employees")
    public WebElement employee;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy(xpath = "//tbody/tr[3]/td[4]")
    public WebElement email;

    public String email(String name){

    WebElement emailOfName = Driver.getDriver().findElement(By.xpath("//tbody//td[text()='" + name + "']/../td[4]"));
        return emailOfName.getText();
    }


}
