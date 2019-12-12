package com.parasoft.qa.pages.bodyrightpanel.register;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//@SuppressWarnings({"UnusedReturnValue", "unused"})
public class RegisterUserVerifyController extends BasePage {

    RegisterUserVerifyController(WebDriver driver) {
        super(driver);
    }

    public RegisterUserVerifyController headerTextContains(String registerHeaderText){
        Assert.assertEquals(getDriver().findElement(By.xpath("//div[@id='rightPanel']/h1[contains(text(),'Signing up is easy!')]")).getText(),registerHeaderText);
        return this;
    }
}
