package POM.steps;

import POM.pages.AccountCreationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class AccountCreationSteps {
    AccountCreationPage accountCreationPage = new AccountCreationPage();

    @Step("Fill in the username: {username}")
    public AccountCreationSteps fillUsername(String username) {
        if (username.length() > 15) username = username.substring(0, 15);
        accountCreationPage.usernameField.shouldBe(Condition.visible).sendKeys(username);
        return this;
    }

    @Step("Fill in the email: {email}")
    public AccountCreationSteps fillEmail(String email) {
        accountCreationPage.emailField.sendKeys(email);
        return this;
    }

    @Step("Fill in the password")
    public AccountCreationSteps fillPassword(String password) {
        accountCreationPage.passwordField.sendKeys(password);
        return this;
    }

    @Step("Fill in the confirm password")
    public AccountCreationSteps fillConfirmPassword(String password) {
        accountCreationPage.confirmPasswordField.sendKeys(password);
        return this;
    }

    @Step("Fill in the first name: {firstname}")
    public AccountCreationSteps fillFirstname(String firstname) {
        accountCreationPage.firstnameField.sendKeys(firstname);
        return this;
    }

    @Step("Fill in the last name: {lastname}")
    public AccountCreationSteps fillLastname(String lastname) {
        accountCreationPage.lastnameField.sendKeys(lastname);
        return this;
    }

    @Step("Fill in the phone number: {phoneNumber}")
    public AccountCreationSteps fillPhoneNumber(String phoneNumber) {
        accountCreationPage.phoneNumberField.sendKeys(phoneNumber);
        return this;
    }

    @Step("Select country: {country}")
    public AccountCreationSteps selectCountry(String country) {
        accountCreationPage.countrySelect.selectOption(country);
        return this;
    }

    @Step("Fill in the city: {city}")
    public AccountCreationSteps fillCity(String city) {
        accountCreationPage.cityField.sendKeys(city);
        return this;
    }

    @Step("Fill in the address: {address}")
    public AccountCreationSteps fillAddress(String address) {
        accountCreationPage.addressField.sendKeys(address);
        return this;
    }

    @Step("Fill in the state: {state}")
    public AccountCreationSteps fillState(String state) {
        accountCreationPage.stateField.sendKeys(state);
        return this;
    }

    @Step("Fill in the postal code: {postalCode}")
    public AccountCreationSteps fillPostalCode(String postalCode) {
        accountCreationPage.postalCodeField.sendKeys(postalCode);
        return this;
    }

    @Step("Agree to the terms and conditions")
    public AccountCreationSteps agreeTermsConditionsCheckbox() {
        accountCreationPage.termsAndConditionsCheckbox.setSelected(true);
        return this;
    }

    @Step("Click the register button")
    public AccountCreationSteps clickRegisterBtn() {
        accountCreationPage.registerBtn.click();
        return this;
    }
}