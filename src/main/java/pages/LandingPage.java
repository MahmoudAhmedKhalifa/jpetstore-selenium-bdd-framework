package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }
    private By signInLink = By.linkText("Sign In");

    public void clickSignIn() {
        click(signInLink);
    }


}
