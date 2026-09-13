# TodoMVC Accessibility Bug Reports

This document contains accessibility issues identified during exploratory testing of the TodoMVC – Ember.js application.

---

## BUG-001 – Todo item cannot be edited using keyboard only

**Type:** Accessibility / Keyboard navigation  
**Status:** New  
**Environment:** Google Chrome 151.0.7922.174 (64-bit), Windows 10, Desktop viewport

### Description

A keyboard-only user cannot start editing an existing todo item.

Editing is available by double-clicking with a mouse, but no tested keyboard interaction opened edit mode.

### Steps to Reproduce

1. Open TodoMVC – Ember.js.
2. Create a todo item.
3. Use only the keyboard to navigate through the page.
4. Attempt to enter edit mode using Tab, Enter, Space or other standard keyboard interactions.

### Expected Result

The user should be able to start editing an existing todo item using keyboard-only interaction.

### Actual Result

Edit mode cannot be started using keyboard-only interaction.

### Reproducibility

Reproduced twice, including after page refresh.

### Evidence

Screenshot can be added as supporting evidence.

---

## BUG-002 – Individual todo item cannot be deleted using keyboard only

**Type:** Accessibility / Keyboard navigation  
**Status:** New  
**Environment:** Google Chrome 151.0.7922.174 (64-bit), Windows 10, Desktop viewport

### Description

A keyboard-only user cannot reach or activate the delete action for an individual todo item.

The delete control is available through mouse interaction, but it could not be accessed using keyboard navigation.

### Steps to Reproduce

1. Open TodoMVC – Ember.js.
2. Create at least one todo item.
3. Refresh the page.
4. Use only the keyboard to navigate through the todo controls.
5. Attempt to reach and activate the individual delete action using Tab, Shift+Tab, Enter, Space or other standard keyboard interactions.

### Expected Result

The individual todo delete action should be reachable and operable using the keyboard.

### Actual Result

The individual delete action cannot be reached or activated using keyboard-only interaction.

### Reproducibility

Reproduced twice, including after page refresh.

### Evidence

Screenshot can be added as supporting evidence.

---

## Notes

Both issues were discovered during keyboard accessibility testing.

They were recorded separately because they affect two different user actions:

- editing an existing todo item;
- deleting an individual todo item.

Supporting screenshots will be added only where they provide useful additional evidence.
