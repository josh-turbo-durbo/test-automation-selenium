package com.parasoft.qa.util.driverManagers;

import org.openqa.selenium.WebDriver;

import java.lang.invoke.MethodHandles;

public abstract class DriverManager {

    protected WebDriver driver;
    protected abstract void createWebDriver();

    public void quitWebDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getWebDriver() {
        if (null == driver) {
            createWebDriver();
        }
        return driver;
    }
}
