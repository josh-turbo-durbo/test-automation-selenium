package com.parasoft.qa.tests;

import com.parasoft.qa.base.BaseTest;
import com.parasoft.qa.pages.bodyleftpanel.customerlogin.LoginPanelPage;
import com.parasoft.qa.pages.bodyrightpanel.loginerror.LoginErrorPage;
import com.parasoft.qa.pages.bodyrightpanel.register.RegisterUserPage;
import com.parasoft.qa.pages.bodyrightpanel.welcomeuser.WelcomeUserPage;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

import static com.parasoft.qa.pages.bodyleftpanel.customerlogin.LoginPanelPage.getHomePage;

public class LoginTests extends BaseTest{

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());


    private LoginPanelPage loginPanelPage;
    private LoginErrorPage loginErrorPage;
    private WelcomeUserPage welcomeUserPage;
    private RegisterUserPage registerUserPage;

    @BeforeClass
    @Description("Load the home page at [https://parabank.parasoft.com]")
    public void goToHome(){
        loginPanelPage = getHomePage(this.getDriver());
    }

    @Test
    @Description("Expected fail: Attempt to log in with an unregistered username/password and validate the error message.")
    public void LoginAttemptWithBadUsernamePassword() {
        loginPanelPage
                .act()
                .typeUsername("BadUSer")
                .typePassword("BadPassword")
                .clickLoginButton();

        loginErrorPage = LoginErrorPage.getLoginErrorPage(this.getDriver());
        loginErrorPage
                .verify()
                .errorHeaderTextContains("Error!")
                .errorMessageTextContains("The username and password could not be verified.");
    }

    @Test
    @Description("Expected fail: Attempt to log in with no username and password and validate the error message.")
    public void LoginAttemptWithNoUsernamePassword() {
        loginPanelPage
                .act()
                .clickLoginButton();

        loginErrorPage = LoginErrorPage.getLoginErrorPage(this.getDriver());
        loginErrorPage
                .verify()
                .errorHeaderTextContains("Error!")
                .errorMessageTextContains("Please enter a username and password.");
    }

    @Test
    @Description("Register a valid user and verify text on the 'Welcome User' page.")
    public void RegisterUser(){
        loginPanelPage
                .act()
                .clickRegisterLink();

        registerUserPage = RegisterUserPage.getRegisterUser(this.getDriver());
        registerUserPage
                .verify()
                .headerTextContains("Signing up is easy!");

        registerUserPage
                .act()
                .typeFirstName("Test")
                .typeLastName("User")
                .typeAddress("123 st")
                .typeState("KS")
                .typeZipCode("45612")
                .typeCity("Somewhere")
                .typePhone("4564564561")
                .typeSsn("456456456")
                .typeUsername("TestUser1237")
                .typePassword("password")
                .typeConfirmPassword("password")
                .clickRegisterButton();

        welcomeUserPage = WelcomeUserPage.getWelcomeUser(this.getDriver());
        welcomeUserPage
                .verify()
                .welcomeUserHeaderTextContains("Welcome")
                .welcomeUserMessageTextEquals("Your account was created successfully. You are now logged in.");
    }



}
