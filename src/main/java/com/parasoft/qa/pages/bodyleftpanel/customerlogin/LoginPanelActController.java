package com.parasoft.qa.pages.bodyleftpanel.customerlogin;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPanelActController extends BasePage {

    LoginPanelActController(WebDriver driver) {
        super(driver);
    }

    public LoginPanelActController typeUsername(String username) {
        return (LoginPanelActController) this.sendKeysToElement("//div[@id='loginPanel']//div[@class='login']/input[@name='username']",username);
    }

    public LoginPanelActController typePassword(String password){
        return (LoginPanelActController) this.sendKeysToElement("//div[@id='loginPanel']//div[@class='login']/input[@name='password']",password);
    }

    public LoginPanelActController clickLoginButton() {
        return (LoginPanelActController) this.clickElement("//div[@id='loginPanel']//input[@type='submit' and @value='Log In']");
    }

    public LoginPanelActController clickAboutUsLink(){
        return (LoginPanelActController) this.clickElement("");
    }

    public LoginPanelActController clickServicesLink(){
        return (LoginPanelActController) this.clickElement("");
    }

    public LoginPanelActController clickAdminPageLnk(){
        return (LoginPanelActController) this.clickElement("");
    }

    public LoginPanelActController clickRegisterLink() {
        return (LoginPanelActController) this.clickElement("//div[@id='loginPanel']//a[contains(text(),'Register')]");
    }

}
