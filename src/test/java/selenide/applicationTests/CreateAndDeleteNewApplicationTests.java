package selenide.applicationTests;

import accuweather.data.ApplicationData;
import accuweather.data.BaseData;
import accuweather.data.LoginModalDialogElements;
import accuweather.data.LoginPageButtons;
import accuweather.utils.WebUtils;
import base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import testData.LoginTestData;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CreateAndDeleteNewApplicationTests extends BaseTest {

  @BeforeEach
  public void preconditionOpenSite() {
    WebUtils.openUrl(BaseData.BASE_URL);
  }

  @Test
  @Order(1)
  @Description("Check create new Application")
  public void checkCreateNewApplication() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.USERNAME_INPUT, LoginTestData.CORRECT_LOGIN)
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.PASSWORD_INPUT, LoginTestData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON)
        .clickOnMyAppsOnNavigationMenu();
    myApplicationsPage.goToAddApplicationPage();
    addApplicationPage
        .fillNameApplication(ApplicationData.APPLICATION_NAME)
        .selectAttributeWhereApisUsed(ApplicationData.ATTRIBUTE)
        .selectCheckBoxPartnerApp()
        .clickOnCreateApp();
    myApplicationPageAsserts.verificationOfSuccessfulApplicationCreation();
  }

  @Test()
  @Order(2)
  @Description("Check delete Application")
  public void checkDeleteApplication() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.USERNAME_INPUT, LoginTestData.CORRECT_LOGIN)
        .fillInputInLoginModalDialog(
            LoginModalDialogElements.PASSWORD_INPUT, LoginTestData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON)
        .clickOnMyAppsOnNavigationMenu();
    myApplicationsPage
        .clickOnMyApplication()
        .clickOnButtonDeleteApplication()
        .confirmDeleteApplication();
    myApplicationPageAsserts.verificationOfSuccessfulApplicationDeleting();
  }
}
