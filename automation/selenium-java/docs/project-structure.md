# Planned source structure

## Published documentation and folder placeholders

The following paths exist in this repository. Source folders currently contain README placeholders only.

| Existing path | Current contents |
| --- | --- |
| `README.md` | Project overview, tools, test scope and planned POM responsibilities |
| `docs/` | Scenario catalogue, execution status and this structure plan |
| `evidence/` | Evidence guidance; no execution evidence published |
| `src/test/java/lt/fallowme/base/` | README placeholder for shared browser lifecycle |
| `src/test/java/lt/fallowme/pages/opencart/` | README placeholder for OpenCart page objects |
| `src/test/java/lt/fallowme/tests/opencart/` | README placeholder for OpenCart test classes |
| `src/test/java/lt/fallowme/tests/demoqa/` | README placeholder for DemoQA test classes |

## Planned implementation — pending import

None of the Java files or Maven configuration listed below is published here yet. They are planned import targets from the original learning project.

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

