package pages;

import base.BaseClass;

import org.openqa.selenium.By;


import io.cucumber.java.en.Then;

public class ViewLeadsPage extends BaseClass {

    
    @Then("ViewLeadsPage is displayed")
    public void verifyLeads(){
        String text=driver.findElement(By.id("viewLead_lastName_sp")).getText();
        if(text.contains("Das")){
            System.out.println("Leads are created");

        }else{
            System.out.println("Leads are not created");
        }
    }

}
