package lt.fallowme.tests.opencart;

import java.util.UUID;
import lt.fallowme.base.TestBase;
import lt.fallowme.pages.opencart.AccountSuccessPage;
import lt.fallowme.pages.opencart.HomePage;
import lt.fallowme.pages.opencart.MyAccountPage;
import lt.fallowme.pages.opencart.RegisterPage;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class OpenCartTestBase extends TestBase {
    protected static final String TEST_PASSWORD = "PortfolioTest42!";
    protected HomePage homePage;

    @BeforeEach
    void openHomePage() {
        driver.get(System.getProperty("opencart.url", "https://opencart.abstracta.us/"));
        homePage = new HomePage(driver);
    }

    protected String uniqueEmail() {
        return "qa.portfolio." + UUID.randomUUID() + "@example.com";
    }

    protected AccountSuccessPage registerAccount(String email) {
        homePage.clickMyAccount();
        homePage.clickRegister();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.typeFirstName("Portfolio");
        registerPage.typeLastName("Test");
        registerPage.typeEmail(email);
        registerPage.typePhone("0000000000");
        registerPage.typePassword(TEST_PASSWORD);
        registerPage.typeConfirmPassword(TEST_PASSWORD);
        registerPage.agreeToPrivacyPolicy();
        registerPage.clickContinue();
        return new AccountSuccessPage(driver);
    }

    protected String createAccountAndLogout() {
        String email = uniqueEmail();
        assertEquals("Your Account Has Been Created!", registerAccount(email).getAccountCreatedTitle(),
                "Login fixture account should be created successfully");
        new MyAccountPage(driver).logout();
        return email;
    }
}
