package lt.fallowme.tests.demoqa;

import lt.fallowme.base.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonsTest extends TestBase {
    @BeforeEach
    void openButtonsPage() {
        driver.get("https://demoqa.com/buttons");
    }

    @Test
    void singleClickShowsMessage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']"))).click();
        assertEquals("You have done a dynamic click", message("dynamicClickMessage"));
    }

    @Test
    void doubleClickShowsMessage() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));
        new Actions(driver).doubleClick(button).perform();
        assertEquals("You have done a double click", message("doubleClickMessage"));
    }

    @Test
    void rightClickShowsMessage() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("rightClickBtn")));
        new Actions(driver).contextClick(button).perform();
        assertEquals("You have done a right click", message("rightClickMessage"));
    }

    private String message(String id) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).getText();
    }
}
