package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.EmployeePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class EmployeePageStepDef {

    EmployeePage employeePage = new EmployeePage();
    LoginPage loginPage = new LoginPage();

    @Given("user should be able to login the page")
    public void user_should_be_able_to_login_the_page() {



    }

    @Then("user should be able to click the Employees page.")
    public void user_should_be_able_to_click_the_employees_page() {

        employeePage.employeesPage.click();

    }

    @Then("user should verify that modules as below are seen in the Employees Page")
    public void userShouldVerifyThatModulesAsBelowAreSeenInTheEmployeesPage(List<String>expectedList) {

        List<String>actualResult=new ArrayList<>();
        for (WebElement each : employeePage.employeesModules) {
            actualResult.add(each.getText());

        }

        Assert.assertEquals(expectedList,actualResult);




    }

    @Then("user should be able to see the Company Structure as default")
    public void user_should_be_able_to_see_the_company_structure_as_default() {

        System.out.println("employeePage.companyStructure.isDisplayed() = " + employeePage.companyStructure.isDisplayed());


    }


}
