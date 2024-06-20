package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.CompanyPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CompanySteps {
     CompanyPage companyPage=new CompanyPage();



     @Then("User should be able to see below modules;")
    public void user_should_be_able_to_se_below_modules(List<String> expectedModulesNames){

             List<String> actualResult=new ArrayList<>();

              actualResult=BrowserUtils.getElementsText(companyPage.listOfModulesNames);

        // for (WebElement each : companyPage.listOfModulesNames) {
        //actualResult.add(each.getText())     ;

        // }
         System.out.println("expectedModulesNames = " + expectedModulesNames);

         System.out.println("actualResult = " + actualResult);
         Assert.assertEquals(expectedModulesNames,actualResult);

//         }

         }

         @When("user clicks   Company button")
             public void userClicksCompanyButton() {
         companyPage.CompanyButton.click();
    }
}









