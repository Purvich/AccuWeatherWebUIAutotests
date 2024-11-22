package accuweather.utils;

import static com.codeborne.selenide.Selenide.open;

import io.qameta.allure.Step;

public class WebUtils {

  @Step(value = "Open URL: {0}")
  public static void openUrl(String url) {
    open(url);
  }
}
