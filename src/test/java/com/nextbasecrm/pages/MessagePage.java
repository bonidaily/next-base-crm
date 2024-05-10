package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage1;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement message;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteRecipient;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage2;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployeesRecipient;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessageDisplayed;

}
