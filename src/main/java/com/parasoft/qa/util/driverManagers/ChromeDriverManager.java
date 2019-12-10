package com.parasoft.qa.util.driverManagers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    @Override
    public void createWebDriver() {
        ChromeOptions options = new ChromeOptions()
                .addArguments(
                        //set browser-specific options here
                        "start-maximized"
                );
        this.driver = new ChromeDriver(options);
    }
}
