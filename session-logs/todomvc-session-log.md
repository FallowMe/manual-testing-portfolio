# TodoMVC Exploratory Testing Session Log

This session log documents the main checks performed during exploratory testing of the TodoMVC – Ember.js application.

**Environment:** Google Chrome 151.0.7922.174 (64-bit), Windows 10  
**Testing type:** Exploratory testing  
**Additional browser:** Mozilla Firefox  
**Responsive viewport:** 375 × 667

| # | Area | Test / Exploration | Expected / Focus | Actual Result | Status |
|---|---|---|---|---|---|
| 1 | Functionality | Create multiple todo items | Items should be created successfully | All items created successfully | PASS |
| 2 | Functionality | Complete a todo item | Completed state and counter should update | Updated correctly | PASS |
| 3 | Functionality | Test All / Active / Completed filters | Correct subset should be displayed | All filters behaved correctly | PASS |
| 4 | Functionality | Refresh the page | Todos and states should persist | State persisted | PASS |
| 5 | Functionality | Edit an existing todo | Edited value should be saved | Saved successfully | PASS |
| 6 | Functionality | Submit empty input | No todo should be created | Nothing created | PASS |
| 7 | Functionality | Submit whitespace-only input | No todo should be created | Nothing created | PASS |
| 8 | Functionality | Create todo with leading/trailing spaces | Input should be handled cleanly | Spaces were trimmed | PASS |
| 9 | Functionality | Create duplicate todo | Observe duplicate handling | Duplicate was accepted | PASS |
| 10 | Functionality | Test numbers, special characters and Lithuanian characters | Input should remain intact | Values accepted correctly | PASS |
| 11 | Usability | Create a very long todo | Layout should remain usable | Text wrapped; item became very tall | OBSERVATION |
| 12 | Functionality | Edit todo to empty value | Empty edited item should be handled consistently | Item was removed | PASS |
| 13 | Functionality | Edit todo to whitespace-only value | Whitespace-only edit should be handled consistently | Item was removed | PASS |
| 14 | Functionality | Edit and press Esc | Edit should be cancelled | Original value restored | PASS |
| 15 | Functionality | Edit and click outside field | Observe save-on-blur behaviour | Edited value was saved | PASS |
| 16 | Functionality | Delete an active todo | Todo should be removed | Removed successfully | PASS |
| 17 | Functionality | Complete multiple active todos | Counter should decrease accordingly | Counter updated correctly | PASS |
| 18 | Functionality | Open Completed filter | Only completed items should be shown | Correct items displayed | PASS |
| 19 | Functionality | Clear completed items | Completed items should be removed | Completed items cleared | PASS |
| 20 | Functionality | Toggle all ON | All remaining items should become completed | Worked correctly | PASS |
| 21 | Functionality | Toggle all OFF | All remaining items should become active | Worked correctly | PASS |
| 22 | Accessibility | Navigate controls using Tab | Reachable controls should receive visible focus | Keyboard navigation worked | PASS |
| 23 | Accessibility | Toggle todo checkbox using keyboard | Checkbox should work without mouse | Worked correctly | PASS |
| 24 | Accessibility | Activate filters using keyboard | Filters should work without mouse | Worked correctly | PASS |
| 25 | Accessibility | Enter todo edit mode using keyboard only | Editing should be keyboard-accessible | Could not enter edit mode | FAIL – BUG-001 |
| 26 | Accessibility | Delete a specific todo using keyboard only | Delete action should be keyboard-accessible | Could not reach or activate delete action | FAIL – BUG-002 |
| 27 | Compatibility | Perform Firefox smoke test | Core behaviour should match Chrome | Tested functions behaved as expected | PASS |
| 28 | Responsive | Test viewport at 375 × 667 | Layout should remain usable | Layout remained usable | PASS |
| 29 | Responsive | Test very long todo at 375 × 667 | Text should remain inside layout | No horizontal overflow observed | PASS |
| 30 | Usability | Try editing in touch/mobile emulation | Touch user should have a discoverable edit method | Double tap and long press did not open edit mode | OBSERVATION |
| 31 | Accessibility | Inspect checkbox accessibility properties | Control should expose relevant accessibility information | Name, role and checked state were exposed | PASS |

## Session Summary

- **PASS:** 27
- **FAIL:** 2
- **OBSERVATION:** 2
- **Confirmed defects:** 2

The two confirmed defects were related to keyboard accessibility.

The touch/mobile editing behaviour was documented as an observation rather than a confirmed defect because testing was performed using browser emulation instead of a physical touch device.
