package stepdefinitions;

import core.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.ConfigReader;

public class CommonSteps {
    private WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("user is on the Pet Store landing page")
        public void user_landing_to_pet_store() {
            driver.get(ConfigReader.getProperty("url"));
    }
        @Then("Welcome content should be visible on homepage")
        public void welcome_content_should_be_visible() {
            Assert.assertTrue(homePage.isWelcomeBannerVisible());
        }
}
