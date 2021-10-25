package Pages;

import com.codeborne.selenide.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;

public class MyApplicationsPage {

    private final SelenideElement buttonAddANewApp = $(By.xpath("//a[@class='add-app']"));

    @Step("Click on button '+ Add new App'")
    public AddApplicationPage goToAddApplicationPage() {
        buttonAddANewApp.click();
        return page(AddApplicationPage.class);
    }

    private final SelenideElement successMessageAppCreatedIsVisible = $(By.xpath("//div[text()='App Created!']"));

    @Step("Verification of successful application creation")
    public MyApplicationsPage verificationOfSuccessfulApplicationCreation() {
        successMessageAppCreatedIsVisible.shouldBe(Condition.visible);
        return this;
    }

    private final SelenideElement myApplication = $(By.xpath("//div[@class='truncate']/a"));

    @Step("Click on the application you want to uninstall")
    public MyApplicationsPage clickOnMyApplication() {
        myApplication.click();
        return this;
    }

    private final SelenideElement buttonDeleteMyApplication = $(By
            .xpath("//li[@class='hidden-xs apigee-modal-link-delete']/a"));

    @Step("In the menu that appears, click the delete button")
    public MyApplicationsPage clickOnButtonDeleteApplication() {
        buttonDeleteMyApplication.click();
        return this;
    }

    private final SelenideElement buttonConfirmDeletionApplication = $(By.xpath("//button[@value='Delete App']"));

    @Step("Confirm Application Removal")
    public MyApplicationsPage confirmDeleteApplication() {
        buttonConfirmDeletionApplication.click();
        return this;
    }

    private final SelenideElement successDeletingApplication = $(By.xpath("//span[text()='Explore them!']"));

    public MyApplicationsPage verificationOfSuccessfulApplicationDeleting() {
        successDeletingApplication.shouldBe(Condition.visible);
        return this;
    }
}