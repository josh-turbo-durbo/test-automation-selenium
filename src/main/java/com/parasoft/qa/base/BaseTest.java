package com.parasoft.qa.base;

import com.parasoft.qa.util.driverManagers.DriverManager;
import com.parasoft.qa.util.driverManagers.DriverManagerFactory;
import com.parasoft.qa.util.driverManagers.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    //Need to load driver options from a configuration file or Maven command
    @BeforeSuite
    public void beforeSuite() {
        DriverManager driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        this.driver = driverManager.getWebDriver();
        driver.get("https://parabank.parasoft.com/");
    }

    @AfterSuite
    public void afterSuite() {
        this.driver.close();
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

}