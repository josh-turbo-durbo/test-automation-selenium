package com.parasoft.qa.testdata;

import com.parasoft.qa.base.BaseTest;
import com.parasoft.qa.pages.bodyleftpanel.loginpanel.LoginPanelPage;
import com.parasoft.qa.pages.bodyrightpanel.loginerror.LoginErrorPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.parasoft.qa.pages.bodyleftpanel.loginpanel.LoginPanelPage.getHomePage;

public class LoginTests extends BaseTest{

    private LoginPanelPage loginPanelPage;

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

        LoginErrorPage loginErrorPage = LoginErrorPage.getLoginErrorPage(this.getDriver());
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

        LoginErrorPage loginErrorPage = LoginErrorPage.getLoginErrorPage(this.getDriver());
        loginErrorPage
                .verify()
                .errorHeaderTextContains("Error!")
                .errorMessageTextContains("Please enter a username and password.");
    }



}
