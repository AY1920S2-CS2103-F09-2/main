package seedu.jelphabot.model.reminder;

import static java.util.Objects.requireNonNull;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import seedu.jelphabot.model.reminder.exceptions.DuplicateReminderException;

/**
 * A list of reminders that enforces uniqueness between its elements and does not allow nulls.
 * A task is considered unique by comparing using {@code Reminder#isSameReminder(Reminder)}.
 * As such, adding and updating of tasks uses Task#isSameTask(Task)
 * for equality so as to ensure that the task being added or updated is
 * unique in terms of identity in the UniqueTaskList. However, the removal of a task uses Task#equals(Object) so
 * as to ensure that the task with exactly the same fields will be removed.
 * <p>
 * Supports a minimal set of list operations.
 */
public class UniqueReminderShowsTaskList implements Iterable<ReminderShowsTask> {

    private final ObservableList<ReminderShowsTask> internalList = FXCollections.observableArrayList();
    private final ObservableList<ReminderShowsTask> internalUnmodifiableList =
        FXCollections.unmodifiableObservableList(internalList);

    /**
     * Returns true if the list contains an equivalent ReminderShowsTask as the given argument.
     */
    public boolean contains(ReminderShowsTask toCheck) {
        requireNonNull(toCheck);
        return internalList.stream().anyMatch(toCheck::equals);
    }

    /**
     * Adds a reminder to the list.
     * The reminder must not already exist in the list.
     */
    public void add(ReminderShowsTask toAdd) {
        requireNonNull(toAdd);
        if (contains(toAdd)) {
            throw new DuplicateReminderException();
        }
        internalList.add(toAdd);
    }

    public ObservableList<ReminderShowsTask> asUnmodifiableObservableList() {
        return internalUnmodifiableList;
    }

    @Override
    public Iterator<ReminderShowsTask> iterator() {
        return internalList.iterator();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                   || (other instanceof UniqueReminderShowsTaskList // instanceof handles nulls
                           && internalList.equals(((UniqueReminderShowsTaskList) other).internalList));
    }

    /**
     * Returns true if {@code reminderShowsTaskList} contains only unique reminderShowsTasks.
     */
    public boolean remindersAreUnique(List<ReminderShowsTask> reminderShowsTaskList) {
        HashSet<ReminderShowsTask> seen = new HashSet<>();
        for (ReminderShowsTask reminder : reminderShowsTaskList) {
            if (seen.contains(reminder)) {
                return false;
            }
            seen.add(reminder);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return internalList.hashCode();
    }

}
