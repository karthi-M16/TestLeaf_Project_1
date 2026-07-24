package pages;

import org.openqa.selenium.By;


import base.BaseClass;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {

    
    @When("click on crmsfa button")
    public MyHomePage clickCRMSFA(){
        driver.findElement(By.linkText("CRM/SFA")).click();

        return new MyHomePage();

    }
    
}


