package com.parasoft.qa.pages.bodyrightpanel.welcomeuser;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.yandex.qatools.allure.annotations.Step;

public class WelcomeUserVerifyController extends BasePage {

    WelcomeUserVerifyController(WebDriver driver) {
        super(driver);
    }

    @Step("Verify that welcome user header text contains \"{0}\"")
    public WelcomeUserVerifyController welcomeUserHeaderTextContains(String welcomeHeaderText) {
        Assert.assertTrue(getDriver()
                         .findElement(By.xpath("//div[@id='rightPanel']/h1[starts-with(text(),'" + welcomeHeaderText +"')]"))
                         .getText()
                         .contains(welcomeHeaderText)
        );
        return this;
    }

    @Step("Verify that welcome user message text contains \"{0}\"")
    public WelcomeUserVerifyController welcomeUserMessageTextEquals(String welcomeMessageText) {
        Assert.assertTrue(getDriver()
                        .findElement(By.xpath("//div[@id='rightPanel']/p[contains(text(),'" + welcomeMessageText + "')]"))
                        .getText()
                        .contains(welcomeMessageText)
        );
        return this;
    }
}
