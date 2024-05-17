package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.CompanyStructurePage;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CompanyStructureStepDef {
    CompanyStructurePage companyStructurePage =new CompanyStructurePage();
    LoginPage loginPage = new LoginPage();

    @When("user logs in as {string}")
    public void user_logs_in_as(String hr) {
        loginPage.login(hr);

    }

    @When("user clicks {string}")
    public void user_clicks(String Employee) {
        companyStructurePage.Employee.click();


    }


    @Then("user should be able to see {string} under Employees page")
    public void userShouldBeAbleToSeeUnderEmployeesPage(String expected) {
        String actualText = companyStructurePage.comStructureBtn.getText();
        Assert.assertEquals(expected, actualText);
    }

    @When("user add department with name {string}")
    public void user_add_department_with_name(String department) {
        companyStructurePage.addDepartmentBtn.click();
        companyStructurePage.departmentNameBox.sendKeys(department);
        companyStructurePage.ADDBtn.click();

    }
    @Then("user should see created department")
    public void user_should_see_created_department() {
        BrowserUtils.sleep(3);
        List<String> allDeps = BrowserUtils.getElementsText(companyStructurePage.allDepartments);
        Assert.assertTrue(allDeps.contains("Department"));

    }

    @Then("user should not see ADD DEPARTMENT button")
    public void user_Should_Not_See_ADD_DEPARTMENT_Button() {
        BrowserUtils.sleep(3);
        List<String>allDeps = BrowserUtils.getElementsText(companyStructurePage.allDepartments);
        Assert.assertFalse(allDeps.contains("Department"));
    }



}
