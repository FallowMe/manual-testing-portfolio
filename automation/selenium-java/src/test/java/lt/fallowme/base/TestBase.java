package lt.fallowme.base;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    protected void setUp() {
        ChromeOptions options = new ChromeOptions();
        if (Boolean.parseBoolean(System.getProperty("headless", "true"))) {
            options.addArguments("--headless=new");
        }
        options.addArguments("--window-size=1440,1000");
        String binary = System.getProperty("chrome.binary");
        if (binary != null && !binary.isBlank()) {
            options.setBinary(binary);
        }
        // Only enable in an isolated container that cannot run Chrome's sandbox.
        if (Boolean.getBoolean("chrome.noSandbox")) {
            options.addArguments("--no-sandbox");
        }
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @AfterEach
    protected void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
