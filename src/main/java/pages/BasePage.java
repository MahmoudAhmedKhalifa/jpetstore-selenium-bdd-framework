package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.WaitUtils;

public class BasePage {
    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }
    protected void click(By locator) {
        waitUtils.waitForClickable(locator).click();
    }
    protected void type(By locator, String text) {
        WebElement element = waitUtils.waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);    }
    protected void selectByVisibleText(By locator, String text) {
        Select dropdown = new Select( waitUtils.waitForClickable(locator));
        dropdown.selectByValue(text);
    }
    protected void setCheckbox(By locator, boolean shouldBeChecked) {
        WebElement checkbox = waitUtils.waitForClickable(locator);
        if (checkbox.isSelected() != shouldBeChecked) {
            checkbox.click();
        }
    }
    protected boolean isElementVisible(By locator) {
        try {
            return waitUtils.waitForVisibility(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }



    }
