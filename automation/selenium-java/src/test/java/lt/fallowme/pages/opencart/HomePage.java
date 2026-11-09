package lt.fallowme.pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement loginLink;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Register')]")
    private WebElement registerLink;

    public void clickMyAccount() {
        click(myAccountLink);
    }

    public void clickLogin() {
        click(loginLink);
    }

    public void clickRegister() {
        click(registerLink);
    }

}
