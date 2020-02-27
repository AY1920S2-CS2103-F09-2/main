package seedu.jelphabot.logic.parser;

import org.junit.jupiter.api.Test;
import seedu.jelphabot.logic.commands.*;
import seedu.jelphabot.logic.commands.EditCommand.EditPersonDescriptor;
import seedu.jelphabot.logic.parser.exceptions.ParseException;
import seedu.jelphabot.model.task.DescriptionContainsKeywordsPredicate;
import seedu.jelphabot.model.task.Task;
import seedu.jelphabot.testutil.EditPersonDescriptorBuilder;
<<<<<<< HEAD
=======
<<<<<<<< HEAD:src/test/java/seedu/jelphabot/logic/parser/JelphaBotParserTest.java
import seedu.jelphabot.testutil.TaskBuilder;
import seedu.jelphabot.testutil.TaskUtil;
========
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
import seedu.jelphabot.testutil.PersonBuilder;
<<<<<<< HEAD:src/test/java/seedu/jelphabot/logic/parser/AddressBookParserTest.java
import seedu.jelphabot.testutil.PersonUtil;
=======
import seedu.jelphabot.testutil.TaskUtil;
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf:src/test/java/seedu/jelphabot/logic/parser/JelphaBotParserTest.java
<<<<<<< HEAD
=======
>>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5:src/test/java/seedu/jelphabot/logic/parser/AddressBookParserTest.java
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.jelphabot.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.jelphabot.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;
import static seedu.jelphabot.testutil.Assert.assertThrows;
import static seedu.jelphabot.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

public class JelphaBotParserTest {

    private final JelphaBotParser parser = new JelphaBotParser();

    @Test
    public void parseCommand_add() throws Exception {
<<<<<<< HEAD
=======
<<<<<<<< HEAD:src/test/java/seedu/jelphabot/logic/parser/JelphaBotParserTest.java
        Task task = new TaskBuilder().build();
        AddCommand command = (AddCommand) parser.parseCommand(TaskUtil.getAddCommand(task));
========
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
        Task task = new PersonBuilder().build();
<<<<<<< HEAD:src/test/java/seedu/jelphabot/logic/parser/AddressBookParserTest.java
        AddCommand command = (AddCommand) parser.parseCommand(PersonUtil.getAddCommand(task));
=======
        AddCommand command = (AddCommand) parser.parseCommand(TaskUtil.getAddCommand(task));
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf:src/test/java/seedu/jelphabot/logic/parser/JelphaBotParserTest.java
<<<<<<< HEAD
=======
>>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5:src/test/java/seedu/jelphabot/logic/parser/AddressBookParserTest.java
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
        assertEquals(new AddCommand(task), command);
    }

    @Test
    public void parseCommand_clear() throws Exception {
        assertTrue(parser.parseCommand(ClearCommand.COMMAND_WORD) instanceof ClearCommand);
        assertTrue(parser.parseCommand(ClearCommand.COMMAND_WORD + " 3") instanceof ClearCommand);
    }

    @Test
    public void parseCommand_delete() throws Exception {
        DeleteCommand command = (DeleteCommand) parser.parseCommand(
                DeleteCommand.COMMAND_WORD + " " + INDEX_FIRST_PERSON.getOneBased());
        assertEquals(new DeleteCommand(INDEX_FIRST_PERSON), command);
    }

    @Test
    public void parseCommand_edit() throws Exception {
<<<<<<< HEAD
        Task task = new PersonBuilder().build();
=======
        Task task = new TaskBuilder().build();
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
        EditPersonDescriptor descriptor = new EditPersonDescriptorBuilder(task).build();
        EditCommand command = (EditCommand) parser.parseCommand(EditCommand.COMMAND_WORD + " "
                + INDEX_FIRST_PERSON.getOneBased() + " " + TaskUtil.getEditPersonDescriptorDetails(descriptor));
        assertEquals(new EditCommand(INDEX_FIRST_PERSON, descriptor), command);
    }

    @Test
    public void parseCommand_exit() throws Exception {
        assertTrue(parser.parseCommand(ExitCommand.COMMAND_WORD) instanceof ExitCommand);
        assertTrue(parser.parseCommand(ExitCommand.COMMAND_WORD + " 3") instanceof ExitCommand);
    }

    @Test
    public void parseCommand_find() throws Exception {
        List<String> keywords = Arrays.asList("foo", "bar", "baz");
        FindCommand command = (FindCommand) parser.parseCommand(
                FindCommand.COMMAND_WORD + " " + keywords.stream().collect(Collectors.joining(" ")));
        assertEquals(new FindCommand(new DescriptionContainsKeywordsPredicate(keywords)), command);
    }

    @Test
    public void parseCommand_help() throws Exception {
        assertTrue(parser.parseCommand(HelpCommand.COMMAND_WORD) instanceof HelpCommand);
        assertTrue(parser.parseCommand(HelpCommand.COMMAND_WORD + " 3") instanceof HelpCommand);
    }

    @Test
    public void parseCommand_list() throws Exception {
        assertTrue(parser.parseCommand(ListCommand.COMMAND_WORD) instanceof ListCommand);
        assertTrue(parser.parseCommand(ListCommand.COMMAND_WORD + " 3") instanceof ListCommand);
    }

    @Test
    public void parseCommand_unrecognisedInput_throwsParseException() {
        assertThrows(ParseException.class, String.format(MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE), ()
            -> parser.parseCommand(""));
    }

    @Test
    public void parseCommand_unknownCommand_throwsParseException() {
        assertThrows(ParseException.class, MESSAGE_UNKNOWN_COMMAND, () -> parser.parseCommand("unknownCommand"));
    }
}
