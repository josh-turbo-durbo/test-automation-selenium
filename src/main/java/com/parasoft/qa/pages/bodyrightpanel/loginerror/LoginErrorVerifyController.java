package com.parasoft.qa.pages.bodyrightpanel.loginerror;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginErrorVerifyController extends BasePage {

    public LoginErrorVerifyController(WebDriver driver){
        super(driver);
    }

    public LoginErrorVerifyController errorHeaderTextContains(String errorText) {
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/h1[1]")).getText(),errorText);
        return this;
    }

    public LoginErrorVerifyController errorMessageTextContains(String errorText) {
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/p[1]")).getText(),errorText);
        return this;
    }
}
