package baseTestAndStepsDefinition;

import Pages.MainPage;
import com.codeborne.selenide.*;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class BaseTest {
    @BeforeAll
    @Step("Open browser")
    static void openBrowser() {
        Configuration.timeout = 12000;
        new MainPage()
                .openSite();
    }

    @AfterEach
    @Step("Clearing browser cookies")
    void cleaningCookies() {
        Selenide.clearBrowserCookies();
        Selenide.refresh();
    }
}
