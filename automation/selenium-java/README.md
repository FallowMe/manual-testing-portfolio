# Selenium Java — UI Test Automation Learning Project

This project documents my UI test automation learning during Software Testing studies at TECHIN.

The goal is to turn test scenarios into browser checks with clear expected results, while practising maintainable test organization with Java, Selenium WebDriver and Page Object Model (POM).

## Current status

Project documentation and source folder placeholders are published. Java source files and `pom.xml` are pending import from the original learning project.

This directory is not yet a runnable Maven project. No verified execution results are available here.

## Tools used in learning

| Tool | Purpose |
| --- | --- |
| Java | Test and page object implementation |
| Selenium WebDriver / ChromeDriver | Browser automation |
| JUnit Jupiter | Test lifecycle and assertions |
| Maven | Dependency management and test execution |
| IntelliJ IDEA | Development and local test execution |
| Git / GitHub | Version control and portfolio presentation |

JDK and dependency versions will be documented after reviewing the original `pom.xml`.

## Documented test scope

| Application | Scenarios | Intended checks |
| --- | --- | --- |
| OpenCart | Valid and invalid login | Account access after valid login; warning and denied access after invalid login |
| OpenCart | Registration with a unique email | Account creation confirmation |
| DemoQA | Dynamic properties | Delayed visibility, enabled state and final CSS colour |
| DemoQA | Progress bar | Completion at 100% and reset to 0% |
| DemoQA | Mouse interactions | Messages after normal, double and context clicks |

These are documented learning scenarios. Implementation and execution status must be confirmed after source import.

## Planned Page Object Model structure

| Component | Responsibility |
| --- | --- |
| `TestBase` | Shared browser creation and cleanup |
| `BasePage` | Shared page initialization using PageFactory |
| OpenCart page objects | Page locators and actions for navigation, login and registration |
| OpenCart tests | Scenario steps and assertions |
| DemoQA tests | Dynamic element, progress bar and mouse interaction checks |

Page objects will represent page actions; test classes will verify expected outcomes. Explicit waits will target the state required by each scenario.

See the [planned files and import checklist](docs/project-structure.md).

## Execution

Tests cannot yet be run from this directory. Run instructions will be finalized after importing and checking the Java source files, Maven configuration and environment requirements.

See [execution status](docs/test-execution.md).

## Documentation

- [Test scenarios and expected assertions](docs/test-scenarios.md)
- [Planned source structure](docs/project-structure.md)
- [Execution status](docs/test-execution.md)
- [Evidence guidance](evidence/README.md)

## Next milestone

Publish and review the original Maven configuration and Java classes, verify test discovery, then record an actual run with its environment, results and selected evidence.
