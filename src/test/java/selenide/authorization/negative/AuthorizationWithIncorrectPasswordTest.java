package selenide.authorization.negative;

import baseTestAndStepsDefinition.BaseTest;
import Pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class AuthorizationWithIncorrectPasswordTest extends BaseTest {
    private static final String LOGIN = "testerpurvich@yandex.ru";
    private static final String INCORRECT_PASSWORD = "Tester";

    @Test
    @Description("Authorization with wrong password")
    void incorrectPassword() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .fillInputLogin(LOGIN)
                .clickOnPasswordField()
                .fillInputPassword(INCORRECT_PASSWORD)
                .clickOnTheButtonLogin()
                .checkingTheAuthorizationErrorMessage();
    }
}
