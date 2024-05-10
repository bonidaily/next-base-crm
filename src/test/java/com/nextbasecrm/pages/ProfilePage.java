package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage extends BasePage {

    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement MyProfileOption;


    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> ListOfmodules;

    @FindBy(xpath= "//a[@href='mailto:hr1@cydeo.com']")

    public WebElement email;


}
