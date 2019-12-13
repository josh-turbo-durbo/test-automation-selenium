package com.parasoft.qa.pages.bodyrightpanel.welcomeuser;

import com.parasoft.qa.base.BasePage;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.WebDriver;

public class WelcomeUserPage extends BasePage {

    private WelcomeUserVerifyController verify;

    public WelcomeUserVerifyController verify() { return verify; }

    private WelcomeUserPage(WebDriver driver,
                            WelcomeUserVerifyController verify) {
        super(driver);
        this.verify = verify;
        Log.info("Load [WelcomeUserPage]");
    }

    public static WelcomeUserPage getWelcomeUser(WebDriver driver) {
        return new WelcomeUserPage(
                driver,
                new WelcomeUserVerifyController(driver)
        );
    }
}
