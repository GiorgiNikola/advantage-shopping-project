package POM.data;

import com.github.javafaker.Faker;

public class Constants {
    static Faker faker = new Faker();
    public static final String advantageShoppingLink = "https://advantageonlineshopping.com/#/"
    ,randomUsername = faker.name().username()
    ,randomEmail = faker.internet().emailAddress()
    ,randomPassword = faker.internet().password(8, 11, true,false, true) + "s"
    ,randomFirstName = faker.name().firstName()
    ,randomLastName = faker.name().lastName()
    ,randomPhone = faker.phoneNumber().cellPhone()
    ,randomAddress = faker.address().streetAddress()
    ,randomCity = faker.address().city()
    ,randomPostalCode = faker.address().zipCode()
    ,randomState = "Vake"
    ,country = "Georgia"
    ,validUsername = "TestAccount"
    ,validPassword = "Password1"
    ,invalidUsername = "invalidUser"
    ,invalidPassword = "invalidPass"
    ,invalidCredentialsMessage = "Incorrect user name or password.";
}
