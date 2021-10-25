package selenide.creatingANewApplication;

import baseTestAndStepsDefinition.BaseTest;
import Pages.*;
import Pages.MyApplicationsPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

public class CreatingANewApplicationTest extends BaseTest {
    private static final String APPLICATION_NAME = "TestApplication";
    private static final String ATTRIBUTE = "Desktop Website";

    @Test
    @Description("Test of creating a new application")
    void creatingNewApplication() {
        new MainPage()
                .authorization()
                .goToMyApplicationsPage();
        new MyApplicationsPage()
                .goToAddApplicationPage();
        new AddApplicationPage()
                .fillNameApplication(APPLICATION_NAME)
                .selectAttributeWhereApisUsed(ATTRIBUTE)
                .selectCheckBoxPartnerApp()
                .clickOnCreateApp();
        new MyApplicationsPage()
                .verificationOfSuccessfulApplicationCreation();
    }
}
