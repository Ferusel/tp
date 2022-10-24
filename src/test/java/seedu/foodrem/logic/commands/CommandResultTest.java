package seedu.foodrem.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CommandResultTest {
    @Test
    public void equals() {
        CommandResult commandResult = CommandResult.from("feedback");

        // same values -> returns true
        assertEquals(commandResult, CommandResult.from("feedback"));
        // assertEquals(commandResult, new CommandResult("feedback", false, false));

        // same object -> returns true
        assertEquals(commandResult, commandResult);

        // null -> returns false
        assertNotEquals(null, commandResult);

        // different types -> returns false
        assertFalse(commandResult.equals(0.5f));

        // different feedbackToUser value -> returns false
        assertNotEquals(commandResult, CommandResult.from("different"));

        // different showHelp value -> returns false
        // assertNotEquals(commandResult, new CommandResult("feedback", true, false));

        // different exit value -> returns false
        // assertNotEquals(commandResult, new CommandResult("feedback", false, true));
    }
}
