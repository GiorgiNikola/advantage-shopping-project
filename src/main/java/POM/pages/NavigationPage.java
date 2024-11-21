package POM.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavigationPage {
    public SelenideElement
            userMenuBtn = $("#menuUser")
            ,profileName = $(".hi-user.containMiniTitle.ng-binding");
}
