package com.parasoft.qa.util.driverManagers;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IeDriverManager extends DriverManager {

    @Override
    public void createWebDriver() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        //set browser-specific options here
        this.driver = new InternetExplorerDriver(options);
    }

}
