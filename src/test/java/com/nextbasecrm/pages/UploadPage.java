package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.ByteOrder;

public class UploadPage {

    public UploadPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement messageText;

    @FindBy (xpath = "(//span[.='Appreciation'])[1]")
    public WebElement AppreciationTab;

    @FindBy (xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement attachmentBtn;

    @FindBy (xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadArea;

    @FindBy (xpath = "//span[@class='f-wrap']")
    public WebElement fileName;

    @FindBy (xpath = "//span[@class='insert-btn-text']")
    public WebElement InsertButton;

    @FindBy (xpath = "(//span[.='In text'])[1]")
    public WebElement ImageAndFileButton;

    @FindBy (xpath = "//span[@class='del-but']")
    public WebElement deleteButton;

}
