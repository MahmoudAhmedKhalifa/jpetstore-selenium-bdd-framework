package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    private By registerNowLink = By.linkText("Register Now!");
    private By loginButton = By.name("signon");
    private By userName = By.name("username");
    private By passwordInput = By.name("password");



    public void clickRegisterNow() {
        click(registerNowLink);
    }
    public void clickLogin() {
        click(loginButton);
    }
    public void enterUserId(String userId) {
        type(userName, userId);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }
}
