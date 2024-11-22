package accuweather.pages.loginPage;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Locators {

  protected SelenideElement getElementByText(String button) {
    return $(By.xpath("//*[text()='" + button + "']"));
  }

  protected SelenideElement getElementById(String button) {
    return $(By.xpath("//*[@id='" + button + "']"));
  }

  protected final SelenideElement buttonMyAppsOnNavigationMenu = $(
      By.xpath("//ul[contains(@class,'hidden-xs')]//a[text()='My Apps']"));
}
