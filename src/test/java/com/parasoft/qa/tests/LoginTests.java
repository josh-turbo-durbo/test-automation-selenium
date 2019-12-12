package com.parasoft.qa.tests;

import com.parasoft.qa.base.BaseTest;
import com.parasoft.qa.pages.bodyleftpanel.customerlogin.LoginPanelPage;
import com.parasoft.qa.pages.bodyrightpanel.loginerror.LoginErrorPage;
import com.parasoft.qa.pages.bodyrightpanel.register.RegisterUserPage;
import com.parasoft.qa.pages.bodyrightpanel.welcomeuser.WelcomeUserPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.parasoft.qa.pages.bodyleftpanel.customerlogin.LoginPanelPage.getHomePage;

public class LoginTests extends BaseTest{

    private LoginPanelPage loginPanelPage;
    private LoginErrorPage loginErrorPage;
    private WelcomeUserPage welcomeUserPage;
    private RegisterUserPage registerUserPage;

    @BeforeClass
    public void goToHome(){
        loginPanelPage = getHomePage(this.getDriver());
    }

    @Test
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
