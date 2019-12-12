package com.parasoft.qa.pages.bodyleftpanel.customerlogin;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPanelActController extends BasePage {

    LoginPanelActController(WebDriver driver) {
        super(driver);
    }

    @Step("Type {0} into username text box.")
    public LoginPanelActController typeUsername(String username) {
        return (LoginPanelActController) this.sendKeysToElement("//div[@id='loginPanel']//div[@class='login']/input[@name='username']",username);
    }

    @Step("Type {0} into password text box.")
    public LoginPanelActController typePassword(String password){
        return (LoginPanelActController) this.sendKeysToElement("//div[@id='loginPanel']//div[@class='login']/input[@name='password']",password);
    }

    @Step
    public LoginPanelActController clickLoginButton() {
        return (LoginPanelActController) this.clickElement("//div[@id='loginPanel']//input[@type='submit' and @value='Log In']");
    }


    @Step
    public LoginPanelActController clickAboutUsLink(){
        return (LoginPanelActController) this.clickElement("");
    }

    @Step
    public LoginPanelActController clickServicesLink(){
        return (LoginPanelActController) this.clickElement("");
    }

    @Step
    public LoginPanelActController clickAdminPageLnk(){
        return (LoginPanelActController) this.clickElement("");
    }

    @Step
    public LoginPanelActController clickRegisterLink() {
        return (LoginPanelActController) this.clickElement("//div[@id='loginPanel']//a[contains(text(),'Register')]");
    }

}
