package baseTestAndStepsDefinition;

import Pages.AddApplicationPage;
import Pages.MainPage;
import Pages.MyApplicationsPage;
import io.cucumber.java.en.*;

public class StepsDefinitionForCreatingAndDeletingAnApplication {

    private static final String APPLICATION_NAME = "TestApplication";
    private static final String ATTRIBUTE = "Desktop Website";

    @Given("Authorization")
    public void authorization() {
        new MainPage()
                .openSite()
                .authorization();
    }

    @When("Click on button 'MY APPS' on navigation menu")
    public void goToMyApplicationsPage() {
        new MainPage().goToMyApplicationsPage();
    }

    /**
     * Для создания приложения
     */

    @And("Click on button '+Add a new App'")
    public void goToAddApplicationPage() {
        new MyApplicationsPage().goToAddApplicationPage();
    }

    @And("Fill Application name")
    public void fillApplicationName() {
        new AddApplicationPage().fillNameApplication(APPLICATION_NAME);
    }

    @And("Select where the API will be used")
    public void selectWhereTheApiWillBeUsed() {
        new AddApplicationPage().selectAttributeWhereApisUsed(ATTRIBUTE);
    }

    @And("Select what to build with this API")
    public void selectCheckBoxPartnerApp() {
        new AddApplicationPage().selectCheckBoxPartnerApp();
    }

    @And("Click on button 'Create App'")
    public void clickOnButtonCreateApp() {
        new AddApplicationPage().clickOnCreateApp();
    }

    @Then("Success message 'App created!' is visible")
    public void successMessageAppCreatedIsVisible() {
        new MyApplicationsPage().verificationOfSuccessfulApplicationCreation();
    }

    /**
     * Для удаления
     */

    @And("Select Application")
    public void selectApplicationForDeleting() {
        new MyApplicationsPage().clickOnMyApplication();
    }

    @And("Click on the 'Delete' button in the menu that open")
    public void clickDeleteApplication() {
        new MyApplicationsPage().clickOnButtonDeleteApplication();
    }

    @And("Confirm the deletion by clicking on the delete button")
    public void confirmDeleteApplication() {
        new MyApplicationsPage().confirmDeleteApplication();
    }

    @Then("Make sure the app is uninstalled")
    public void successDeleteApplication() {
        new MyApplicationsPage().verificationOfSuccessfulApplicationDeleting();
    }
}
