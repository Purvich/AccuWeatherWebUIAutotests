package baseTestAndStepsDefinition;

import Pages.MainPage;
import io.cucumber.java.en.*;

public class StepsDefinitionForAuthorization {

    private static final String LOGIN = "testerforjava@mail.ru";
    private final String INCORRECT_LOGIN = "Tester";
    private static final String PASSWORD = "mOrg9HGfkn";
    private static final String INCORRECT_PASSWORD = "Tester";

    @Given("Open site")
    public void openSite() {
        new MainPage().openSite();
    }

    @When("Click on the login button to open the authorization window")
    public void openingTheAuthorizationWindow() {
        new MainPage().clickOnTheButtonToOpenTheAuthorizationWindow();
    }

    @And("Fill input Login")
    public void fillInputLogin() {
        new MainPage().fillInputLogin(LOGIN);
    }

    @And("Fill input Login with incorrect data")
    public void fillInputLoginWithIncorrectData() {
        new MainPage().fillInputLogin(INCORRECT_LOGIN);
    }

    @And("Click on Password field")
    public void clickOnPasswordField() {
        new MainPage().clickOnPasswordField();
    }

    @And("Fill input Password with incorrect data")
    public void fillInputPasswordWithIncorrectData() {
        new MainPage().fillInputPassword(INCORRECT_PASSWORD);
    }

    @And("Fill input Password")
    public void fillInputPassword() {
        new MainPage().fillInputPassword(PASSWORD);
    }

    @And("Click on button \"Login\"")
    public void clickOnButtonLogin() {
        new MainPage().clickOnTheButtonLogin();
    }

    @Then("Check success authorization")
    public void checkSuccessAuthorization() {
        new MainPage().checkingMessagesAboutSuccessfulAuthorization();
    }

    @Then("Authorization error check")
    public void checkErrorAuthorization() {
        new MainPage().checkingTheAuthorizationErrorMessage();
    }
}
