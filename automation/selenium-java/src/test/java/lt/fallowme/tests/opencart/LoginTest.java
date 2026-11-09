package lt.fallowme.tests.opencart;

import lt.fallowme.pages.opencart.LoginPage;
import lt.fallowme.pages.opencart.MyAccountPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends OpenCartTestBase {
    @Test
    void userCanLogin() {
        String email = createAccountAndLogout();
        login(email, TEST_PASSWORD);
        assertEquals("My Account", new MyAccountPage(driver).getMyAccountTitle());
        assertTrue(driver.getCurrentUrl().contains("route=account/account"));
    }

    @Test
    void userCannotLoginWithIncorrectEmail() {
        LoginPage loginPage = login(uniqueEmail(), TEST_PASSWORD);
        assertLoginRejected(loginPage);
    }

    @Test
    void userCannotLoginWithIncorrectPassword() {
        String email = createAccountAndLogout();
        LoginPage loginPage = login(email, "IncorrectPortfolioPassword42!");
        assertLoginRejected(loginPage);
    }

    private LoginPage login(String email, String password) {
        homePage.clickMyAccount();
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginButton();
        return loginPage;
    }

    private void assertLoginRejected(LoginPage loginPage) {
        assertTrue(loginPage.getLoginErrorText().contains("No match for E-Mail Address and/or Password"));
        assertTrue(driver.getCurrentUrl().contains("route=account/login"),
                "Rejected login should leave the browser on the login page");
    }
}
