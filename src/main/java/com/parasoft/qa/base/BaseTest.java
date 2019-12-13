package com.parasoft.qa.base;

import com.parasoft.qa.util.driverManagers.DriverManager;
import com.parasoft.qa.util.driverManagers.DriverManagerFactory;
import com.parasoft.qa.util.driverManagers.DriverType;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    private String baseUrl = "https://parabank.parasoft.com/";
    //Need to load driver options from a configuration file or Maven command
    @BeforeSuite
    public void beforeSuite() {
        Log.info("Setting up test page and getting base url: " + baseUrl);
        DriverManager driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        this.driver = driverManager.getWebDriver();
        driver.get(baseUrl);
    }

    @AfterSuite
    public void afterSuite() {
        Log.info("Clean up test suite and close driver.");
        this.driver.close();
    }

    protected WebDriver getDriver() {
        return this.driver;
    }


}