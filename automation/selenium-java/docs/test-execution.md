# Test execution record

**Validation date:** 2026-11-09 (Europe/Vilnius).

## Result

Source compilation succeeded. Maven discovered all 11 tests, but live browser validation is **blocked by the execution environment**. No application test is claimed as passed, and no application defect is inferred from the setup errors.

| Check | Result |
| --- | --- |
| Java compilation | PASS: 13 source files compiled with release 21 |
| Maven/JUnit discovery | 11 tests discovered across five test classes |
| First live attempt: Selenium Manager | 11 setup errors; driver metadata download unavailable |
| Second live attempt: explicit matching ChromeDriver | 11 setup errors; Chromium could not start because the container denied a socket operation |
| Verified application assertions | None; both attempts stopped in browser setup |
| Current scenario status | All OC-01–OC-04 and DQ-01–DQ-07 are implemented; live verification blocked |

The two attempts were environment checks on the same 11 tests, not 22 different tests. Surefire reported 0 assertion failures and 11 errors for each attempt; this is not a passing run.

## Environment

| Item | Version / configuration |
| --- | --- |
| OS | Linux x86_64 container |
| JDK | Microsoft OpenJDK 21.0.13.0.2 |
| Maven | 3.9.9 |
| Selenium | 4.51.0 |
| JUnit Jupiter | 6.1.3 |
| Surefire | 3.5.4 |
| Chromium | 156.0.8078.79 |
| Explicit ChromeDriver | 156.0.8078.80 (same 156.0.8078 build family) |
| Browser mode | Headless; isolated-container no-sandbox option enabled for the attempted run |

Dependency resolution required the execution environment's proxy and system Java trust store. These local settings and temporary executable paths are not part of the repository.

## Commands

Portable project commands:

```bash
mvn test-compile
mvn test
```

For the second attempt a matching local driver and browser binary were supplied through `webdriver.chrome.driver` and `chrome.binary`, with `chrome.noSandbox=true`. The final browser startup error was:

```text
SessionNotCreatedException: Chrome instance exited
socket() failed: Operation not permitted (1)
```

## Source identity

SHA-256 of the sorted source set (pom.xml first, then Java paths; each relative UTF-8 path, NUL, exact bytes, NUL):

```text
87bc2af43593861ec15e3bd075af0320dc3a59ad9b324e19d259c200b8775dfa
```

See the [selected validation summary](../evidence/validation-summary.txt). Full build output stays in the ignored `target/` directory or the local validation workspace.

## Next verification

Run on a machine where Chrome can launch, using the README instructions. Record the tested commit SHA, actual command, environment and passed/failed/skipped/error counts. For login tests, record registration-fixture failures separately from login assertions. Replace the blocked statuses only after observing actual application results.
