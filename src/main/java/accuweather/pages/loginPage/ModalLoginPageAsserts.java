package accuweather.pages.loginPage;

import accuweather.data.LoginPageButtons;
import accuweather.data.MessagePageData;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class ModalLoginPageAsserts {

  private final Locators locators = new Locators();

  @Step(value = "Verification of error message")
  public ModalLoginPageAsserts checkingTheAuthorizationErrorMessageIsVisible() {
    locators.getElementByText(MessagePageData.ERROR_MESSAGE).shouldBe(Condition.visible);
    return this;
  }

  @Step(value = "Check 'Logout' button in Navigation bar is visible")
  public ModalLoginPageAsserts checkButtonInNavigationBarIsVisible(LoginPageButtons button) {
    locators.getElementByText(button.getValue()).shouldBe(Condition.visible);
    return this;
  }
}
