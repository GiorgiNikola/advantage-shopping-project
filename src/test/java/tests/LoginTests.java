package tests;

import POM.data.Constants;
import POM.steps.AccountCreationSteps;
import POM.steps.LoginSteps;
import POM.steps.NavigationSteps;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Epic("User Management")
@Feature("Login and Registration")
public class LoginTests extends ConfigTests{
    NavigationSteps navigationSteps;
    LoginSteps loginSteps;
    AccountCreationSteps accountCreationSteps;
    @BeforeClass
    public void pageSetup(){
        navigationSteps = new NavigationSteps();
        loginSteps = new LoginSteps();
        accountCreationSteps = new AccountCreationSteps();
    }
    @BeforeMethod
    public void setup(){
        open(Constants.advantageShoppingLink);
    }

    @Test
    @Story("Account Creation")
    @Description("Test for creating a new user account.")
    @Severity(SeverityLevel.CRITICAL)
    public void accountCreationTest(){
        navigationSteps
                .clickUserMenu();
        loginSteps
                .clickCreateAccount();
        accountCreationSteps
                .fillUsername(Constants.randomUsername)
                .fillEmail(Constants.randomEmail)
                .fillPassword(Constants.randomPassword)
                .fillConfirmPassword(Constants.randomPassword)
                .fillFirstname(Constants.randomFirstName)
                .fillLastname(Constants.randomLastName)
                .fillPhoneNumber(Constants.randomPhone)
                .selectCountry(Constants.country)
                .fillCity(Constants.randomCity)
                .fillAddress(Constants.randomAddress)
                .fillState(Constants.randomState)
                .fillPostalCode(Constants.randomPostalCode)
                .agreeTermsConditionsCheckbox()
                .clickRegisterBtn();
        navigationSteps
                .validateName(Constants.randomUsername);
    }

    @Test
    @Story("User Login")
    @Description("Test for logging in with valid credentials.")
    @Severity(SeverityLevel.BLOCKER)
    public void userLoginValidCredentials(){
        navigationSteps
                .clickUserMenu();
        loginSteps
                .enterUsername(Constants.validUsername)
                .enterPassword(Constants.validPassword)
                .clickSignIn();
    }

    @Test
    @Story("User Login")
    @Description("Test for logging in with invalid credentials.")
    @Severity(SeverityLevel.NORMAL)
    public void userLoginInvalidCredentials(){
        navigationSteps
                .clickUserMenu();
        loginSteps
                .enterUsername(Constants.invalidUsername)
                .enterPassword(Constants.invalidPassword)
                .clickSignIn()
                .validateSignInResultMessage(Constants.invalidCredentialsMessage);
    }
}
