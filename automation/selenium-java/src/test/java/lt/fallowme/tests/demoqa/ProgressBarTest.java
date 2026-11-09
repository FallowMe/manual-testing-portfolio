package lt.fallowme.tests.demoqa;

import lt.fallowme.base.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressBarTest extends TestBase {
    @Test
    void progressBarCanCompleteAndReset() {
        driver.get("https://demoqa.com/progress-bar");
        By progress = By.cssSelector("#progressBar [role='progressbar']");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("startStopButton"))).click();
        wait.until(ExpectedConditions.attributeToBe(progress, "aria-valuenow", "100"));
        assertEquals("100", driver.findElement(progress).getDomAttribute("aria-valuenow"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("resetButton"))).click();
        wait.until(ExpectedConditions.attributeToBe(progress, "aria-valuenow", "0"));
        assertEquals("0", driver.findElement(progress).getDomAttribute("aria-valuenow"));
        assertEquals("Start", driver.findElement(By.id("startStopButton")).getText());
    }
}
