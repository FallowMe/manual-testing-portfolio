package lt.fallowme.pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    private WebElement myAccountTitle;

    public String getMyAccountTitle() {
        return text(myAccountTitle);
    }
    @FindBy(css = "#column-right a[href*='route=account/logout']")
    private WebElement logoutLink;

    public void logout() {
        click(logoutLink);
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.urlContains("route=account/logout"));
    }
}
