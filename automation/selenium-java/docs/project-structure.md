# Planned source structure

The source directories are prepared with README files. The Java files and Maven configuration listed below are pending import from the original learning project.

| Relative path | Intended responsibility |
| --- | --- |
| pom.xml | Original dependency versions, Java configuration and test runner |
| src/test/java/lt/fallowme/base/TestBase.java | Create a browser before each test and close it afterwards |
| src/test/java/lt/fallowme/pages/opencart/BasePage.java | Shared page setup and PageFactory initialization |
| src/test/java/lt/fallowme/pages/opencart/HomePage.java | My Account, Login and Register navigation |
| src/test/java/lt/fallowme/pages/opencart/LoginPage.java | Login fields, submit action and warning access |
| src/test/java/lt/fallowme/pages/opencart/MyAccountPage.java | Account page heading access |
| src/test/java/lt/fallowme/pages/opencart/RegisterPage.java | Registration fields, privacy policy and Continue action |
| src/test/java/lt/fallowme/tests/opencart/LoginTest.java | Positive and negative login tests |
| src/test/java/lt/fallowme/tests/opencart/RegisterTest.java | Unique-email registration and success assertion |
| src/test/java/lt/fallowme/tests/demoqa/ButtonsTest.java | Normal, double and context click assertions |
| src/test/java/lt/fallowme/tests/demoqa/DynamicPropertiesTest.java | Enabled, visible and colour-change checks |
| src/test/java/lt/fallowme/tests/demoqa/ProgressBarTest.java | Progress completion and reset checks |

## Import and review checklist

- [ ] Import the original pom.xml and confirm its JDK and dependency versions.
- [ ] Import the original Java classes and update package declarations/imports to match the folders.
- [ ] Keep shared browser lifecycle independent of each test application's URL.
- [ ] Ensure each test closes its browser through the shared cleanup.
- [ ] Confirm page objects and tests have matching methods and constructors.
- [ ] Check positive and negative assertions, including registration completion.
- [ ] Replace personal credentials with an appropriate test-data configuration.
- [ ] Confirm Maven discovers the intended tests.
- [ ] Run the tests and document actual results.
- [ ] Update the scenario catalogue to match the published code.

A runnable project should be claimed only after source/configuration import and verification.
