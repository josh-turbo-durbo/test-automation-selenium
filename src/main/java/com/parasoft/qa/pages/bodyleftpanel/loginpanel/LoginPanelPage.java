package com.parasoft.qa.pages.bodyleftpanel.loginpanel;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
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

    public static By userNameTextBox() {
        return By.xpath("//div[@id='loginPanel']//input[@name='username' and 1]");
    }

    public static By passwordTextBox() {
        return By.xpath("//div[@id='loginPanel']//input[@name='password']");
    }

    public static By loginButton() {
        return By.xpath("//div[@id='loginPanel']//input[@value='Log In' and 1]");
    }

    public static By loginErrorMessage() {
        return By.xpath("//div[@id='rightPanel']/p[1]");
    }

    public static By registerLink() {
        return By.xpath("//div[@id='loginPanel']//a[contains(text(),'Register')]");
    }
}
