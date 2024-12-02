package Basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
    WebDriver driver;

    // Locators
    By UsernameInputText = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/form/div[1]/div/div[1]/input"); // Replace with actual attribute
    By PasswordInputText = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/form/div[2]/div/div/input"); // Replace with actual attribute
    By LoginButton = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/form/div[3]/div/button"); // Replace with actual button text or attributes
    By ListStore = By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]"); // Replace with actual class or identifier
    By specificStoreLocator = By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[2]/div/div[4]/div/div[2]/div");
    By Selectstorebutton = By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div/div[2]");

    // Constructor
    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // Input username
    public void inputUsername(String username) {
        driver.findElement(UsernameInputText).sendKeys(username);
    }

    // Input password
    public void inputPassword(String password) {
        driver.findElement(PasswordInputText).sendKeys(password);
    }

    // Click login button
    public void clickLoginButton() {
        driver.findElement(LoginButton).click();
    }

    // Get list store locator
    public By getListStoreLocator() {
        return ListStore;
    }

    public void clickSelectStoreButton() {
        driver.findElement(Selectstorebutton).click();
    }

    // Click list store
    public void clickListStore(WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ListStore));
        driver.findElement(ListStore).click();
    }

    // Click specific store
    public void clickSpecificStore(WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(specificStoreLocator));
        driver.findElement(specificStoreLocator).click();

    }
}