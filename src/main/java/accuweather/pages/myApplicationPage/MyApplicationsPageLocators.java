package accuweather.pages.myApplicationPage;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class MyApplicationsPageLocators {

  protected final SelenideElement buttonAddANewApp = $(By.xpath("//a[@class='add-app']"));
  protected final SelenideElement successMessageAppCreatedIsVisible = $(
      By.xpath("//div[text()='App Created!']"));
  protected final SelenideElement myApplication = $(By.xpath("//div[@class='truncate']/a"));
  protected final SelenideElement buttonDeleteMyApplication = $(
      By.xpath("//li[@class='hidden-xs apigee-modal-link-delete']/a"));
  protected final SelenideElement buttonConfirmDeletionApplication = $(
      By.xpath("//button[@value='Delete App']"));
  protected final SelenideElement successDeletingApplication = $(
      By.xpath("//span[text()='Explore them!']"));
}
