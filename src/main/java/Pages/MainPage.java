package Pages;

import com.codeborne.selenide.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.*;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.*;

public class MainPage {

    private static final String BASE_URL = "https://developer.accuweather.com/";
    private static final String LOGIN = "testerpurvich@yandex.ru";
    private static final String PASSWORD = "GeekBrains2021!";

    private final SelenideElement buttonToOpenTheAuthorizationWindow = $(By.xpath("//a[text()='Login']"));
    private final SelenideElement inputUsername = $(By.xpath("//input[@id='edit-name']"));
    private final SelenideElement inputPassword = $(By.xpath("//input[@id='edit-pass']"));
    private final SelenideElement buttonLogin = $(By.xpath("//button[@id='edit-submit']"));
    private final SelenideElement buttonMyAppsOnNavigationMenu = $(By
            .xpath("//ul[contains(@class,'hidden-xs')]//a[text()='My Apps']"));

    @Step("Open AccuWeather site")
    public MainPage openSite() {
        open(BASE_URL);
        return this;
    }

    @Step("Login to the site")
    public MainPage authorization() {
        buttonToOpenTheAuthorizationWindow.click();
        inputUsername.sendKeys(LOGIN);
        inputPassword.sendKeys(PASSWORD);
        buttonLogin.click();
        return this;
    }

    @Step("Click on the login button to open a window for authorization")
    public MainPage clickOnTheButtonToOpenTheAuthorizationWindow() {
        buttonToOpenTheAuthorizationWindow.click();
        return this;
    }

    @Step("Filling in the login field")
    public MainPage fillInputLogin(String login) {
        inputUsername.sendKeys(login);
        return this;
    }

    @Step("Click on the password field")
    public MainPage clickOnPasswordField() {
        inputPassword.click();
        return this;
    }

    @Step("Filling in the password field")
    public MainPage fillInputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    @Step("Click on the button 'Login'")
    public MainPage clickOnTheButtonLogin() {
        buttonLogin.click();
        return this;
    }

    @Step("Go to my applications page")
    public MyApplicationsPage goToMyApplicationsPage() {
        buttonMyAppsOnNavigationMenu.click();
        return page(MyApplicationsPage.class);
    }

    private final SelenideElement authorizationErrorMessage = $(By.xpath("//h4[text()='Error message']"));

    @Step("Verification of error message")
    public MainPage checkingTheAuthorizationErrorMessage() {
        assertThat(authorizationErrorMessage, hasText("Error message"));
        return this;
    }

    private final SelenideElement successfulAuthorizationMessage = $(By.xpath("//a[text()='Logout']"));

    @Step("Checking messages about successful authorization")
    public MainPage checkingMessagesAboutSuccessfulAuthorization() {
        successfulAuthorizationMessage.shouldBe(Condition.visible);
        return this;
    }
}