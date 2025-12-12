package stepdefinitions;

import core.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.SignInPage;
import utils.UserDataHelper;

import java.util.Map;

public class LoginSteps {
    UserDataHelper userHelper = new UserDataHelper();
    Map<String, String> userFromJson = userHelper.readUser();
    private WebDriver driver = DriverFactory.getDriver();
    private LandingPage landingPage = new LandingPage(driver);
    private SignInPage signInPage = new SignInPage(driver);

    @When("user navigate to login screen")
    public void user_navigate_to_login_screen() {
        landingPage.clickSignIn();
    }
    @And("user enters valid credentials")
    public void user_enters_valid_credentials() {
        signInPage.enterUserId(userFromJson.get("userId"));
        signInPage.enterPassword(userFromJson.get("password"));
    }
    @And("user clicks login button")
    public void user_clicks_login_button() {
        signInPage.clickLogin();
    }

}
