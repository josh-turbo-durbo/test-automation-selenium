package com.parasoft.qa.pages.bodyrightpanel.register;

import com.parasoft.qa.base.BasePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class RegisterUserActController extends BasePage {

    RegisterUserActController(WebDriver driver) {
        super(driver);
    }

    //FirstName
    public RegisterUserActController typeFirstName(String firstName) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.firstName']",firstName);
    }

    //LastName
    public RegisterUserActController typeLastName(String lastName) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.lastName']",lastName);
    }

    //Address
    public RegisterUserActController typeAddress(String address) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.street']",address);
    }

    //City
    public RegisterUserActController typeCity(String city) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.city']",city);
    }

    //State
    public RegisterUserActController typeState(String state) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.state']",state);
    }

    //zipCode
    public RegisterUserActController typeZipCode(String zipCode) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.zipCode']",zipCode);
    }

    //Phone
    public RegisterUserActController typePhone(String phone) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.phoneNumber']",phone);
    }

    //SSN
    public RegisterUserActController typeSsn(String ssn) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.ssn']",ssn);
    }

    //Username
    public RegisterUserActController typeUsername(String username) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.username']",username);
    }

    //Password
    public RegisterUserActController typePassword(String password) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.password']",password);
    }

    //confirmPassword
    public RegisterUserActController typeConfirmPassword(String confirmPassword) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='repeatedPassword']",confirmPassword);
    }

    //clickRegisterButton
    public RegisterUserActController clickRegisterButton() {
        return (RegisterUserActController) this.clickElement("//table[@class='form2']//input[@class='button']");
    }
}
