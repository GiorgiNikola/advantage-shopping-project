package POM.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class AccountCreationPage {
    public SelenideElement
        usernameField = $(byName("usernameRegisterPage")),
        emailField = $(byName("emailRegisterPage")),
        passwordField = $(byName("passwordRegisterPage")),
        confirmPasswordField = $(byName("confirm_passwordRegisterPage")),
        firstnameField = $(byName("first_nameRegisterPage")),
        lastnameField = $(byName("last_nameRegisterPage")),
        phoneNumberField = $(byName("phone_numberRegisterPage")),
        countrySelect = $(byName("countryListboxRegisterPage")),
        cityField = $(byName("cityRegisterPage")),
        addressField = $(byName("addressRegisterPage")),
        postalCodeField = $(byName("postal_codeRegisterPage")),
        stateField = $(byName("state_/_province_/_regionRegisterPage")),
        termsAndConditionsCheckbox = $(byName("i_agree")),
        registerBtn = $(byId("register_btn"));
}
