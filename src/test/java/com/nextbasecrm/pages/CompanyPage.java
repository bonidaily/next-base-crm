package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage extends BasePage{

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
      @FindBy(xpath = "(//span[@class='menu-item-link-text'])[12]")
      public WebElement CompanyButton;
        @FindBy(xpath = "//span[.='Official Information']")

        public WebElement officalInformationButton;

        @FindBy(xpath = "//span[.='Our Life']")
        public WebElement ourLifeButton;

        @FindBy(xpath = "//span[.='About Company']")
        public WebElement aboutCompanyButton;

        @FindBy(xpath = "//span[.='Photo Gallery']")
        public WebElement PhotoGalleryButton;
        @FindBy(xpath = "//span[.='Video']")
         public WebElement videoButton;

        @FindBy(xpath = "//span[.='Career']")
          public WebElement CareerButton;


       @FindBy(xpath = "//span[.='Business News (RSS)']")
       public WebElement BusinessNewsButton;


       @FindBy(xpath = "//span[.='More']")
      public WebElement Button;

        @FindBy(xpath = "//span[@class='main-buttons-item-text']")
          public List<WebElement> listOfModulesNames;







}

