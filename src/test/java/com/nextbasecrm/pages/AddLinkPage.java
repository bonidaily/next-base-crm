package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkPage extends BasePage{

public AddLinkPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;

@FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkButton;


@FindBy(id = "linkidPostFormLHE_blogPostForm-href")
public WebElement linkURL;


@FindBy(id = "undefined")
    public WebElement saveButton;

@FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

@FindBy (linkText = "https://www.apple.com/")
    public WebElement clickToLink;

}
