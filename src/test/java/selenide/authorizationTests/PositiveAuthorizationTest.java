package selenide.authorizationTests;

import accuweather.data.LoginData;
import base.BaseTest;
import accuweather.pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class PositiveAuthorizationTest extends BaseTest {

    @Test
    @Description("Success login in AccuWeather")
    void successLogin() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .fillInputLogin(LoginData.LOGIN)
                .clickOnPasswordField()
                .fillInputPassword(LoginData.PASSWORD)
                .clickOnTheButtonLogin()
                .checkingMessagesAboutSuccessfulAuthorization();
    }
}
