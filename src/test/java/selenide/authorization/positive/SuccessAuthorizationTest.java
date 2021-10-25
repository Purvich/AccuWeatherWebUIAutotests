package selenide.authorization.positive;

import baseTestAndStepsDefinition.BaseTest;
import Pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class SuccessAuthorizationTest extends BaseTest {
    private static final String LOGIN = "testerpurvich@yandex.ru";
    private static final String PASSWORD = "GeekBrains2021!";

    @Test
    @Description("Success login in AccuWeather")
    void successLogin() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .fillInputLogin(LOGIN)
                .clickOnPasswordField()
                .fillInputPassword(PASSWORD)
                .clickOnTheButtonLogin()
                .checkingMessagesAboutSuccessfulAuthorization();
    }
}
