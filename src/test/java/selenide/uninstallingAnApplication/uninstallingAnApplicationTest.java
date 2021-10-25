package selenide.uninstallingAnApplication;

import Pages.*;
import baseTestAndStepsDefinition.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class uninstallingAnApplicationTest extends BaseTest {

    @Test
    @Description("Application uninstall test")
    void deletingApplication() {
        new MainPage()
                .authorization()
                .goToMyApplicationsPage();
        new MyApplicationsPage()
                .clickOnMyApplication()
                .clickOnButtonDeleteApplication()
                .confirmDeleteApplication()
                .verificationOfSuccessfulApplicationDeleting();
    }
}
