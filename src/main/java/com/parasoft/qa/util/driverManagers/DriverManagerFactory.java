package com.parasoft.qa.util.driverManagers;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;
        switch(type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;

            default:
                driverManager = new IeDriverManager();
                break;
        }
        return driverManager;
    }
}
