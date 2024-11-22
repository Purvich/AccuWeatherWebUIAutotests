package accuweather.cucumberStepsDefinition;

import accuweather.data.ApplicationData;
import accuweather.data.BaseData;
import accuweather.data.LoginModalDialogElements;
import accuweather.data.LoginPageButtons;
import accuweather.data.LoginPageData;
import accuweather.pages.addApplicationPage.AddApplicationPage;
import accuweather.pages.loginPage.ModalLoginPage;
import accuweather.pages.loginPage.NavigationBarPage;
import accuweather.pages.myApplicationPage.MyApplicationsPage;
import accuweather.pages.myApplicationPage.MyApplicationsPageAsserts;
import accuweather.utils.WebUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForCreatingAndDeletingAnApplication {

  private final NavigationBarPage navigationBarPage = new NavigationBarPage();
  private final ModalLoginPage modalLoginPage = new ModalLoginPage();
  private final MyApplicationsPage myApplicationsPage = new MyApplicationsPage();
  private final MyApplicationsPageAsserts myApplicationPageAsserts = new MyApplicationsPageAsserts();
  private final AddApplicationPage addApplicationPage = new AddApplicationPage();

  @Given("Authorization")
  public void authorization() {
    WebUtils.openUrl(BaseData.BASE_URL);
    navigationBarPage.clickOnTheButtonInNavigationBar(LoginPageButtons.LOGIN_BUTTON);
    modalLoginPage
        .fillInputInLoginModalDialog(LoginModalDialogElements.USERNAME_INPUT, LoginPageData.CORRECT_LOGIN)
        .fillInputInLoginModalDialog(LoginModalDialogElements.PASSWORD_INPUT, LoginPageData.CORRECT_PASSWORD)
        .clickOnTheButtonInLoginModalDialog(LoginModalDialogElements.LOG_IN_BUTTON);
  }

  @When("Click on button 'MY APPS' on navigation menu")
  public void goToMyApplicationsPage() {
    modalLoginPage.clickOnMyAppsOnNavigationMenu();
  }

  @And("Click on button '+Add a new App'")
  public void goToAddApplicationPage() {
    myApplicationsPage.goToAddApplicationPage();
  }

  @And("Fill Application name")
  public void fillApplicationName() {
    addApplicationPage.fillNameApplication(ApplicationData.APPLICATION_NAME);
  }

  @And("Select where the API will be used")
  public void selectWhereTheApiWillBeUsed() {
    addApplicationPage.selectAttributeWhereApisUsed(ApplicationData.ATTRIBUTE);
  }

  @And("Select what to build with this API")
  public void selectCheckBoxPartnerApp() {
    addApplicationPage.selectCheckBoxPartnerApp();
  }

  @And("Click on button 'Create App'")
  public void clickOnButtonCreateApp() {
    addApplicationPage.clickOnCreateApp();
  }

  @Then("Success message 'App created!' is visible")
  public void successMessageAppCreatedIsVisible() {
    myApplicationPageAsserts.verificationOfSuccessfulApplicationCreation();
  }

  @And("Select Application")
  public void selectApplicationForDeleting() {
    myApplicationsPage.clickOnMyApplication();
  }

  @And("Click on the 'Delete' button in the menu that open")
  public void clickDeleteApplication() {
    myApplicationsPage.clickOnButtonDeleteApplication();
  }

  @And("Confirm the deletion by clicking on the delete button")
  public void confirmDeleteApplication() {
    myApplicationsPage.confirmDeleteApplication();
  }

  @Then("Make sure the app is uninstalled")
  public void successDeleteApplication() {
    myApplicationPageAsserts.verificationOfSuccessfulApplicationDeleting();
  }
}
