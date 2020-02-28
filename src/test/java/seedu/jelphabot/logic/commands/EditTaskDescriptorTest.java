package seedu.jelphabot.logic.commands;

import org.junit.jupiter.api.Test;
import seedu.jelphabot.logic.commands.EditCommand.EditPersonDescriptor;
import seedu.jelphabot.testutil.EditPersonDescriptorBuilder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.jelphabot.logic.commands.CommandTestUtil.*;

<<<<<<< HEAD
public class EditTaskDescriptorTest {
=======
public class EditPersonDescriptorTest {
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf

    @Test
    public void equals() {
        // same values -> returns true
        EditPersonDescriptor descriptorWithSameValues = new EditPersonDescriptor(DESC_AMY);
        assertTrue(DESC_AMY.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_AMY.equals(DESC_AMY));

        // null -> returns false
        assertFalse(DESC_AMY.equals(null));

        // different types -> returns false
        assertFalse(DESC_AMY.equals(5));

        // different values -> returns false
        assertFalse(DESC_AMY.equals(DESC_BOB));

        // different name -> returns false
        EditPersonDescriptor editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withDescription(VALID_NAME_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different phone -> returns false
<<<<<<< HEAD
<<<<<<< HEAD:src/test/java/seedu/jelphabot/logic/commands/EditTaskDescriptorTest.java
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withPhone(VALID_PHONE_BOB).build();
=======
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY)
                .build();
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf:src/test/java/seedu/jelphabot/logic/commands/EditPersonDescriptorTest.java
=======
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY)
                .build();
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
        assertFalse(DESC_AMY.equals(editedAmy));

        // different module code -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withModuleCode(VALID_MODULE_CODE_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different tags -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withTags(VALID_TAG_HUSBAND).build();
        assertFalse(DESC_AMY.equals(editedAmy));
    }
}
