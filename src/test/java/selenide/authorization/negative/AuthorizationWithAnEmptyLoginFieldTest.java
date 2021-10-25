package selenide.authorization.negative;

import Pages.MainPage;
import baseTestAndStepsDefinition.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class AuthorizationWithAnEmptyLoginFieldTest extends BaseTest {
    private static final String PASSWORD = "GeekBrains2021!";

    @Test
    @Description("Authorization without login")
    void emptyFieldLogin() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .clickOnPasswordField()
                .fillInputPassword(PASSWORD)
                .clickOnTheButtonLogin()
                .checkingTheAuthorizationErrorMessage();
    }
}
