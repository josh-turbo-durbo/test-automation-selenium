package com.parasoft.qa.pages.bodyleftpanel.customerlogin;

import com.parasoft.qa.base.BasePage;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPanelActController extends BasePage {

    LoginPanelActController(WebDriver driver) {
        super(driver);
    }

    @Step("Type {0} into username text box.")
    public LoginPanelActController typeUsername(String username) {
        Log.info("Type username");
        return (LoginPanelActController) this.sendKeysToElement("//div[@id='loginPanel']//div[@class='login']/input[@name='username']",username);
    }

    @Step("Type {0} into password text box.")
    public LoginPanelActController typePassword(String password){
        Log.info("Type password");
        return (LoginPanelActController) this.sendKeysToElement("//div[@id='loginPanel']//div[@class='login']/input[@name='password']",password);
    }

    @Step
    public LoginPanelActController clickLoginButton() {
        Log.info("Click login button");
        return (LoginPanelActController) this.clickElement("//div[@id='loginPanel']//input[@type='submit' and @value='Log In']");
    }


    @Step
    public LoginPanelActController clickAboutUsLink(){
        Log.info("Click about us link");
        return (LoginPanelActController) this.clickElement("");
    }

    @Step
    public LoginPanelActController clickServicesLink(){
        Log.info("Click services link");
        return (LoginPanelActController) this.clickElement("");
    }

    @Step
    public LoginPanelActController clickAdminPageLnk(){
        Log.info("Click admin page link");
        return (LoginPanelActController) this.clickElement("");
    }

    @Step
    public LoginPanelActController clickRegisterLink() {
        Log.info("Click register link");
        return (LoginPanelActController) this.clickElement("//div[@id='loginPanel']//a[contains(text(),'Register')]");
    }

}
