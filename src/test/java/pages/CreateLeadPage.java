package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {

      @When("Enter the companyName (.*)$")
    public CreateLeadPage enterCname(String cName){
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
        return this;
    }
    @When("Enter the firstName (.*)$")
    public CreateLeadPage enterFname(String fName){
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
        return this;
    }
    @When("Enter the lastName (.*)$")
    public CreateLeadPage enterLname(String lName){
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
        return this;
    }
    @And("Click on SubmitButton")
    public ViewLeadsPage clickSubmit(){
        driver.findElement(By.name("submitButton")).click();
        return new ViewLeadsPage();
}
}