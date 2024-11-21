package POM.steps;

import POM.pages.NavigationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class NavigationSteps {
    NavigationPage navigationPage = new NavigationPage();

    @Step("Click user menu button")
    public NavigationSteps clickUserMenu(){
        navigationPage.userMenuBtn.click();
        return this;
    }

    @Step("Validate profile name: {name}")
    public NavigationSteps validateName(String name){
        navigationPage.profileName.shouldBe(Condition.text(name));
        return this;
    }
}
