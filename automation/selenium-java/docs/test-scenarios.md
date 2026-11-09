# Test scenarios

The 11 scenarios below map to published Java test methods. Live execution status is recorded separately in [the execution record](test-execution.md).

| ID | Test method | Action | Expected assertion | Source status |
| --- | --- | --- | --- | --- |
| OC-01 | LoginTest.userCanLogin | Create a unique demo account, log out, then log in | My Account heading and account URL | Included |
| OC-02 | LoginTest.userCannotLoginWithIncorrectEmail | Submit a unique unregistered email | No-match warning and login URL | Included |
| OC-03 | LoginTest.userCannotLoginWithIncorrectPassword | Create a unique account, log out, submit the wrong password | No-match warning and login URL | Included |
| OC-04 | RegisterTest.userCanRegister | Submit unique-email registration with synthetic required fields | Your Account Has Been Created! heading | Included |
| DQ-01 | DynamicPropertiesTest.buttonBecomesEnabled | Wait for enableAfter | Button becomes enabled within 15 seconds | Included |
| DQ-02 | DynamicPropertiesTest.buttonBecomesVisible | Wait for visibleAfter | Button becomes visible within 15 seconds | Included |
| DQ-03 | DynamicPropertiesTest.buttonChangesColor | Wait for text-danger and final CSS colour | CSS colour is #dc3545 | Included |
| DQ-04 | ProgressBarTest.progressBarCanCompleteAndReset | Start, wait for completion, then reset | aria-valuenow changes to 100 then 0; button shows Start | Included |
| DQ-05 | ButtonsTest.singleClickShowsMessage | Click Click Me | You have done a dynamic click | Included |
| DQ-06 | ButtonsTest.doubleClickShowsMessage | Double-click with Actions | You have done a double click | Included |
| DQ-07 | ButtonsTest.rightClickShowsMessage | Context-click with Actions | You have done a right click | Included |

Valid-login and incorrect-password tests include registration as fixture setup. A failure to create the fixture prevents the login behavior from being assessed. Tests do not depend on a shared personal account or on the order of other tests.
