package accuweather.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * WebDriverFactory is a utility class that provides a thread-safe instance of WebDriver. It ensures
 * that each thread has its own WebDriver instance.
 */
public class WebDriverFactory {

  private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

  private WebDriverFactory() {
  }

  /**
   * Returns the WebDriver instance for the current thread. If no instance exists, a new
   * ChromeDriver is created and set for the current thread.
   *
   * @return the WebDriver instance for the current thread
   */
  public static WebDriver getDriver() {
    if (driverThreadLocal.get() == null) {
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("start-maximized");
      driverThreadLocal.set(new ChromeDriver(options));
    }
    return driverThreadLocal.get();
  }

  /**
   * Closes the WebDriver instance for the current thread, if it exists. This method ensures that
   * the WebDriver instance is properly closed and removed from the ThreadLocal storage.
   */
  public static void closeDriver() {
    WebDriver driver = driverThreadLocal.get();
    if (driver != null) {
      try {
        driver.quit();
      } finally {
        driverThreadLocal.remove();
      }
    }
  }
}
