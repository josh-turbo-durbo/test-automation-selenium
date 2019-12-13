package com.parasoft.qa.pages.bodyrightpanel.register;

import com.parasoft.qa.base.BasePage;
import com.parasoft.qa.util.Log;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

@SuppressWarnings({"UnusedReturnValue", "unused"})
public class RegisterUserActController extends BasePage {

    RegisterUserActController(WebDriver driver) {
        super(driver);
    }

    //FirstName
    public RegisterUserActController typeFirstName(String firstName) {
        Log.info("Type first name");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.firstName']",firstName);
    }

    //LastName
    public RegisterUserActController typeLastName(String lastName) {

        Log.info("Type last name");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.lastName']",lastName);
    }

    //Address
    public RegisterUserActController typeAddress(String address) {
        Log.info("Type address");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.street']",address);
    }

    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeCity(String city) {
        Log.info("Type text box");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.city']",city);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeState(String state) {
        Log.info("Type state");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.state']",state);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeZipCode(String zipCode) {
        Log.info("Type zip code");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.address.zipCode']",zipCode);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typePhone(String phone) {
        Log.info("Type phone");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.phoneNumber']",phone);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeSsn(String ssn) {
        Log.info("Type ssn");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.ssn']",ssn);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeUsername(String username) {
        Log.info("Type username");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.username']",username);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typePassword(String password) {
        Log.info("Type password");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='customer.password']",password);
    }


    @Step("Enter \"{0}\" in city text box.")
    public RegisterUserActController typeConfirmPassword(String confirmPassword) {
        Log.info("Type confirm password");
        return (RegisterUserActController) this.sendKeysToElement("//input[@id='repeatedPassword']",confirmPassword);
    }

    @Step
    public RegisterUserActController clickRegisterButton() {
        Log.info("Click register button");
        return (RegisterUserActController) this.clickElement("//table[@class='form2']//input[@class='button']");
    }
}
