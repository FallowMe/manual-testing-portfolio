# Selenium Java — UI Test Automation Learning Project

An educational project developed from my TECHIN Selenium Java exercises, showing my transition from manual testing to browser automation.

The project includes OpenCart page objects and 11 UI test scenarios for OpenCart and DemoQA. The portfolio version consolidates the original exercises and adds explicit waits, shared browser cleanup, isolated demo data and clearer assertions.

## Status

Java source files and Maven configuration are included. Compilation, test discovery and live application results are tracked separately in the [execution record](docs/test-execution.md); published source does not imply a passing live run.

## Tools

| Tool | Purpose |
| --- | --- |
| Java 21+ | Test and page object code; compiled with release 21 |
| Selenium WebDriver 4.51.0 | Browser automation |
| Chrome / ChromeDriver | Browser and driver; Selenium Manager resolves the driver by default |
| JUnit Jupiter 6.1.3 | Test lifecycle and assertions; includes the test engine |
| Maven 3.9+ | Dependencies, compilation and test execution |
| Maven Compiler 3.14.1 / Surefire 3.5.4 | Reproducible compiler and JUnit test runner configuration |
| IntelliJ IDEA, Git and GitHub | Development and version control |

The uploaded exercises targeted Java 25. The selected code does not require Java 25 syntax; the portfolio targets Java 21 to make local setup easier. Selenium and JUnit versions come from the uploaded POM project.

## Test scope

| Application | Test class | Checks |
| --- | --- | --- |
| [OpenCart](https://opencart.abstracta.us/) | `LoginTest` | Valid login, unregistered email and incorrect password |
| OpenCart | `RegisterTest` | Unique-email registration and account-creation confirmation |
| [DemoQA buttons](https://demoqa.com/buttons) | `ButtonsTest` | Normal, double and context click messages |
| [DemoQA dynamic properties](https://demoqa.com/dynamic-properties) | `DynamicPropertiesTest` | Delayed visibility, enabled state and final CSS colour |
| [DemoQA progress bar](https://demoqa.com/progress-bar) | `ProgressBarTest` | Progress reaches 100%, then resets to 0% and shows Start |

See the [scenario catalogue](docs/test-scenarios.md) for IDs, methods and expected results.

## Page Object Model (POM)

| Component | Responsibility |
| --- | --- |
| `TestBase` | A new Chrome session per test, explicit wait and null-safe browser cleanup |
| `BasePage` | PageFactory initialization and reusable wait-aware page actions |
| OpenCart page objects | Home navigation, login, registration, account heading/logout and account-creation confirmation |
| `OpenCartTestBase` | OpenCart navigation, unique demo data and account setup for login tests |
| Test classes | Scenario flow and expected-result assertions |

OpenCart uses POM with PageFactory. The short DemoQA exercises keep locators in the test classes to demonstrate explicit waits and Selenium Actions. See [source structure and exercise origins](docs/project-structure.md).

## Run locally

Requirements: JDK 21 or newer, Maven 3.9 or newer, Chrome and Internet access to Maven repositories, driver downloads and the public demo applications.

From the repository root:

```bash
cd automation/selenium-java
mvn test
```

Chrome runs headless by default. To see the browser:

```bash
mvn test -Dheadless=false
```

Run selected tests:

```bash
mvn test -Dtest=ButtonsTest,DynamicPropertiesTest,ProgressBarTest
mvn test -Dtest=LoginTest,RegisterTest
```

Optional system properties:

| Property | Default | Purpose |
| --- | --- | --- |
| `headless` | `true` | Run Chrome without a visible window |
| `chrome.binary` | Auto-detected | Override the Chrome/Chromium executable path |
| `webdriver.chrome.driver` | Selenium Manager | Use an already installed matching ChromeDriver |
| `opencart.url` | `https://opencart.abstracta.us/` | Use a compatible OpenCart 2 demo or local instance |
| `chrome.noSandbox` | `false` | Isolated-container fallback only when Chrome's sandbox cannot run |

Maven writes test reports under `target/surefire-reports/` (ignored by Git).

## Test data and external dependencies

No personal accounts or credentials are required. Registration uses a UUID-based `@example.com` address and synthetic details. Valid-login and incorrect-password tests create their own demo accounts, then log out before the login check. A full run creates three demo accounts; use only a test/demo environment. No email verification or email delivery is tested.

Tests are independent and use a fresh browser. Public demo availability, account-creation limits, advertising overlays and application changes can affect results. Record these conditions instead of treating every timeout as an application defect. The suite does not remove demo accounts after execution.

## Documentation

- [Scenario catalogue](docs/test-scenarios.md)
- [Source structure and exercise origins](docs/project-structure.md)
- [Execution record](docs/test-execution.md)
- [Evidence guidance](evidence/README.md)
