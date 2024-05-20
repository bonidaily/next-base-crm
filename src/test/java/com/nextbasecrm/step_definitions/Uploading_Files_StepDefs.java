package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.UploadPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class Uploading_Files_StepDefs extends BasePage {

    LoginPage login=new LoginPage();
    UploadPage uploadPage = new UploadPage();

    @Given("User is logged in with valid credentials")
    public void userIsLoggedInWithValidCredentials() {

        login.login1();
    }


    @When("User clicks on More tab")
    public void user_clicks_on_more_tab() {
        moreModule.click();

    }

    @When("user clicks on the appreciation tab")
    public void user_clicks_on_the_appreciation_tab() {
        uploadPage.AppreciationTab.click();

    }
    @When("User clicks on attachment Button")
    public void user_clicks_on_attachment_button() {
        uploadPage.attachmentBtn.click();

    }
    @When("User clicks on the upload files and images and select the files {string}")
    public void user_clicks_on_the_upload_files_and_images_and_select_the_files(String path) {
        uploadPage.uploadArea.sendKeys(path);

    }
    @Then("the user should be able to see the {string}")
    public void the_user_should_be_able_to_see_the(String fileName) {

        String expectedResult = fileName;
        String actualResult = uploadPage.fileName.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("the user clicks insertBtn")
    public void theUserClicksInsertBtn() {

        uploadPage.InsertButton.click();

    }

    @Then("user should be able to see file or image in the message body")
    public void userShouldBeAbleToSeeFileOrImageInTheMessageBody() {

        Assert.assertTrue("File or image are displayed in message.", uploadPage.ImageAndFileButton.isDisplayed());

    }

    @And("User clicks on the upload files and images and select pass files {string}")
    public void userClicksOnTheUploadFilesAndImagesAndSelectPassFiles(String path) {
        uploadPage.uploadArea.sendKeys(path);
    }

    @Then("the user should be able to remote files and images")
    public void theUserShouldBeAbleToRemoteFilesAndImages() {

        uploadPage.deleteButton.click();
    }
}
