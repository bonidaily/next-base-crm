package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.ActiveStreamPage;
import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStreamStepDefs extends BasePage {

    LoginPage page= new LoginPage();
    ActiveStreamPage activeStreamPage=new ActiveStreamPage();


    @Given("User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        page.login1();
    }


    @Then("User should be able to see the following options")
    public void userShouldBeAbleToSeeTheFollowingOptions(List<String> expectedOptions) {
        List<String> actualOptions=new ArrayList<>();
        for (WebElement each : activeStreamPage.modulesElements) {
            actualOptions.add(each.getText());

        }

        Assert.assertEquals(expectedOptions,actualOptions);


    }

    @When("User click on More tab")
    public void userClickOnMoreTab() {

    activeStreamPage.more.click();
    }

    @Then("User should be able to see four options")
    public void userShouldBeAbleToSeeFourOptions(List<String> expectedMoreOptions) {
        List<String> actualMoreOptions=new ArrayList<>();
        for (WebElement each : activeStreamPage.moreModules) {
            actualMoreOptions.add(each.getText());
        }

        Assert.assertEquals(expectedMoreOptions,actualMoreOptions);

    }

    @When("User successfully logged in")
    public void userSuccessfullyLoggedIn() {
        String expectedTitle="Portal";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
