package accuweather.pages.addApplicationPage;

import accuweather.pages.myApplicationPage.MyApplicationsPage;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("UnusedReturnValue")
public class AddApplicationPage {

  private final AddApplicationPageLocators locators = new AddApplicationPageLocators();

  @Step("Fill name application \"TestApplication\"")
  public AddApplicationPage fillNameApplication(String applicationName) {
    locators.inputAppName.sendKeys(applicationName);
    return this;
  }

  @Step("In the section 'Where the API will be used' select \"Desktop Website\"")
  public AddApplicationPage selectAttributeWhereApisUsed(String attribute) {
    new Select(locators.attributeWhereApisUsed).selectByVisibleText(attribute);
    return this;
  }

  @Step("In the What will you create with this API section, select \"Weather App\"")
  public AddApplicationPage selectCheckBoxPartnerApp() {
    locators.checkBoxPartnerApp.click();
    return this;
  }

  @Step("Click on button \"Create App\"")
  public MyApplicationsPage clickOnCreateApp() {
    locators.buttonCreateApp.click();
    return Selenide.page(MyApplicationsPage.class);
  }
}