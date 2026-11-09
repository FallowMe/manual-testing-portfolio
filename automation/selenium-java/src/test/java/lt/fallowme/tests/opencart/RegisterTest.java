package lt.fallowme.tests.opencart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest extends OpenCartTestBase {
    @Test
    void userCanRegister() {
        assertEquals("Your Account Has Been Created!",
                registerAccount(uniqueEmail()).getAccountCreatedTitle());
    }
}
