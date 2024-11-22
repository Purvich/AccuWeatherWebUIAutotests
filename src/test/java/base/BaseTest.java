package base;

import accuweather.pages.addApplicationPage.AddApplicationPage;
import accuweather.pages.loginPage.ModalLoginPage;
import accuweather.pages.loginPage.ModalLoginPageAsserts;
import accuweather.pages.loginPage.NavigationBarPage;
import accuweather.pages.myApplicationPage.MyApplicationsPage;
import accuweather.pages.myApplicationPage.MyApplicationsPageAsserts;
import accuweather.webdriver.WebDriverFactory;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

  protected static final NavigationBarPage navigationBarPage = new NavigationBarPage();
  protected static final ModalLoginPage modalLoginPage = new ModalLoginPage();
  protected static final ModalLoginPageAsserts modalLoginPageAsserts = new ModalLoginPageAsserts();
  protected static final AddApplicationPage addApplicationPage = new AddApplicationPage();
  protected static final MyApplicationsPage myApplicationsPage = new MyApplicationsPage();
  protected static final MyApplicationsPageAsserts myApplicationPageAsserts = new MyApplicationsPageAsserts();

  protected WebDriver driver;

  @BeforeAll
  public static void setupClass() {
    Configuration.browser = "chrome";
    Configuration.startMaximized = true;
  }

  @BeforeEach
  public void setupTest() {
    this.driver = WebDriverFactory.getDriver();
    WebDriverRunner.setWebDriver(driver);
  }

  @AfterEach
  @Step("Clearing browser cookies")
  public void cleaningCookies() {
    WebDriverFactory.closeDriver();
  }

  @AfterAll
  @Step("Close all browsers")
  public static void closeBrowsers() {
    WebDriverRunner.closeWebDriver();
  }
}