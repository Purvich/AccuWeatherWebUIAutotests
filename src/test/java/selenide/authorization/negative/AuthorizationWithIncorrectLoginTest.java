package selenide.authorization.negative;

import baseTestAndStepsDefinition.BaseTest;
import Pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class AuthorizationWithIncorrectLoginTest extends BaseTest {
    private final String INCORRECT_LOGIN = "Tester";
    private static final String PASSWORD = "GeekBrains2021!";

    @Test
    @Description("Authorization with wrong login")
    void incorrectLogin() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .fillInputLogin(INCORRECT_LOGIN)
                .clickOnPasswordField()
                .fillInputPassword(PASSWORD)
                .clickOnTheButtonLogin()
                .checkingTheAuthorizationErrorMessage();
    }
}
