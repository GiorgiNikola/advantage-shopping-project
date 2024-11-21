package POM.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            createAccountBtn = $(".create-new-account.ng-scope")
            ,usernameField = $(byName("username"))
            ,passwordField = $(byName("password"))
            ,signInBtn = $(byId("sign_in_btn"))
            ,signInResultMessage = $(byId("signInResultMessage"));
}
