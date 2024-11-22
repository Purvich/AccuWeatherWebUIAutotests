package accuweather.cucumberStepsDefinition;

import accuweather.data.BaseData;
import accuweather.data.LoginModalDialogElements;
import accuweather.data.LoginPageButtons;
import accuweather.data.LoginPageData;
import accuweather.pages.loginPage.ModalLoginPage;
import accuweather.pages.loginPage.ModalLoginPageAsserts;
import accuweather.pages.loginPage.NavigationBarPage;
import accuweather.utils.WebUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;

/**
 * This class contains step definitions for the authorization feature.
 */
public class StepsForAuthorization {

  private final NavigationBarPage navigationBarPage = new NavigationBarPage();
  private final ModalLoginPage modalLoginPage = new ModalLoginPage();
  private final ModalLoginPageAsserts modalLoginPageAsserts = new ModalLoginPageAsserts();

  @Given("Open site")
  @Step("Open site developer.accuweather.com")
  public void openSite() {
    WebUtils.openUrl(BaseData.BASE_URL);
  }

  @When("Click on the login button to open the authorization window")
  public void openingTheAuthorizationWindow() {
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
  }

  @And("Fill input Login")
  public void fillInputLogin() {
    modalLoginPage.fillInputInLoginModalDialog(LoginModalDialogElements.USERNAME_INPUT, LoginPageData.CORRECT_LOGIN);
  }

  @And("Fill input Login with incorrect data")
  public void fillInputLoginWithIncorrectData() {
    modalLoginPage.fillInputInLoginModalDialog(LoginModalDialogElements.USERNAME_INPUT, LoginPageData.INCORRECT_LOGIN);
  }

  @And("Fill input Password with incorrect data")
  public void fillInputPasswordWithIncorrectData() {
    modalLoginPage.fillInputInLoginModalDialog(LoginModalDialogElements.PASSWORD_INPUT, LoginPageData.INCORRECT_PASSWORD);
  }

  @And("Fill input Password")
  public void fillInputPassword() {
    modalLoginPage.fillInputInLoginModalDialog(LoginModalDialogElements.PASSWORD_INPUT, LoginPageData.CORRECT_PASSWORD);
  }

  @And("Click on button \"Login\"")
  public void clickOnButtonLogin() {
    modalLoginPage.clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
  }

  @Then("Check success authorization")
  public void checkSuccessAuthorization() {
    modalLoginPageAsserts.checkButtonInNavigationBarIsVisible(LoginPageButtons.LOGOUT_BUTTON);
  }

  @Then("Authorization error check")
  public void checkErrorAuthorization() {
    modalLoginPageAsserts.checkingTheAuthorizationErrorMessageIsVisible();
  }
}
