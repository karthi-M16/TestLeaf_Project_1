package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {

    
    @When("Enter the Username {string}")
    public LoginPage enteruName(String uName){
        driver.findElement(By.id("username")).sendKeys(uName);
       return this;
    }
    @When("Enter the password {string}")
    public LoginPage enterPword(String pwd){
        driver.findElement(By.id("password")).sendKeys(pwd);
        return this;
    }
    @When("click on Login button")
    public WelcomePage clickLogin(){
        driver.findElement(By.className("decorativeSubmit")).click();
        return new WelcomePage();
    }
}
