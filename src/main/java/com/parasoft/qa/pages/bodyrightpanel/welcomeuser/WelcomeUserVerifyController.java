package com.parasoft.qa.pages.bodyrightpanel.welcomeuser;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WelcomeUserVerifyController extends BasePage {

    WelcomeUserVerifyController(WebDriver driver) {
        super(driver);
    }

    public WelcomeUserVerifyController welcomeUserHeaderTextContains(String welcomeHeaderText) {
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/h1[starts-with(text(),'Welcome')]")).getText(),welcomeHeaderText);
        return this;
    }

    public WelcomeUserVerifyController welcomeUserMessageTextContains(String welcomeMessageText) {
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/p[contains(text(),'Your account was created successfully. You are now logged in.')]")).getText(),welcomeMessageText);
        return this;
    }
}
