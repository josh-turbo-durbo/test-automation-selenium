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
        Assert.assertTrue(getDriver()
                         .findElement(By.xpath("//div[@id='rightPanel']/h1[starts-with(text(),'" + welcomeHeaderText +"')]"))
                         .getText()
                         .contains(welcomeHeaderText)
        );
        return this;
    }

    public WelcomeUserVerifyController welcomeUserMessageTextEquals(String welcomeMessageText) {
        Assert.assertTrue(getDriver()
                        .findElement(By.xpath("//div[@id='rightPanel']/p[contains(text(),'" + welcomeMessageText + "')]"))
                        .getText()
                        .contains(welcomeMessageText)
        );
        return this;
    }
}
