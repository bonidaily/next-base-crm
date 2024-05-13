package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.MessagePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MessageStefDefs {

    MessagePage messagePage = new MessagePage();
    LoginPage page = new LoginPage();

    @Given("user is log in with valid credentials")
    public void user_is_log_in_with_valid_credentials() {

        page.login1();

    }
    @When("user click on message tab")
    public void user_click_on_message_tab() {

        messagePage.messageTab.click();
        BrowserUtils.sleep(2);

    }
    @When("user click on send button")
    public void user_click_on_send_button() {

        messagePage.sendButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("user should see The message title is not specified")
    public void user_should_see_the_message_title_is_not_specified() {

        String expectedErrorMessage = "The message title is not specified";
        String actualErrorMessage = messagePage.errorMessage1.getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        BrowserUtils.sleep(3);

    }

    @And("user should write a message {string} in the message box")
    public void userShouldWriteAMessageInTheMessageBox(String message) {

        Driver.getDriver().switchTo().frame(0);
        messagePage.messageBox.clear();
        messagePage.messageBox.sendKeys(message);
        messagePage.messageBox.clear();
        Driver.getDriver().switchTo().parentFrame();

    }

    @And("user should delete the recipient")
    public void userShouldDeleteTheRecipient() {

        messagePage.deleteRecipient.click();
    }

    @Then("user should see Please specify at least one person")
    public void userShouldSeePleaseSpecifyAtLeastOnePerson() {

        String expectedErrorMessage = "Please specify at least one person.";
        String actualErrorMessage = messagePage.errorMessage2.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @Then("user should see All employees has been selected by default")
    public void userShouldSeeAllEmployeesHasBeenSelectedByDefault() {

        messagePage.allEmployeesRecipient.isDisplayed();

    }

    @And("user click on cancel to cancel the send")
    public void userClickOnCancelToCancelTheSend() {

        messagePage.cancelButton.click();
    }

    @Then("user should see Send message ... and the message should be canceled")
    public void userShouldSeeSendMessageAndTheMessageShouldBeCanceled() {

        messagePage.sendMessageDisplayed.isDisplayed();
    }
}
