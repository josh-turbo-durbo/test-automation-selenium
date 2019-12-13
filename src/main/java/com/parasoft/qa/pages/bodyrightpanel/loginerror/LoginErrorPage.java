package com.parasoft.qa.pages.bodyrightpanel.loginerror;

import com.parasoft.qa.base.BasePage;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.WebDriver;

public class LoginErrorPage extends BasePage {

    private LoginErrorVerifyController verify;

    public LoginErrorVerifyController verify() { return verify; }

    private LoginErrorPage(WebDriver driver, LoginErrorVerifyController verify) {
        super(driver);
        this.verify = verify;
        Log.info("Load [LoginErrorPage]");
    }

    public static LoginErrorPage getLoginErrorPage(WebDriver driver) {
        return new LoginErrorPage(driver, new LoginErrorVerifyController(driver));
    }
}
