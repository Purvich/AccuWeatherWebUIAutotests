package accuweather.pages.loginPage;

import accuweather.data.LoginPageButtons;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class NavigationBarPage {

  private final Locators locators = new Locators();

  @Step(value = "Click on the login button to open a window for authorization")
  public NavigationBarPage clickOnTheButtonInNavigationBar(LoginPageButtons button) {
    locators.getElementByText(button.getValue()).click();
    return this;
  }
}
