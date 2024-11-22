package selenide.authorizationTests;

import accuweather.data.BaseData;
import accuweather.data.LoginModalDialogElements;
import accuweather.data.LoginPageButtons;
import accuweather.utils.WebUtils;
import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import testData.LoginTestData;

public class PositiveAuthorizationTest extends BaseTest {

  @Test
  @Description("Success login in AccuWeather")
  public void successLogin() {
    WebUtils.openUrl(BaseData.BASE_URL);
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.USERNAME_INPUT, LoginTestData.CORRECT_LOGIN)
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.PASSWORD_INPUT, LoginTestData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
    modalLoginPageAsserts.checkButtonInNavigationBarIsVisible(LoginPageButtons.LOGOUT_BUTTON);
  }
}
