package selenide.authorizationTests;

import accuweather.data.BaseData;
import accuweather.data.LoginModalDialogElements;
import accuweather.data.LoginPageButtons;
import accuweather.utils.WebUtils;
import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testData.LoginTestData;

public class NegativeAuthorizationTests extends BaseTest {

  @BeforeEach
  public void preconditionOpenSite() {
    WebUtils.openUrl(BaseData.BASE_URL);
  }

  @Test
  @Description("Authorization without login")
  public void emptyFieldLogin() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.PASSWORD_INPUT, LoginTestData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
    modalLoginPageAsserts.checkingTheAuthorizationErrorMessageIsVisible();
  }

  @Test
  @Description("Authorization without password")
  public void emptyFieldPassword() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.USERNAME_INPUT, LoginTestData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
    modalLoginPageAsserts.checkingTheAuthorizationErrorMessageIsVisible();
  }

  @Test
  @Description("Authorization with empty fields login and password")
  public void emptyFieldsLoginAndPassword() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage.clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
    modalLoginPageAsserts.checkingTheAuthorizationErrorMessageIsVisible();
  }

  @Test
  @Description("Authorization with wrong login")
  public void incorrectLogin() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.USERNAME_INPUT, LoginTestData.INCORRECT_LOGIN)
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.PASSWORD_INPUT, LoginTestData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
    modalLoginPageAsserts.checkingTheAuthorizationErrorMessageIsVisible();
  }

  @Test
  @Description("Authorization with wrong password")
  public void incorrectPassword() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.USERNAME_INPUT, LoginTestData.CORRECT_LOGIN)
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.PASSWORD_INPUT, LoginTestData.INCORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
    modalLoginPageAsserts.checkingTheAuthorizationErrorMessageIsVisible();
  }
}
