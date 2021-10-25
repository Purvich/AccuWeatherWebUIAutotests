package Pages;

import com.codeborne.selenide.*;
import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import static com.codeborne.selenide.Selenide.*;

public class AddApplicationPage {

    private final SelenideElement inputAppName = $(By.xpath("//input[@id='edit-human']"));

    @Step("Fill name application 'TestApplication'")
    public AddApplicationPage fillNameApplication(String applicationName) {
        inputAppName.sendKeys(applicationName);
        return this;
    }

    private final SelenideElement attributeWhereApisUsed = $(By.name("attribute_where_apis_used"));

    @Step("In the section 'Where the API will be used' select 'Desktop Website'")
    public AddApplicationPage selectAttributeWhereApisUsed(String attribute) {
        new Select(attributeWhereApisUsed).selectByVisibleText(attribute);
        return this;
    }

    private final SelenideElement checkBoxPartnerApp = $(By.xpath("//input[@value='weatherapp']"));

    @Step("In the What will you create with this API section, select 'Weather App'")
    public AddApplicationPage selectCheckBoxPartnerApp() {
        checkBoxPartnerApp.click();
        return this;
    }

    private final SelenideElement buttonCreateApp = $(By.xpath("//button[@value='Create App']"));

    @Step("Click on button 'Create App'")
    public MyApplicationsPage clickOnCreateApp() {
        buttonCreateApp.click();
        return page(MyApplicationsPage.class);
    }
}