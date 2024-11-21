package POM.steps;

import POM.pages.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Step("Click on 'CREATE NEW ACCOUNT' button")
    public LoginSteps clickCreateAccount() {
        loginPage.createAccountBtn.shouldBe(Condition.clickable).click();
        return this;
    }

    @Step("Enter username: {username}")
    public LoginSteps enterUsername(String username) {
        loginPage.usernameField.sendKeys(username);
        return this;
    }

    @Step("Enter password")
    public LoginSteps enterPassword(String password) {
        loginPage.passwordField.sendKeys(password);
        return this;
    }

    @Step("Click on 'SIGN IN' button")
    public LoginSteps clickSignIn() {
        loginPage.signInBtn.click();
        return this;
    }

    @Step("Validate sign-in result message: {message}")
    public LoginSteps validateSignInResultMessage(String message) {
        loginPage.signInResultMessage.shouldBe(Condition.text(message));
        return this;
    }
}