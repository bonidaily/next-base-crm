package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActiveStreamPage {
    public ActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[contains(@class,'microblog-top-tabs-visible')]/div/span")
    public List<WebElement> modulesElements;


    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement more;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> moreModules;
}
