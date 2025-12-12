package stepdefinitions;

import core.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class CartSteps {

    private WebDriver driver = DriverFactory.getDriver();
    private HomePage homePage= new HomePage(driver);

    @When("user select category")
    public void user_select_category() {
        homePage.clickCategoryByName("FISH");
    }
    @And("user select product")
    public void user_select_product() {
        homePage.clickProductByName("Angelfish");
    }
    @Then("user select item and added it to cart")
    public void user_select_item_and_add_to_cart() {
        homePage.clickAddToCartByDescription("Large Angelfish");
    }


}
