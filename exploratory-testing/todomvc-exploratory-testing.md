# TodoMVC Exploratory Testing Report

## Project

**Application:** TodoMVC – Ember.js  
**Testing type:** Exploratory testing  
**Browser:** Google Chrome 151.0.7922.174 (64-bit)  
**Operating system:** Windows 10  
**Viewport:** Desktop browser  
**Planned session duration:** 60 minutes

## Scope

The exploratory testing session covered:

- Core todo creation and management
- Editing behaviour
- Filters and remaining-item counter
- Data persistence after page refresh
- Empty and whitespace-only input handling
- Edge-case input values
- Keyboard accessibility
- Cross-browser compatibility
- Responsive behaviour at 375 × 667
- Touch/mobile emulation

## Summary

Core functionality behaved as expected in the tested scenarios.

Two reproducible keyboard accessibility issues were identified:

1. An existing todo item could not be edited using keyboard-only interaction.
2. The individual todo delete action could not be reached or activated using keyboard-only interaction.

Core functionality was also checked in Mozilla Firefox and behaved consistently with Chrome during the tested smoke scenarios.

At a responsive viewport of 375 × 667, the layout remained usable and no horizontal overflow was observed.

During touch/mobile emulation, neither double tap nor long press provided an apparent way to enter todo edit mode. This was recorded as an **observation rather than a confirmed defect**, because testing was performed using browser emulation rather than a physical touch device.

## Selected Test Results

| Area | Finding | Result |
|---|---|---|
| Functionality | Create a normal todo using Enter | PASS |
| Functionality | Completed state and remaining counter update correctly | PASS |
| Functionality | All, Active and Completed filters show expected items | PASS |
| Functionality | Todo state persists after page refresh | PASS |
| Functionality | Edit a todo and save using Enter | PASS |
| Functionality | Empty and whitespace-only input does not create a todo | PASS |
| Functionality | Leading and trailing spaces are handled correctly | PASS |
| Functionality | Esc cancels editing and restores previous value | PASS |
| Functionality | Clicking outside the edit field saves the edited value | PASS |
| Functionality | Deleting an active todo updates the list correctly | PASS |
| Functionality | Clear completed removes completed items | PASS |
| Functionality | Toggle all works in both directions | PASS |
| Accessibility | Keyboard navigation works for reachable controls | PASS |
| Accessibility | Todo cannot be edited using keyboard only | FAIL – BUG-001 |
| Accessibility | Individual delete action cannot be reached using keyboard only | FAIL – BUG-002 |
| Compatibility | Core functionality behaves consistently in Firefox | PASS |
| Responsive | Layout remains usable at 375 × 667 | PASS |
| Usability | Touch emulation provides no apparent edit interaction | OBSERVATION |

## Key Takeaways

This testing session helped me practice:

- Exploratory testing without relying only on predefined test cases
- Distinguishing confirmed defects from observations
- Testing normal and edge-case behaviour
- Keyboard accessibility checks
- Cross-browser testing
- Responsive testing using browser developer tools
- Documenting findings clearly and consistently

## Related Portfolio Materials

Additional materials for this project include:

- Detailed testing session log
- Accessibility bug reports
- Functional testing checklist
- Supporting evidence
