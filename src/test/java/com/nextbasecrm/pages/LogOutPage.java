package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogOutPage {
    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileName;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOutLink;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> profileOptions;
}
