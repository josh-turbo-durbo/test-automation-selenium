package com.parasoft.qa.pages.bodyleftpanel.loginpanel;

import com.parasoft.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPanelActController extends BasePage {

    public LoginPanelActController(WebDriver driver) {
        super(driver);
    }

    //typeUsername
    public LoginPanelActController typeUsername(String username) {
        WebElement usernameTextBox = getDriver().findElement(By.xpath("//div[@id='loginPanel']//div[@class='login']/input[@name='username']"));
        usernameTextBox.sendKeys(username);
        return this;
    }

    //typePassword
    public LoginPanelActController typePassword(String password){
        WebElement passwordTextBox = getDriver().findElement(By.xpath("//div[@id='loginPanel']//div[@class='login']/input[@name='password']"));
        passwordTextBox.sendKeys(password);
        return this;
    }

    //clickLogin
    public void clickLoginButton(){
        WebElement loginButton = getDriver().findElement(By.xpath("//div[@id='loginPanel']//input[@type='submit' and @value='Log In']"));
        loginButton.click();
    }

    //clickAboutUs
    public LoginPanelActController clickAboutUsLink(){
        WebElement aboutUsLink = getDriver().findElement(By.xpath(""));
        aboutUsLink.click();
        return this;
    }

    //clickServices
    public LoginPanelActController clickServicesLink(){
        WebElement servicesLink = getDriver().findElement(By.xpath(""));
        servicesLink.click();
        return this;
    }

    //clickAdminPage
    public LoginPanelActController clickAdminPageLnk(){
        WebElement adminPageLink = getDriver().findElement(By.xpath(""));
        adminPageLink.click();
        return this;
    }

}
