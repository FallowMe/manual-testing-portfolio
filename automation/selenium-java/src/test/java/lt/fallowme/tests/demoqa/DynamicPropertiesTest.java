package lt.fallowme.tests.demoqa;

import lt.fallowme.base.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DynamicPropertiesTest extends TestBase {
    @BeforeEach
    void openDynamicPropertiesPage() {
        driver.get("https://demoqa.com/dynamic-properties");
    }

    @Test
    void buttonBecomesEnabled() {
        assertTrue(wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).isEnabled());
    }

    @Test
    void buttonBecomesVisible() {
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter"))).isDisplayed());
    }

    @Test
    void buttonChangesColor() {
        By button = By.id("colorChange");
        wait.until(ExpectedConditions.attributeContains(button, "class", "text-danger"));
        wait.until(d -> Color.fromString(d.findElement(button).getCssValue("color")).asHex().equals("#dc3545"));
        assertEquals("#dc3545", Color.fromString(driver.findElement(button).getCssValue("color")).asHex());
    }
}
