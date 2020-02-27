package seedu.jelphabot.model.task;

import org.junit.jupiter.api.Test;
import seedu.jelphabot.testutil.PersonBuilder;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
import static seedu.jelphabot.logic.commands.CommandTestUtil.*;
import static seedu.jelphabot.testutil.Assert.assertThrows;
import static seedu.jelphabot.testutil.TypicalPersons.ALICE;
import static seedu.jelphabot.testutil.TypicalPersons.BOB;

public class TaskTest {

    @Test
    public void asObservableList_modifyList_throwsUnsupportedOperationException() {
        Task task = new PersonBuilder().build();
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
        Task editedAlice = new PersonBuilder(ALICE).withPhone(VALID_PHONE_BOB).withEmail(VALID_MODULE_CODE_BOB).build();
=======
        Task editedAlice = new PersonBuilder(ALICE).build();
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
        assertFalse(ALICE.isSameTask(editedAlice));

        // different name -> returns false
        editedAlice = new PersonBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertFalse(ALICE.isSameTask(editedAlice));

        // same name, same phone, different attributes -> returns true
        editedAlice = new PersonBuilder(ALICE).withEmail(VALID_MODULE_CODE_BOB)
                .withTags(VALID_TAG_HUSBAND).build();
        assertTrue(ALICE.isSameTask(editedAlice));

        // same name, same module code, different attributes -> returns true
<<<<<<< HEAD
        editedAlice = new PersonBuilder(ALICE).withPhone(VALID_PHONE_BOB)
                .withTags(VALID_TAG_HUSBAND).build();
=======
        editedAlice = new PersonBuilder(ALICE).build();
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
        assertTrue(ALICE.isSameTask(editedAlice));

        // same name, same phone, same module code, different attributes -> returns true
        editedAlice = new PersonBuilder(ALICE).withTags(VALID_TAG_HUSBAND).build();
        assertTrue(ALICE.isSameTask(editedAlice));
    }

    @Test
    public void equals() {
        // same values -> returns true
        Task aliceCopy = new PersonBuilder(ALICE).build();
<<<<<<< HEAD
        assertTrue(ALICE.equals(aliceCopy));

        // same object -> returns true
        assertTrue(ALICE.equals(ALICE));

        // null -> returns false
        assertFalse(ALICE.equals(null));

        // different type -> returns false
        assertFalse(ALICE.equals(5));

        // different person -> returns false
        assertFalse(ALICE.equals(BOB));

        // different name -> returns false
        Task editedAlice = new PersonBuilder(ALICE).withName(VALID_NAME_BOB).build();
        assertFalse(ALICE.equals(editedAlice));

        // different phone -> returns false
        editedAlice = new PersonBuilder(ALICE).withPhone(VALID_PHONE_BOB).build();
        assertFalse(ALICE.equals(editedAlice));

        // different module code -> returns false
        editedAlice = new PersonBuilder(ALICE).withEmail(VALID_MODULE_CODE_BOB).build();
        assertFalse(ALICE.equals(editedAlice));

        // different tags -> returns false
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
    }
}
