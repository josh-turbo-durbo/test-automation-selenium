package com.parasoft.qa.pages.bodyrightpanel.loginerror;

import com.parasoft.qa.base.BasePage;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginErrorVerifyController extends BasePage {

    LoginErrorVerifyController(WebDriver driver){
        super(driver);
    }

    @Step("Verify that header text contains \"{0}\"")
    public LoginErrorVerifyController errorHeaderTextContains(String errorText) {
        Log.info("Verify header text contains '" + errorText +"'");
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/h1[1]")).getText(),errorText);
        return this;
    }

    @Step("Verify that message text contains \"{0}\"")
    public LoginErrorVerifyController errorMessageTextContains(String errorText) {
        Log.info("Verfiy header message text contains '" + errorText + "'");
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/p[1]")).getText(),errorText);
        return this;
    }
}
