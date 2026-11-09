# Source structure and exercise origins

All Java files below are included under `src/test/java`; this is a test-only Maven project.

| Path | Responsibility |
| --- | --- |
| `pom.xml` | Java release, test dependencies and Maven plugins |
| `src/test/java/lt/fallowme/base/TestBase.java` | Chrome lifecycle, headless configuration and explicit wait |
| `src/test/java/lt/fallowme/pages/opencart/AccountSuccessPage.java` | Account-creation heading |
| `src/test/java/lt/fallowme/pages/opencart/BasePage.java` | PageFactory setup and wait-aware click/type/text helpers |
| `src/test/java/lt/fallowme/pages/opencart/HomePage.java` | My Account, Login and Register navigation |
| `src/test/java/lt/fallowme/pages/opencart/LoginPage.java` | Login fields, submit action and warning text |
| `src/test/java/lt/fallowme/pages/opencart/MyAccountPage.java` | Account heading and logout |
| `src/test/java/lt/fallowme/pages/opencart/RegisterPage.java` | Registration fields, privacy checkbox and Continue |
| `src/test/java/lt/fallowme/tests/demoqa/ButtonsTest.java` | Normal, double and context clicks with message assertions |
| `src/test/java/lt/fallowme/tests/demoqa/DynamicPropertiesTest.java` | Enabled, visible and CSS colour checks |
| `src/test/java/lt/fallowme/tests/demoqa/ProgressBarTest.java` | Completion and reset assertions |
| `src/test/java/lt/fallowme/tests/opencart/LoginTest.java` | Three independent positive/negative login checks |
| `src/test/java/lt/fallowme/tests/opencart/OpenCartTestBase.java` | OpenCart URL, synthetic test data and account setup |
| `src/test/java/lt/fallowme/tests/opencart/RegisterTest.java` | Registration and success-heading assertion |

## Selected uploaded exercises

| Uploaded project / exercise | Portfolio destination |
| --- | --- |
| `techin-vakaras-26-ruduo-pom`: page classes, `TestBase`, `LoginTest`, `RegisterTest` | OpenCart POM and test base |
| `techin-vakaras-26-ruduo`: `hooks_06/HookTest` | Unregistered-email login scenario |
| `actions_08/ActionsTest` | `ButtonsTest` |
| `waiters_07/DemoqaProperties` | `DynamicPropertiesTest` |
| `waiters_07/ExplicitTest` | `ProgressBarTest`, extended with reset verification |

These are learning exercises refactored into a portfolio structure with AI assistance, rather than a verbatim archive import. Changes include package names, shared lifecycle, explicit waits, independent synthetic account setup, final CSS colour and reset assertions, and Maven test-engine/runner configuration.

The source registration test already contained an account-creation assertion; it was retained. The source POM used Selenium 4.51.0 and JUnit API 6.1.3; the portfolio includes the full JUnit Jupiter dependency so Maven can execute tests.

## Not selected

- Early locator/search/Select exercises: mostly exploratory scripts, repeated setup and console output, with incomplete or brittle assertions.
- The implicit-wait progress-bar duplicate: the explicit-wait version is clearer about the state being awaited.
- The long product comparison flow: combines currency, cart, wishlist and comparison with fixed prices and positional product selection; it needs a separate redesign before publication.
- `TomasScerbinskas`: a separate municipality/Java OOP exercise. Several methods still return placeholder values and its test contract depends on the bundled task JAR. It is outside this Selenium portfolio's scope.

## Publication choices

Only selected source and documentation are included. IntelliJ metadata, original account data, compiled output and the municipality task JAR are excluded. Current execution limitations are documented in [the execution record](test-execution.md).
