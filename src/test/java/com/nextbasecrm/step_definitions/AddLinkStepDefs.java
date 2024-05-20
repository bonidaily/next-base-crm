package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.AddLinkPage;
import com.nextbasecrm.pages.ApplePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddLinkStepDefs {

    LoginPage login = new LoginPage();

    AddLinkPage addLinkPage = new AddLinkPage();


//    @Given("user is already logged in and is on dashboard page")
//    public void user_is_already_logged_in_and_is_on_dashboard_page() {
//        login.login1();
//    }

    @When("user click  Message button message tab opens")
    public void user_click_message_button_message_tab_opens() {
        BrowserUtils.sleep(3);
        addLinkPage.messageButton.click();
    }

    @Then("user click Link button")
    public void user_click_link_button() {
        BrowserUtils.sleep(3);
        addLinkPage.linkButton.click();
    }

    @Then("user can attach a link to the specified text.")
    public void user_can_attach_a_link_to_the_specified_text() {
        BrowserUtils.sleep(3);
        addLinkPage.linkURL.sendKeys("https://www.apple.com/");
    }

    @Then("user click to save button")
    public void user_click_to_save_button() {
        BrowserUtils.sleep(3);
        addLinkPage.saveButton.click();
    }


    @Then("user click on to send Button to see the link")
    public void userClickOnToSendButtonToSeeTheLink() {
        addLinkPage.sendButton.click();
    }


    @Then("user is able to see the link displayed")
    public void userIsAbleToSeeTheLinkDisplayed() {
        BrowserUtils.sleep(3);

        Assert.assertTrue(addLinkPage.clickToLink.isDisplayed());
        System.out.println("login = " + login);
    }

    @Then("user click on the link")
    public void userClickOnTheLink() {
        BrowserUtils.sleep(3);

        addLinkPage.clickToLink.click();
    }

    @Given("user sees the expected {string} link URL in message area")
    public void userSeesTheExpectedLinkURLInMessageArea(String expectedText) {

        Assert.assertEquals(addLinkPage.clickToLink.getText(), expectedText);

        System.out.println("https://www.apple.com/ = " + expectedText);
    }



    @When("user click to the link navigate to the correct URL")
    public void userClickToTheLinkNavigateToTheCorrectURL() {

        addLinkPage.clickToLink.click();

    }

    ApplePage applePage = new ApplePage();

    @Then("user should see the title {string}of new webPage")
   public void userShouldSeeTheTitleOfNewWebPage(String expectedText) {



        BrowserUtils.switchToWindow("Apple");

        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(expectedText,Driver.getDriver().getTitle());
        BrowserUtils.verifyURLContains("https://www.apple.com/");




//        BrowserUtils.sleep(3);
//
//        Assert.assertEquals(expectedText,applePage.header.getText());

    }


    @When("I click on the link to open in a new tab")
    public void iClickOnTheLinkToOpenInANewTab() {

        addLinkPage.clickToLink.click();
    }

    @Then("Verify that the link is opened in a new tab")
    public void verifyThatTheLinkIsOpenedInANewTab() {
        BrowserUtils.switchToWindow("Apple");
        String expectedTitle ="Apple";
        String title=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,title);

        System.out.println("expectedTitle = " + expectedTitle);

    }
}


