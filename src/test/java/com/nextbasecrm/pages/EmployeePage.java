package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class EmployeePage extends BasePage {

    public EmployeePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Company Structure'])[1]")
    public WebElement companyStructure;

    @FindBy(xpath="//div[contains(@class,'main-buttons-item')]")
    public List<WebElement>employeesModules;







}
