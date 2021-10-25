package selenide.authorization.negative;

import baseTestAndStepsDefinition.BaseTest;
import Pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class AuthorizationWithAnEmptyPasswordFieldTest extends BaseTest {
    private static final String LOGIN = "testerpurvich@yandex.ru";

    @Test
    @Description("Authorization without password")
    void emptyFieldPassword() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .fillInputLogin(LOGIN)
                .clickOnTheButtonLogin()
                .checkingTheAuthorizationErrorMessage();
    }
}
