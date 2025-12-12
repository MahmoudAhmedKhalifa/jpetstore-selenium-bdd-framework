package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegistrationPage  extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    // ---------- User Information Section ----------
    private By userIdInput = By.name("username");
    private By newPasswordInput = By.name("password");
    private By repeatPasswordInput = By.name("repeatedPassword");

    // ---------- Account Information Section ----------
    private By firstNameInput = By.name("account.firstName");
    private By lastNameInput = By.name("account.lastName");
    private By emailInput = By.name("account.email");
    private By phoneInput = By.name("account.phone");
    private By address1Input = By.name("account.address1");
    private By address2Input = By.name("account.address2");
    private By cityInput = By.name("account.city");
    private By stateInput = By.name("account.state");
    private By zipInput = By.name("account.zip");
    private By countryInput = By.name("account.country");

    // ---------- Profile Information Section ----------
    private By languageDropdown = By.name("account.languagePreference");
    private By categoryDropdown = By.name("account.favouriteCategoryId");
    private By enableMyListCheckbox = By.name("account.listOption");
    private By enableMyBannerCheckbox = By.name("account.bannerOption");

    private By saveAccountButton = By.cssSelector("input[value='Save Account Information']");



    // ---------- User Information Actions ----------
    public void enterUserId(String userId) {
        type(userIdInput, userId);
    }

    public void enterPassword(String password) {
        type(newPasswordInput, password);
    }

    public void enterRepeatPassword(String password) {
        type(repeatPasswordInput, password);
    }

    // ---------- Account Information Actions ----------
    public void enterFirstName(String firstName) {
        type(firstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        type(lastNameInput, lastName);
    }

    public void enterEmail(String email) {
        type(emailInput, email);
    }

    public void enterPhone(String phone) {
        type(phoneInput, phone);
    }

    public void enterAddress1(String address) {
        type(address1Input, address);
    }

    public void enterAddress2(String address) {
        type(address2Input, address);
    }

    public void enterCity(String city) {
        type(cityInput, city);
    }

    public void enterState(String state) {
        type(stateInput, state);
    }

    public void enterZip(String zip) {
        type(zipInput, zip);
    }

    public void enterCountry(String country) {
        type(countryInput, country);
    }


    // ---------- Profile Information Actions ----------
    public void selectLanguage(String language) {
        selectByVisibleText(languageDropdown, language);
    }

    public void selectFavouriteCategory(String category) {
        selectByVisibleText(categoryDropdown, category);
    }

    public void enableMyList(boolean enable) {
        setCheckbox(enableMyListCheckbox, enable);
    }

    public void enableMyBanner(boolean enable) {
        setCheckbox(enableMyBannerCheckbox, enable);
    }

    public void clickSaveAccount() {
        click(saveAccountButton);
    }




}
