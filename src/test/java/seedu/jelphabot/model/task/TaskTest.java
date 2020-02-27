package seedu.jelphabot.model.task;

import org.junit.jupiter.api.Test;
import seedu.jelphabot.testutil.TaskBuilder;

<<<<<<< HEAD
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
import static seedu.jelphabot.logic.commands.CommandTestUtil.*;
import static seedu.jelphabot.testutil.Assert.assertThrows;
import static seedu.jelphabot.testutil.TypicalPersons.ALICE;
import static seedu.jelphabot.testutil.TypicalPersons.BOB;

public class TaskTest {

    @Test
    public void asObservableList_modifyList_throwsUnsupportedOperationException() {
        Task task = new TaskBuilder().build();
        assertThrows(UnsupportedOperationException.class, () -> task.getTags().remove(0));
    }

    @Test
    public void isSameTask() {
        // same object -> returns true
        assertTrue(ALICE.isSameTask(ALICE));

        // null -> returns false
        assertFalse(ALICE.isSameTask(null));

        // different phone and module code -> returns false
<<<<<<< HEAD
<<<<<<< HEAD
        Task editedAlice = new PersonBuilder(ALICE).withPhone(VALID_PHONE_BOB).withEmail(VALID_MODULE_CODE_BOB).build();
=======
        Task editedAlice = new PersonBuilder(ALICE).build();
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
=======
        Task editedAlice = new TaskBuilder(ALICE).build();
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
        assertFalse(ALICE.isSameTask(editedAlice));

        // different name -> returns false
        editedAlice = new TaskBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertFalse(ALICE.isSameTask(editedAlice));

        // same name, same phone, different attributes -> returns true
        editedAlice = new TaskBuilder(ALICE).withModuleCode(VALID_MODULE_CODE_BOB)
                .withTags(VALID_TAG_HUSBAND).build();
        assertTrue(ALICE.isSameTask(editedAlice));

        // same name, same module code, different attributes -> returns true
<<<<<<< HEAD
<<<<<<< HEAD
        editedAlice = new PersonBuilder(ALICE).withPhone(VALID_PHONE_BOB)
                .withTags(VALID_TAG_HUSBAND).build();
=======
        editedAlice = new PersonBuilder(ALICE).build();
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
=======
        editedAlice = new TaskBuilder(ALICE).build();
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
        assertTrue(ALICE.isSameTask(editedAlice));

        // same name, same phone, same module code, different attributes -> returns true
        editedAlice = new TaskBuilder(ALICE).withTags(VALID_TAG_HUSBAND).build();
        assertTrue(ALICE.isSameTask(editedAlice));
    }

    @Test
    public void equals() {
        // same values -> returns true
<<<<<<< HEAD
        Task aliceCopy = new PersonBuilder(ALICE).build();
<<<<<<< HEAD
        assertTrue(ALICE.equals(aliceCopy));
=======
        Task aliceCopy = new TaskBuilder(ALICE).build();
        assertEquals(ALICE, aliceCopy);
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5

        // same object -> returns true
        assertEquals(ALICE, ALICE);

        // null -> returns false
        assertNotEquals(null, ALICE);

        // different type -> returns false
        assertNotEquals(5, ALICE);

        // different person -> returns false
        assertNotEquals(ALICE, BOB);

        // different name -> returns false
        Task editedAlice = new TaskBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertNotEquals(ALICE, editedAlice);

        // different phone -> returns false
        editedAlice = new TaskBuilder(ALICE).build();
        assertNotEquals(ALICE, editedAlice);

        // different module code -> returns false
        editedAlice = new TaskBuilder(ALICE).withModuleCode(VALID_MODULE_CODE_BOB).build();
        assertNotEquals(ALICE, editedAlice);

        // different tags -> returns false
<<<<<<< HEAD
        editedAlice = new PersonBuilder(ALICE).withTags(VALID_TAG_HUSBAND).build();
        assertFalse(ALICE.equals(editedAlice));
=======
        assertEquals(ALICE, aliceCopy);

        // same object -> returns true
        assertEquals(ALICE, ALICE);

        // null -> returns false
        assertNotEquals(null, ALICE);

        // different type -> returns false
        assertNotEquals(5, ALICE);

        // different person -> returns false
        assertNotEquals(ALICE, BOB);

        // different name -> returns false
        Task editedAlice = new PersonBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertNotEquals(ALICE, editedAlice);

        // different phone -> returns false
        editedAlice = new PersonBuilder(ALICE).build();
        assertNotEquals(ALICE, editedAlice);

        // different module code -> returns false
        editedAlice = new PersonBuilder(ALICE).withEmail(VALID_MODULE_CODE_BOB).build();
        assertNotEquals(ALICE, editedAlice);

        // different tags -> returns false
        editedAlice = new PersonBuilder(ALICE).withTags(VALID_TAG_HUSBAND).build();
        assertNotEquals(ALICE, editedAlice);
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
=======
        editedAlice = new TaskBuilder(ALICE).withTags(VALID_TAG_HUSBAND).build();
        assertNotEquals(ALICE, editedAlice);
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
    }
}
