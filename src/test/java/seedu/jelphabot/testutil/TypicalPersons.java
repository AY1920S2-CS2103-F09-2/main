package seedu.jelphabot.testutil;

import seedu.jelphabot.model.JelphaBot;
import seedu.jelphabot.model.task.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static seedu.jelphabot.logic.commands.CommandTestUtil.*;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

<<<<<<< HEAD
    public static final Task ALICE = new PersonBuilder().withName("Alice Pauline")
<<<<<<< HEAD
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
=======
    public static final Task ALICE = new TaskBuilder().withName("Alice Pauline")
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
            .withTags("friends").build();
    public static final Task BENSON = new TaskBuilder().withName("Benson Meier")
            .withTags("owesMoney", "friends").build();
    public static final Task CARL = new TaskBuilder().withName("Carl Kurz")
            .withModuleCode("heinz@example.com").build();
    public static final Task DANIEL = new TaskBuilder().withName("Daniel Meier")
            .withModuleCode("cornelia@example.com").withTags("friends").build();
    public static final Task ELLE = new TaskBuilder().withName("Elle Meyer")
            .withModuleCode("werner@example.com").build();
    public static final Task FIONA = new TaskBuilder().withName("Fiona Kunz")
            .withModuleCode("lydia@example.com").build();
    public static final Task GEORGE = new TaskBuilder().withName("George Best")
            .withModuleCode("anna@example.com").build();

    // Manually added
    public static final Task HOON = new TaskBuilder().withName("Hoon Meier")
            .withModuleCode("stefan@example.com").build();
    public static final Task IDA = new TaskBuilder().withName("Ida Mueller")
            .withModuleCode("hans@example.com").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
<<<<<<< HEAD
    public static final Task AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_MODULE_CODE_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Task BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_MODULE_CODE_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
=======
            .withTags("friends").build();
    public static final Task BENSON = new PersonBuilder().withName("Benson Meier")
            .withTags("owesMoney", "friends").build();
    public static final Task CARL = new PersonBuilder().withName("Carl Kurz")
            .withEmail("heinz@example.com").build();
    public static final Task DANIEL = new PersonBuilder().withName("Daniel Meier")
            .withEmail("cornelia@example.com").withTags("friends").build();
    public static final Task ELLE = new PersonBuilder().withName("Elle Meyer")
            .withEmail("werner@example.com").build();
    public static final Task FIONA = new PersonBuilder().withName("Fiona Kunz")
            .withEmail("lydia@example.com").build();
    public static final Task GEORGE = new PersonBuilder().withName("George Best")
            .withEmail("anna@example.com").build();

    // Manually added
    public static final Task HOON = new PersonBuilder().withName("Hoon Meier")
            .withEmail("stefan@example.com").build();
    public static final Task IDA = new PersonBuilder().withName("Ida Mueller")
            .withEmail("hans@example.com").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Task AMY = new PersonBuilder()
            .withName(VALID_NAME_AMY)
            .withEmail(VALID_MODULE_CODE_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Task BOB = new PersonBuilder().withName(VALID_NAME_BOB)
            .withEmail(VALID_MODULE_CODE_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
=======
    public static final Task AMY = new TaskBuilder()
            .withName(VALID_NAME_AMY)
            .withModuleCode(VALID_MODULE_CODE_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Task BOB = new TaskBuilder().withName(VALID_NAME_BOB)
            .withModuleCode(VALID_MODULE_CODE_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code JelphaBot} with all the typical persons.
     */
    public static JelphaBot getTypicalJelphaBot() {
        JelphaBot ab = new JelphaBot();
        for (Task task : getTypicalPersons()) {
            ab.addPerson(task);
        }
        return ab;
    }

    public static List<Task> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
