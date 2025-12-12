package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By categoryImgTemplate = By.cssSelector("a[href*='categoryId={CATEGORY_NAME}'] img");
    private By productLinkTemplate = By.xpath("//div[@id='Catalog']//td[normalize-space(text())='{PRODUCT_NAME}']/preceding-sibling::td/a");
    private By addToCartTemplate = By.xpath("//table//tr[td[contains(normalize-space(.), '{DESCRIPTION}')]]//a[text()='Add to Cart']");
    private By welcomeContent = By.id("WelcomeContent");


    public void clickCategoryByName(String categoryName) {
        String css = categoryImgTemplate.toString()
                .replace("{CATEGORY_NAME}", categoryName)
                .replace("By.cssSelector: ", "");
        By categoryLink = By.cssSelector(css);
        click(categoryLink);
    }

    public void clickProductByName(String productName) {
        String xpath = productLinkTemplate.toString()
                .replace("{PRODUCT_NAME}", productName)
                .replace("By.xpath: ", "");
        By productLink = By.xpath(xpath);
        click(productLink);
    }
    public void clickAddToCartByDescription(String description) {
        String xpath = addToCartTemplate.toString()
                .replace("{DESCRIPTION}", description)
                .replace("By.xpath: ", "");
        By addToCartLink = By.xpath(xpath);
        click(addToCartLink);
    }
    public boolean isWelcomeBannerVisible() {
        return isElementVisible(welcomeContent);
    }
}
