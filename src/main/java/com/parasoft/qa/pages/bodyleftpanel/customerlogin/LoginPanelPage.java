package com.parasoft.qa.pages.bodyleftpanel.customerlogin;

import com.parasoft.qa.base.BasePage;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.WebDriver;

public class LoginPanelPage extends BasePage {

    private LoginPanelActController act;

    public LoginPanelActController act() { return act; }

    private LoginPanelPage(WebDriver driver, LoginPanelActController act) {
        super(driver);
        this.act = act;
        Log.info("Load [LoginPanelPage].");
    }

    public static LoginPanelPage getLoginPanelPage(WebDriver driver) {
        return new LoginPanelPage(driver, new LoginPanelActController(driver));
    }
}
