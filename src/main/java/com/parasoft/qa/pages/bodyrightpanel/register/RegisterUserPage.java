package com.parasoft.qa.pages.bodyrightpanel.register;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class RegisterUserPage extends BasePage {

    private RegisterUserActController act;

    public RegisterUserActController act() { return act; }

    private RegisterUserPage(WebDriver driver, RegisterUserActController act) {
        super(driver);
        this.act = act;
    }

    public static RegisterUserPage getRegisterUser(WebDriver driver) {
        return new RegisterUserPage(driver, new RegisterUserActController(driver));
    }
}
