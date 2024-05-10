package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.ProfilePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProfilePage_step_definition {
    LoginPage loginPage = new LoginPage();


    ProfilePage profilePage = new ProfilePage();
    @Given("user should be able to login the page")
    public void user_should_be_able_to_login_the_page() {
    loginPage.login1();

    }

    @Then("user should be able to click My profile image icon")
    public void user_should_be_able_to_click_my_profile_image_icon() {
        profilePage.myProfile.click();



    }
    @Then("user should be able to click My profile option")
    public void user_should_be_able_to_click_my_profile_option() {
        profilePage.MyProfileOption.click();


    }
    @Then("user should be able to see the following options on My Profile page")
    public void user_should_be_able_to_see_the_following_options_on_my_profile_page(List<String>expected) {
        List<String>actual = new ArrayList<String>();
        for (WebElement listOfmodule : profilePage.ListOfmodules) {
            actual.add(listOfmodule.getText());



        }
        Assert.assertEquals(expected,actual);
    }

    @Then("user should be able to verify that the email under the General tab is the same as the user’s account.")
    public void userShouldBeAbleToVerifyThatTheEmailUnderTheGeneralTabIsTheSameAsTheUserSAccount() {
        BrowserUtils.sleep(5);

        Assert.assertEquals("hr1@cydeo.com",profilePage.email.getText());
    }
}
