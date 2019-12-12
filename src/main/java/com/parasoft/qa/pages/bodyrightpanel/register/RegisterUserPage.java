package com.parasoft.qa.pages.bodyrightpanel.register;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.WebDriver;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class RegisterUserPage extends BasePage {

    private RegisterUserActController act;
    private RegisterUserVerifyController verify;

    public RegisterUserActController act() { return act; }
    public RegisterUserVerifyController verify() { return verify; }

    private RegisterUserPage(
            WebDriver driver,
            RegisterUserActController act,
            RegisterUserVerifyController verify) {
        super(driver);
        this.act = act;
        this.verify = verify;
    }

    public static RegisterUserPage getRegisterUser(WebDriver driver) {
        return new RegisterUserPage(
                driver,
                new RegisterUserActController(driver),
                new RegisterUserVerifyController(driver));
    }
}
