package selenide.authorization.negative;

import baseTestAndStepsDefinition.BaseTest;
import Pages.MainPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class AuthorizationWithEmptyLoginAndPasswordFieldsTest extends BaseTest {
    @Test
    @Description("Authorization with empty fields login and password")
    void emptyFieldsLoginAndPassword() {
        new MainPage()
                .clickOnTheButtonToOpenTheAuthorizationWindow()
                .clickOnTheButtonLogin()
                .checkingTheAuthorizationErrorMessage();
    }
}
