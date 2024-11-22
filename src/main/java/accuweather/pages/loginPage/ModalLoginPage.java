package accuweather.pages.loginPage;

import accuweather.data.LoginModalDialogElements;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class ModalLoginPage {

  private final Locators locators = new Locators();

  @Step("Fill '{element}' input with the value: '{value}' in Login modal dialog")
  public ModalLoginPage fillInputInLoginModalDialog(LoginModalDialogElements element, String value) {
    locators.getElementById(element.getId()).click();
    locators.getElementById(element.getId()).sendKeys(value);
    return this;
  }

  @Step(value = "Click on the button 'Login'")
  public ModalLoginPage clickOnTheButtonInLoginModalDialog(LoginModalDialogElements element) {
    locators.getElementById(element.getId()).click();
    return this;
  }

  @Step(value = "Go to my applications page")
  public ModalLoginPage clickOnMyAppsOnNavigationMenu() {
    locators.buttonMyAppsOnNavigationMenu.click();
    return this;
  }
}