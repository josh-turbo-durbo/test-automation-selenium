package com.parasoft.qa.pages.bodyleftpanel.customerlogin;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPanelPage extends BasePage {

    private LoginPanelActController act;

    public LoginPanelActController act() { return act; }

    private LoginPanelPage(WebDriver driver, LoginPanelActController act) {
        super(driver);
        this.act = act;
    }

    public static LoginPanelPage getHomePage(WebDriver driver) {
        return new LoginPanelPage(driver, new LoginPanelActController(driver));
    }
}
