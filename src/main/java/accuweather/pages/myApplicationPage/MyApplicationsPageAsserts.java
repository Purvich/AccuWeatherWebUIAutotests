package accuweather.pages.myApplicationPage;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class MyApplicationsPageAsserts {

  private final MyApplicationsPageLocators locators = new MyApplicationsPageLocators();

  @Step("Verification of successful application creation")
  public MyApplicationsPageAsserts verificationOfSuccessfulApplicationCreation() {
    locators.successMessageAppCreatedIsVisible.shouldBe(Condition.visible);
    return this;
  }

  public MyApplicationsPageAsserts verificationOfSuccessfulApplicationDeleting() {
    locators.successDeletingApplication.shouldBe(Condition.visible);
    return this;
  }
}
