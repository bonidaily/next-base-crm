package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePage {

    public ApplePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "Apple")
    public WebElement header;

}
