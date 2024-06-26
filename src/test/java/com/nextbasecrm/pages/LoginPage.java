package com.nextbasecrm.pages;


import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement userName;


    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement submit;


    public void login1(){
        userName.sendKeys("hr1@cydeo.com");
        password.sendKeys("UserUser");
        submit.click();
    }
}
