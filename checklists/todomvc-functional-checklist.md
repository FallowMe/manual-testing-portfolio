# TodoMVC Functional Testing Checklist

This checklist summarizes the main functional, edge-case, accessibility, compatibility and responsive checks performed during exploratory testing of the TodoMVC – Ember.js application.

## Core Functionality

- [x] Create a normal todo item using Enter
- [x] Create multiple todo items
- [x] Mark a todo item as completed
- [x] Verify remaining-item counter after completing an item
- [x] Verify the All filter
- [x] Verify the Active filter
- [x] Verify the Completed filter
- [x] Refresh the page and verify todo state persistence
- [x] Edit an existing todo and save using Enter
- [x] Edit an existing todo and cancel using Esc
- [x] Edit an existing todo and save by clicking outside the edit field
- [x] Delete an active todo item
- [x] Clear completed todo items
- [x] Toggle all todos to completed
- [x] Toggle all todos back to active

## Input and Edge Cases

- [x] Submit empty input
- [x] Submit whitespace-only input
- [x] Verify leading and trailing spaces are handled correctly
- [x] Create a duplicate todo item
- [x] Enter numeric values
- [x] Enter special characters
- [x] Enter Lithuanian characters
- [x] Create a very long todo item and verify text wrapping
- [x] Edit a todo item to an empty value
- [x] Edit a todo item to a whitespace-only value

## Accessibility

- [x] Navigate reachable interactive controls using Tab
- [x] Verify visible keyboard focus for reachable controls
- [x] Toggle a todo checkbox using the keyboard
- [x] Activate filters using the keyboard
- [ ] Enter todo edit mode using keyboard only — BUG-001
- [ ] Reach and activate the individual delete action using keyboard only — BUG-002
- [x] Inspect todo checkbox accessibility properties in Chrome DevTools

## Compatibility

- [x] Perform core smoke testing in Mozilla Firefox
- [x] Verify create, complete, filter, edit, refresh and delete behaviour in Firefox
- [x] Compare core behaviour with Google Chrome

## Responsive and Usability Testing

- [x] Test responsive layout at 375 × 667
- [x] Verify the todo card remains usable
- [x] Verify counter and filters remain visible
- [x] Verify no horizontal overflow was observed
- [x] Verify very long todo text remains inside the layout
- [ ] Validate todo editing on a physical touch device

## Notes

The physical touch-device check remains open because mobile interaction was tested only through browser touch emulation.

During browser touch emulation, double tap and long press did not provide an apparent way to enter edit mode. This was therefore documented as an observation rather than a confirmed defect.
