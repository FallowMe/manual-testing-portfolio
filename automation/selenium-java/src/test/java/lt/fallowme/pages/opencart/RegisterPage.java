package lt.fallowme.pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement phoneInput;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public void typeFirstName(String firstName) {
        type(firstNameInput, firstName);
    }

    public void typeLastName(String lastName) {
        type(lastNameInput, lastName);
    }

    public void typeEmail(String email) {
        type(emailInput, email);
    }

    public void typePhone(String phone) {
        type(phoneInput, phone);
    }

    public void typePassword(String password) {
        type(passwordInput, password);
    }

    public void typeConfirmPassword(String confirmPassword) {
        type(confirmPasswordInput, confirmPassword);
    }

    public void agreeToPrivacyPolicy() {
        if (!privacyPolicyCheckbox.isSelected()) {
            click(privacyPolicyCheckbox);
        }
    }

    public void clickContinue() {
        click(continueButton);
    }

}
