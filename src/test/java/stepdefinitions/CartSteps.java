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

    @When("user select category {string}")
    public void user_select_category(String categoryName) {
        homePage.clickCategoryByName(categoryName);
    }
    @And("user select product {string}")
    public void user_select_product(String productName) {
        homePage.clickProductByName(productName);
    }
    @Then("user select item {string} and added it to cart")
    public void user_select_item_and_add_to_cart(String itemDescription) {
        homePage.clickAddToCartByDescription(itemDescription);
    }


}
