package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.apache.commons.logging.Log;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("hr1")){
            username = ConfigurationReader.getProperty("hr1_username");
            password = ConfigurationReader.getProperty("hr1_password");
        }else if(userType.equalsIgnoreCase("helpdesk")){
            username = ConfigurationReader.getProperty("helpdesk1_username");
            password = ConfigurationReader.getProperty("helpdesk1_password");
        }else if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketing1_username");
            password = ConfigurationReader.getProperty("marketing1_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }


    @Given("user is logged in with valid credentials")
    public void userIsLoggedInWithValidCredentials() {

        loginPage.login1();
    }
}
