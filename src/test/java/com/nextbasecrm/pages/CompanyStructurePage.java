package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyStructurePage {
    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


@FindBy (xpath = "(//span[@class='menu-item-link-text'])[10]")
public WebElement Employee;

@FindBy(xpath = "(//span[.='Company Structure'])[1]")
public WebElement comStructureBtn;
@FindBy(xpath = "(//span[.='Add department'])[1]")
public WebElement addDepartmentBtn;

@FindBy(xpath = "//input[@id='NAME']")
public WebElement departmentNameBox;


@FindBy(xpath = "//span[.='Add']]")
public WebElement ADDBtn;

@FindBy(xpath = "//div[@class='structure-dept-title-text']")
public List<WebElement> allDepartments;

}
