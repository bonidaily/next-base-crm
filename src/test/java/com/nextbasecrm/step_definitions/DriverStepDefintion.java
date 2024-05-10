package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.DrivePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DriverStepDefintion {
    DrivePage driverminePage = new DrivePage();
    LoginPage login = new LoginPage();

    @Given("User is able to login home page")
    public void user_is_able_to_login_home_page() {


    }

    @Then("User clicks Driver page")
    public void userClicksDriverPage() {
        driverminePage.drivePage.click();
    }


    @Then("User sees Modules are in the main header and user verifies modules")
    public void userSeesModulesAreInTheMainHeaderAndUserVerifiesModules(List<String>expectedResult) {
        List<String> actualResult = new ArrayList<>();
        for (WebElement eachofDriver : driverminePage.driverModules) {
            actualResult.add(eachofDriver.getText());
        }
        Assert.assertEquals(expectedResult,actualResult);
    }
}
