package com.parasoft.qa.pages.bodyrightpanel.register;

import com.parasoft.qa.base.BasePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

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

    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeCity(String city) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.city']",city);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeState(String state) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.state']",state);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeZipCode(String zipCode) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.zipCode']",zipCode);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typePhone(String phone) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.phoneNumber']",phone);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeSsn(String ssn) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.ssn']",ssn);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeUsername(String username) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.username']",username);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typePassword(String password) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.password']",password);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeConfirmPassword(String confirmPassword) {
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='repeatedPassword']",confirmPassword);
    }

    @Step
    public RegisterUserActController clickRegisterButton() {
        return (RegisterUserActController) this.clickElement("//table[@class='form2']//input[@class='button']");
    }
}
