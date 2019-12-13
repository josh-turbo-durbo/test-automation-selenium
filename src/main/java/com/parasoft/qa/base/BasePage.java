package com.parasoft.qa.base;

import com.parasoft.qa.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage<T> {

    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    private WebDriverWait wait;
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, TIMEOUT), this);
    }

    protected WebDriver getDriver() {
        return driver;
    }

    @SuppressWarnings({"unchecked","UnusedReturnValue"})
    protected T clickElement(String xpath)  {
        WebElement webElement = driver.findElement(By.xpath(xpath));
        webElement.click();
        Log.info("\txpath: " + xpath);
        return (T)this;
    }

    @SuppressWarnings({"unchecked","UnusedReturnValue"})
    protected T sendKeysToElement(String xpath, String keysToSend) {
        WebElement webElement = driver.findElement(By.xpath(xpath));
        webElement.sendKeys(keysToSend);
        Log.info("\txpath: " + xpath + "\t\nSend Keys: " + keysToSend);
        return (T)this;
    }



    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }
}