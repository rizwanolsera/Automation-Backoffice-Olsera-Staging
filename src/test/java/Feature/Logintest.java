
import Basepage.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logintest {

    @Test
    public void loginpositivecase() throws InterruptedException {
        // Initialize WebDriver and WebDriverWait
        WebDriver driver = WebDriverManager.chromedriver().create();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the login page
        driver.get("https://d1fjozuxvl1n9t.cloudfront.net/login");

        // Initialize Loginpage object and perform login
        Loginpage Loginpage = new Loginpage(driver);
        Loginpage.inputUsername("Rizwanto.olsera@gmail.com");
        Loginpage.inputPassword("admin123");
        Loginpage.clickLoginButton();

        // Wait for the store list to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(Loginpage.getListStoreLocator()));

        // Click on a specific store
        Loginpage.clickSpecificStore(wait);

        // Click selected store to go to dashboard
        Loginpage.clickSelectStoreButton();

        // Pause for observation (optional)
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}
