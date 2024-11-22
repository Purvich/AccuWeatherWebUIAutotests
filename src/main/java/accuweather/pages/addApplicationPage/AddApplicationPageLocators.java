package accuweather.pages.addApplicationPage;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class AddApplicationPageLocators {

  protected final SelenideElement inputAppName = $(By.xpath("//input[@id='edit-human']"));
  protected final SelenideElement attributeWhereApisUsed = $(By.name("attribute_where_apis_used"));
  protected final SelenideElement checkBoxPartnerApp = $(By.xpath("//input[@value='weatherapp']"));
  protected final SelenideElement buttonCreateApp = $(By.xpath("//button[@value='Create App']"));
}
