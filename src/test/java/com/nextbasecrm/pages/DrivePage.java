package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage extends BasePage {
    public DrivePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy(xpath = "//div[contains(@class,'main-buttons-item')]")
    public List<WebElement> driverModules;



}
