package stepdefinitions;

import core.DriverFactory;
import core.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.RegistrationPage;
import pages.SignInPage;

import java.util.Map;

public class RegisterSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private LandingPage landingPage = new LandingPage(driver);
    private RegistrationPage registrationPage = new RegistrationPage(driver);
    private SignInPage signInPage = new SignInPage(driver);

    @When("user navigate to register screen")
    public void user_navigate_to_register_screen() {
        landingPage.clickSignIn();
        signInPage.clickRegisterNow();
    }

    @And("user register with valid user details")
    public void user_register_with_valid_user_details() {
        Map<String, String> user = TestBase.testUser;
        fillRegistrationForm(user);
    }

    @Then("user submits the form")
    public void user_submits_the_form() {

        registrationPage.clickSaveAccount();
    }

    private void fillRegistrationForm(Map<String, String> user) {
        registrationPage.enterUserId(user.get("userId"));
        registrationPage.enterPassword(user.get("password"));
        registrationPage.enterRepeatPassword(user.get("repeatPassword"));
        registrationPage.enterFirstName(user.get("firstName"));
        registrationPage.enterLastName(user.get("lastName"));
        registrationPage.enterEmail(user.get("email"));
        registrationPage.enterPhone(user.get("phone"));
        registrationPage.enterAddress1(user.get("address1"));
        registrationPage.enterAddress2(user.get("address2"));
        registrationPage.enterCity(user.get("city"));
        registrationPage.enterState(user.get("state"));
        registrationPage.enterZip(user.get("zip"));
        registrationPage.enterCountry(user.get("country"));
        registrationPage.selectLanguage("japanese");
        registrationPage.selectFavouriteCategory("DOGS");
        registrationPage.enableMyList(true);
        registrationPage.enableMyBanner(true);
    }
}
