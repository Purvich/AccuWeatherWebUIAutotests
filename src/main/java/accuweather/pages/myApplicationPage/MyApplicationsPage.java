package accuweather.pages.myApplicationPage;

import static com.codeborne.selenide.Selenide.page;

import accuweather.pages.addApplicationPage.AddApplicationPage;
import io.qameta.allure.Step;

@SuppressWarnings("UnusedReturnValue")
public class MyApplicationsPage {

  private final MyApplicationsPageLocators locators = new MyApplicationsPageLocators();

  @Step("Click on button '+ Add new App'")
  public AddApplicationPage goToAddApplicationPage() {
    locators.buttonAddANewApp.click();
    return page(AddApplicationPage.class);
  }

  @Step("Click on the application you want to uninstall")
  public MyApplicationsPage clickOnMyApplication() {
    locators.myApplication.click();
    return this;
  }

  @Step("In the menu that appears, click the delete button")
  public MyApplicationsPage clickOnButtonDeleteApplication() {
    locators.buttonDeleteMyApplication.click();
    return this;
  }

  @Step("Confirm Application Removal")
  public MyApplicationsPage confirmDeleteApplication() {
    locators.buttonConfirmDeletionApplication.click();
    return this;
  }
}