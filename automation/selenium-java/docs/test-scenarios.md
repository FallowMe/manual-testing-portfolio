# Test scenarios

These scenarios reflect Selenium Java learning practice. Method and class names below are target names for organizing the portfolio; they have not been confirmed against the original source files.

**Status for every scenario:** documented; source pending import; execution not verified in this repository.

| ID | Target test | Action | Expected assertion | Source status | Execution status |
| --- | --- | --- | --- | --- | --- |
| OC-01 | LoginTest.userCanLogin | Log in using a valid test account | Account page is displayed with the expected My Account heading | Pending import | Not verified |
| OC-02 | LoginTest.userCantLoginWithIncorrectUsername | Submit an unregistered email with a password | Login warning is displayed and account access is not granted | Pending import | Not verified |
| OC-03 | LoginTest.userCantLoginWithIncorrectPassword | Submit a registered email with an incorrect password | Login warning is displayed and account access is not granted | Pending import | Not verified |
| OC-04 | RegisterTest.userCanRegister | Fill required fields with a unique email, accept the privacy policy and submit | Account creation confirmation is displayed | Pending import | Not verified |
| DQ-01 | DynamicPropertiesTest.buttonBecomesEnabled | Wait for the initially disabled button | Button becomes enabled within the configured timeout | Pending import | Not verified |
| DQ-02 | DynamicPropertiesTest.buttonBecomesVisible | Wait for the delayed button | Button becomes visible within the configured timeout | Pending import | Not verified |
| DQ-03 | DynamicPropertiesTest.buttonChangesColor | Wait for the button colour change | Expected final CSS colour is reached | Pending import | Not verified |
| DQ-04 | ProgressBarTest.progressBarCanCompleteAndReset | Start progress, wait for completion and reset | Progress reaches 100%, then returns to 0% after reset | Pending import | Not verified |
| DQ-05 | ButtonsTest.singleClickShowsMessage | Perform a normal click | Corresponding click message is displayed | Pending import | Not verified |
| DQ-06 | ButtonsTest.doubleClickShowsMessage | Perform a double click using Actions | Corresponding double-click message is displayed | Pending import | Not verified |
| DQ-07 | ButtonsTest.rightClickShowsMessage | Perform a context click using Actions | Corresponding right-click message is displayed | Pending import | Not verified |

## Review notes

- Login requires a valid test account; no account credentials are included in this documentation.
- For registration, use a unique email such as a timestamp-based value. The learning work already included form filling and privacy policy acceptance; the final account-creation assertion must be checked in the source.
- Validate error messages and CSS values against the actual application before fixing assertion values.
- Each scenario needs a meaningful assertion; clicking through a flow alone does not verify success.
- Search, currency and cart exercises can be added after their source code and expected results are reviewed.

Update individual statuses only after importing and checking the corresponding implementation.
