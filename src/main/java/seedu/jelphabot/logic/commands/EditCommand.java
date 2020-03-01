package seedu.jelphabot.logic.commands;

import seedu.jelphabot.commons.core.Messages;
import seedu.jelphabot.commons.core.index.Index;
import seedu.jelphabot.commons.util.CollectionUtil;
import seedu.jelphabot.logic.commands.exceptions.CommandException;
import seedu.jelphabot.model.Model;
import seedu.jelphabot.model.tag.Tag;
import seedu.jelphabot.model.task.*;

import java.util.*;

import static java.util.Objects.requireNonNull;
import static seedu.jelphabot.logic.parser.CliSyntax.*;
import static seedu.jelphabot.model.Model.PREDICATE_SHOW_ALL_PERSONS;

/**
 * Edits the details of an existing person in the address book.
 */
// TODO replace command with updated fields.
public class EditCommand extends Command {

    public static final String COMMAND_WORD = "edit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Edits the details of the person identified "
            + "by the index number used in the displayed person list. "
            + "Existing values will be overwritten by the input values.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + "[" + PREFIX_NAME + "NAME] "
            + "[" + PREFIX_PHONE + "PHONE] "
            + "[" + PREFIX_MODULE_CODE + "MODULE_CODE] "
            + "[" + PREFIX_ADDRESS + "ADDRESS] "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " 1 "
            + PREFIX_PHONE + "91234567 "
            + PREFIX_MODULE_CODE + "johndoe@example.com";

    public static final String MESSAGE_EDIT_PERSON_SUCCESS = "Edited Person: %1$s";
    public static final String MESSAGE_NOT_EDITED = "At least one field to edit must be provided.";
    public static final String MESSAGE_DUPLICATE_PERSON = "This person already exists in the address book.";

    private final Index index;
    private final EditPersonDescriptor editPersonDescriptor;

    /**
     * @param index of the person in the filtered person list to edit
     * @param editPersonDescriptor details to edit the person with
     */
    public EditCommand(Index index, EditPersonDescriptor editPersonDescriptor) {
        requireNonNull(index);
        requireNonNull(editPersonDescriptor);

        this.index = index;
        this.editPersonDescriptor = new EditPersonDescriptor(editPersonDescriptor);
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (index.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToEdit = lastShownList.get(index.getZeroBased());
        Person editedPerson = createEditedPerson(personToEdit, editPersonDescriptor);

        if (!taskToEdit.isSameTask(editedTask) && model.hasPerson(editedTask)) {
            throw new CommandException(MESSAGE_DUPLICATE_PERSON);
        }

        model.setPerson(personToEdit, editedPerson);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(String.format(MESSAGE_EDIT_PERSON_SUCCESS, editedPerson));
    }

    /**
     * Creates and returns a {@code Person} with the details of {@code personToEdit}
     * edited with {@code editPersonDescriptor}.
     */
    private static Person createEditedPerson(Person personToEdit, EditPersonDescriptor editPersonDescriptor) {
        assert personToEdit != null;

        Description updatedDescription = editPersonDescriptor.getDescription().orElse(taskToEdit.getDescription());
        ModuleCode updatedModuleCode = editPersonDescriptor.getModuleCode().orElse(taskToEdit.getModuleCode());
        Set<Tag> updatedTags = editPersonDescriptor.getTags().orElse(taskToEdit.getTags());
<<<<<<< HEAD

        return new Task(updatedDescription, new Status(), new DateTime(), updatedModuleCode, updatedTags);
=======
        DateTime dateTime = editPersonDescriptor.getDateTime().orElse(taskToEdit.getDateTime());
        Status updatedStatus = editPersonDescriptor.getStatus();
        Priority updatedPriority = editPersonDescriptor.getPriority();

        return new Task(updatedDescription, updatedStatus, dateTime, updatedModuleCode, updatedPriority, updatedTags);
>>>>>>> 5808c88f33b3f239fb811943d7249a19db5879df
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof EditCommand)) {
            return false;
        }

        // state check
        EditCommand e = (EditCommand) other;
        return index.equals(e.index)
                && editPersonDescriptor.equals(e.editPersonDescriptor);
    }

    /**
     * Stores the details to edit the person with. Each non-empty field value will replace the
     * corresponding field value of the person.
     */
    public static class EditPersonDescriptor {
        private Description description;
        private ModuleCode moduleCode;
        private Set<Tag> tags;
<<<<<<< HEAD
=======
        private DateTime dateTime;
        private Status status;
        private Priority priority;
>>>>>>> 5808c88f33b3f239fb811943d7249a19db5879df

        public EditPersonDescriptor() {}

        /**
         * Copy constructor.
         * A defensive copy of {@code tags} is used internally.
         */
        public EditPersonDescriptor(EditPersonDescriptor toCopy) {
            setDescription(toCopy.description);
            setModuleCode(toCopy.moduleCode);
            setTags(toCopy.tags);
<<<<<<< HEAD
=======
            setDateTime(toCopy.dateTime);
            setStatus(toCopy.status);
            setPriority(toCopy.priority);
>>>>>>> 5808c88f33b3f239fb811943d7249a19db5879df
        }

        /**
         * Returns true if at least one field is edited.
         */
        public boolean isAnyFieldEdited() {
            return CollectionUtil.isAnyNonNull(description, moduleCode, tags);
        }

        public Optional<Description> getDescription() {
            return Optional.ofNullable(description);
        }

        public void setDescription(Description description) {
            this.description = description;
        }

        public Optional<ModuleCode> getModuleCode() {
            return Optional.ofNullable(moduleCode);
        }

        public void setModuleCode(ModuleCode moduleCode) {
            this.moduleCode = moduleCode;
        }

        /**
         * Sets {@code tags} to this object's {@code tags}.
         * A defensive copy of {@code tags} is used internally.
         */
        public void setTags(Set<Tag> tags) {
            this.tags = (tags != null) ? new HashSet<>(tags) : null;
        }

        /**
         * Returns an unmodifiable tag set, which throws {@code UnsupportedOperationException}
         * if modification is attempted.
         * Returns {@code Optional#empty()} if {@code tags} is null.
         */
        public Optional<Set<Tag>> getTags() {
            return (tags != null) ? Optional.of(Collections.unmodifiableSet(tags)) : Optional.empty();
        }

<<<<<<< HEAD
=======
        public void setDateTime(DateTime dateTime) {
            this.dateTime = dateTime;
        }

        public Optional<DateTime> getDateTime() {
            return Optional.ofNullable(dateTime);
        }

        public void setPriority(Priority priority) {
            this.priority = priority;
        }

        public Priority getPriority() {
            return this.priority;
        }

>>>>>>> 5808c88f33b3f239fb811943d7249a19db5879df
        @Override
        public boolean equals(Object other) {
            // short circuit if same object
            if (other == this) {
                return true;
            }

            // instanceof handles nulls
            if (!(other instanceof EditPersonDescriptor)) {
                return false;
            }

            // state check
            EditPersonDescriptor e = (EditPersonDescriptor) other;

<<<<<<< HEAD
            return getDescription().equals(e.getDescription())
                    && getModuleCode().equals(e.getModuleCode())
                    && getTags().equals(e.getTags());
=======
            return getDescription().equals(e.getDescription()) && getModuleCode().equals(e.getModuleCode())
                    && getStatus().equals(e.getStatus()) && getDateTime().equals(e.getDateTime())
                    && getTags().equals(e.getTags()) && getPriority().equals(e.getPriority());
>>>>>>> 5808c88f33b3f239fb811943d7249a19db5879df
        }
    }
}
