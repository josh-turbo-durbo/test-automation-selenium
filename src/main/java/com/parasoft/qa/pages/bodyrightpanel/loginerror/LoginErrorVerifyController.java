package com.parasoft.qa.pages.bodyrightpanel.loginerror;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginErrorVerifyController extends BasePage {

    LoginErrorVerifyController(WebDriver driver){
        super(driver);
    }

    @Step("Assert that header text contains \"{0}\"")
    public LoginErrorVerifyController errorHeaderTextContains(String errorText) {
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/h1[1]")).getText(),errorText);
        return this;
    }

    @Step("Assert that message text contains \"{0}\"")
    public LoginErrorVerifyController errorMessageTextContains(String errorText) {
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/p[1]")).getText(),errorText);
        return this;
    }
}
