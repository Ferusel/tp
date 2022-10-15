package seedu.foodrem.enums;

import static seedu.foodrem.logic.commands.generalcommands.HelpCommand.DEFAULT_HELP_MESSAGE;
import static seedu.foodrem.logic.parser.CliSyntax.PREFIX_ID;
import static seedu.foodrem.logic.parser.CliSyntax.PREFIX_ITEM_BOUGHT_DATE;
import static seedu.foodrem.logic.parser.CliSyntax.PREFIX_ITEM_EXPIRY_DATE;
import static seedu.foodrem.logic.parser.CliSyntax.PREFIX_ITEM_QUANTITY;
import static seedu.foodrem.logic.parser.CliSyntax.PREFIX_ITEM_UNIT;
import static seedu.foodrem.logic.parser.CliSyntax.PREFIX_NAME;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Represents the command word to be keyed in by a user to execute a command.
 */
public enum CommandWord {
    // General Commands
    EXIT_COMMAND("exit") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Exits FoodRem."
                    + "Example: " + getCommandWord();
        }
    },
    HELP_COMMAND("help") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Displays help for FoodRem.\n"
                    + "Example: " + getCommandWord();
        }
    },
    RESET_COMMAND("reset") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Resets all date in FoodRem."
                    + "Example: " + getCommandWord();
        }
    },

    // Item Commands
    DECREMENT_COMMAND("dec") {
        @Override
        public String getUsage() {
            return getCommandWord()
                    + ": Decrements the quantity of the item identified by the "
                    + "index number used in the displayed item list.\n"
                    + "If a quantity is not provided, the item quantity will be decremented by 1. \n"
                    + "Parameters:\n"
                    + "INDEX (must be a positive integer) [" + PREFIX_ITEM_QUANTITY + "QUANTITY]\n"
                    + "Example:\n"
                    + getCommandWord() + " 10\n"
                    + getCommandWord() + " 10 " + PREFIX_ITEM_QUANTITY + "100";
        }
    },
    DELETE_COMMAND("del") {
        @Override
        public String getUsage() {
            return getCommandWord()
                    + ": Deletes the item identified by the index number used in the displayed item list.\n"
                    + "Parameters: INDEX (must be a positive integer)\n"
                    + "Example: " + getCommandWord() + " 1";
        }
    },
    EDIT_COMMAND("edit") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Updates the details of the item identified "
                    + "by the index number used in the displayed item list. "
                    + "Existing values will be overwritten by the input values.\n"
                    + "Parameters: INDEX (must be a positive integer) "
                    + "[" + PREFIX_NAME + "NAME] "
                    + "[" + PREFIX_ITEM_QUANTITY + "QUANTITY] "
                    + "[" + PREFIX_ITEM_UNIT + "UNIT] "
                    + "[" + PREFIX_ITEM_BOUGHT_DATE + "BOUGHT DATE] "
                    + "[" + PREFIX_ITEM_EXPIRY_DATE + "EXPIRY DATE]...\n"
                    + "Example: " + getCommandWord() + " 1 "
                    + PREFIX_ITEM_QUANTITY + "1000 "
                    + PREFIX_ITEM_QUANTITY + "grams";
        }
    },
    FIND_COMMAND("find") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Finds all items whose names contain any of "
                    + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
                    + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
                    + "Example: " + getCommandWord() + " Potatoes Carrots Cucumbers";
        }
    },
    INCREMENT_COMMAND("inc") {
        @Override
        public String getUsage() {
            return getCommandWord()
                    + ": Increments the quantity of the item identified by the "
                    + "index number used in the displayed item list.\n"
                    + "If a quantity is not provided, the item quantity will be incremented by 1. \n"
                    + "Parameters:\n"
                    + "INDEX (must be a positive integer) [" + PREFIX_ITEM_QUANTITY + "QUANTITY]\n"
                    + "Example:\n"
                    + getCommandWord() + " 10\n"
                    + getCommandWord() + " 10 " + PREFIX_ITEM_QUANTITY + "100";
        }
    },
    LIST_COMMAND("list") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": List all items in FoodRem."
                    + "Example: " + getCommandWord();
        }
    },
    NEW_COMMAND("new") {
        @Override
        public String getUsage() {
            return getCommandWord()
                    + ": Creates a new item in FoodRem. "
                    + "\n"
                    + "Parameters: "
                    + PREFIX_NAME + "NAME "
                    + PREFIX_ITEM_QUANTITY + "QUANTITY "
                    + PREFIX_ITEM_UNIT + "UNIT "
                    + PREFIX_ITEM_BOUGHT_DATE + "BOUGHT DATE "
                    + PREFIX_ITEM_EXPIRY_DATE + "EXPIRY DATE "
                    + "[" + PREFIX_ITEM_QUANTITY + "QUANTITY" + "] "
                    + "[" + PREFIX_ITEM_UNIT + "UNIT" + "] "
                    + "[" + PREFIX_ITEM_BOUGHT_DATE + "BOUGHT_DATE" + "] "
                    + "[" + PREFIX_ITEM_EXPIRY_DATE + "EXPIRY_DATE" + "] "
                    + "\n"
                    + "Example: " + getCommandWord() + " "
                    + PREFIX_NAME + "Potatoes "
                    + PREFIX_ITEM_QUANTITY + "10 "
                    + PREFIX_ITEM_UNIT + "kg "
                    + PREFIX_ITEM_BOUGHT_DATE + "11-11-2022 "
                    + PREFIX_ITEM_EXPIRY_DATE + "21-11-2022 ";
        }
    },
    SORT_COMMAND("sort") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Sorts all items according to a specified criteria."
                    + "Available criteria includes sorting by name, quantity, type, bought date, expiry date.\n"
                    + "Parameters: "
                    + PREFIX_NAME + " "
                    + PREFIX_ITEM_QUANTITY + " "
                    + PREFIX_ITEM_UNIT + " "
                    + PREFIX_ITEM_BOUGHT_DATE + " "
                    + PREFIX_ITEM_EXPIRY_DATE + "...\n"
                    + "Example: " + getCommandWord() + "name";
        }
    },
    VIEW_COMMAND("view") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Displays the information about an Item. The command "
                    + "displays the name, quantity, bought date, expiry date, unit, and associated tags of the item.\n"
                    + "Example: " + getCommandWord() + " 1";
        }
    },

    // Tag Commands
    DELETE_TAG_COMMAND("deletetag") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Deletes an existing tag in FoodRem. "
                    + "Parameters: "
                    + PREFIX_NAME + "NAME "
                    + "Example: " + getCommandWord() + " "
                    + PREFIX_NAME + "Potatoes ";
        }
    },
    LIST_TAG_COMMAND("listtag") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": List all tags in FoodRem."
                    + "Example: " + getCommandWord();
        }
    },
    NEW_TAG_COMMAND("newtag") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Adds a tag to FoodRem. "
                    + "Parameters: "
                    + PREFIX_NAME + "NAME "
                    + "Example: " + getCommandWord() + " "
                    + PREFIX_NAME + "Potatoes ";
        }
    },
    RENAME_TAG_COMMAND("renametag") {
        @Override
        public String getUsage() {
            return getCommandWord() + ": Renames an existing tag in FoodRem. "
                    + "Parameters: "
                    + PREFIX_NAME + "ORIGINAL_TAG_NAME "
                    + PREFIX_NAME + "NEW_TAG_NAME "
                    + "Example: " + getCommandWord() + " "
                    + PREFIX_NAME + "Vegetables "
                    + PREFIX_NAME + "fruits";
        }
    },
    TAG_COMMAND("tag") {
        @Override
        public String getUsage() {
            return getCommandWord()
                    + ": Tags the item identified by the index number used "
                    + "in the displayed item list with a valid Tag.\n"
                    + "Parameters: " + PREFIX_NAME + "TAG_NAME" + PREFIX_ID
                    + "INDEX (item index must be a positive integer)\n"
                    + "Example: " + getCommandWord() + " " + PREFIX_NAME + "Condiments "
                    + PREFIX_ID + "1";
        }
    },
    UNTAG_COMMAND("untag") {
        @Override
        public String getUsage() {
            return getCommandWord()
                    + ": Untags the item identified by the index number used in "
                    + "the displayed item list with a valid Tag.\n"
                    + "Parameters: " + PREFIX_NAME + "TAG_NAME " + PREFIX_ID
                    + " INDEX (item index must be a positive integer)\n"
                    + "Example: " + getCommandWord() + " " + PREFIX_NAME + "Condiments "
                    + PREFIX_ID + "1";
        }
    },

    // INVALID
    DEFAULT("default") {
        @Override
        public String getUsage() {
            return DEFAULT_HELP_MESSAGE;
        }
    };

    private final String commandWord;

    /**
     * Constructs a CommandWord enum.
     *
     * @param commandWord the value representing the string value of the enum.
     */
    CommandWord(String commandWord) {
        this.commandWord = commandWord;
    }

    /**
     * Returns the string value of a CommandWord.
     *
     * @return the string representation of a CommandWord.
     */
    public String getCommandWord() {
        return commandWord;
    }

    /**
     * Returns the string value of a help message for the CommandWord.
     *
     * @return the string representation a help message for a CommandWord.
     */
    public abstract String getUsage();

    /**
     * Returns the CommandWord object from the string value of a command word.
     *
     * @param word a string value of the enum represented by the value provided.
     * @return a CommandWord object of the command represented by the string.
     */
    public static CommandWord parseWord(String word) {
        return Arrays.stream(values())
                .filter(type -> type.commandWord.equals(word))
                .findFirst().orElse(DEFAULT);
    }

    /**
     * Returns the list of all command words separated by commas
     */
    public static String listAllCommandWords() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (CommandWord commandWord : values()) {
            if (commandWord.equals(DEFAULT)) {
                continue;
            }
            stringJoiner.add(commandWord.commandWord);
        }
        return stringJoiner.toString();
    }
}
