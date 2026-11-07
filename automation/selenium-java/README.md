# Selenium Java — UI Test Automation

This project documents my progress from manual software testing to UI test automation using Java and Selenium WebDriver during my Software Testing studies at TECHIN.

OpenCart practice focuses on authentication, registration and Page Object Model structure. DemoQA practice focuses on dynamic elements, progress bars and mouse interactions.

## Current status

This directory contains project documentation and a prepared source folder structure. The original Java source files and `pom.xml` have not yet been published here. This is not yet a runnable Maven project.

The scenario catalogue describes learning exercises and their intended checks. It does not certify that these tests exist or pass in this repository.

## Tools used in learning

| Tool | Purpose |
| --- | --- |
| Java | Test and page object code |
| Selenium WebDriver / ChromeDriver | Browser automation in Chrome |
| JUnit Jupiter | Test lifecycle and assertions |
| Maven | Dependency management and test execution |
| IntelliJ IDEA | Java development and test execution |
| Git / GitHub | Version control and portfolio |
| Chrome DevTools | Inspecting elements and selecting locators |

Exact dependency and JDK versions will be documented from the original Maven project when its configuration is added.

## Test applications

- OpenCart: https://opencart.abstracta.us/
- DemoQA buttons: https://demoqa.com/buttons
- DemoQA dynamic properties: https://demoqa.com/dynamic-properties
- DemoQA progress bar: https://demoqa.com/progress-bar

These public demo applications are external dependencies. Availability and page changes may affect future test runs.

## Project structure

| Path | Role and publication status |
| --- | --- |
| `README.md` | Project overview |
| `docs/test-scenarios.md` | Scenario catalogue and intended assertions |
| `docs/test-execution.md` | Verification status and future execution record format |
| `docs/project-structure.md` | Planned Java files and import checklist |
| `src/test/java/lt/fallowme/base/` | Prepared folder for shared browser lifecycle |
| `src/test/java/lt/fallowme/pages/opencart/` | Prepared folder for OpenCart page objects |
| `src/test/java/lt/fallowme/tests/opencart/` | Prepared folder for login and registration tests |
| `src/test/java/lt/fallowme/tests/demoqa/` | Prepared folder for dynamic element and mouse interaction tests |
| `evidence/` | Guidance for adding actual execution evidence |
| `pom.xml` | Pending import from the original project |

## Design approach

- Keep browser creation and cleanup in `TestBase`.
- Keep OpenCart locators and page actions in page objects.
- Use `BasePage` for shared page setup with PageFactory.
- Keep assertions in tests so each scenario has a clear expected result.
- Use explicit waits for the state being tested, such as visibility or clickability.
- Keep test data separate from page actions; avoid publishing personal credentials.

These describe the intended organization of the existing learning work. Implementation will be reviewed after source import.

## Running the tests

Tests cannot be run from this directory yet. First add and review the original Java files and `pom.xml`, then confirm the JDK, dependencies and test discovery.

After that verification, the intended command from this directory is:

```bash
mvn test
```

Chrome and the required JDK/Maven environment must be available. Document any actual driver setup or test account requirements from the imported code.

## Documentation

- [Scenario catalogue](docs/test-scenarios.md)
- [Execution status](docs/test-execution.md)
- [Planned source structure and import checklist](docs/project-structure.md)
- [Evidence guidance](evidence/README.md)

## Next steps

1. Import the original Maven configuration and learning code.
2. Review page objects, browser cleanup, waits and assertions.
3. Check that registration verifies account creation after submitting the form.
4. Run the imported tests and record the environment and actual results.
5. Add selected evidence and update each scenario's publication status.

This is an ongoing educational project.
