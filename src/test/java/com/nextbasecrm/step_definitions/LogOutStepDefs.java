package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LogOutPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LogOutStepDefs {

    LoginPage loginPage= new LoginPage();
    LogOutPage logOutPage=new LogOutPage();

    @Given("User logged in successfully")
    public void user_logged_in_successfully() {
        loginPage.login1();

    }
    @When("User clicks on profile name")
    public void user_clicks_on_profile() {

        logOutPage.profileName.click();

    }
    @When("User clicks on Log out Button")
    public void user_clicks_on_log_out_button() {
        logOutPage.logOutLink.click();

    }
    @Then("User should be able to log out")
    public void user_should_be_able_to_log_out() {
        String expectedTitle="Authorization";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @Then("User should be Able to see Five options under the profile name")
    public void userShouldBeAbleToSeeOptionsUnderTheProfileName(List<String> expectedOptions) {
        List<String> actualOptions=new ArrayList<>();

        for (WebElement each : logOutPage.profileOptions) {
            actualOptions.add(each.getText());

        }

        Assert.assertEquals(expectedOptions,actualOptions);
    }
}
