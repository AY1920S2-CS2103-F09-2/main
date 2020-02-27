package seedu.jelphabot.model.task;

import seedu.jelphabot.model.tag.Tag;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static seedu.jelphabot.commons.util.CollectionUtil.requireAllNonNull;

/**
 * Represents a Person in the address book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Person {

    // Identity fields
    private final Description description;
    private final ModuleCode moduleCode;
    // TODO properly define status and dateTime
    private final Status status;
    private final DateTime dateTime;

    // Data fields
<<<<<<< HEAD:src/main/java/seedu/jelphabot/model/task/Person.java
    private final Address address;
=======
>>>>>>> 6ff1123f48edd14e24b902cf99cec113cde2eca6:src/main/java/seedu/jelphabot/model/task/Task.java
    private final Set<Tag> tags = new HashSet<>();

    /**
     * Every field must be present and not null.
     */
<<<<<<< HEAD:src/main/java/seedu/jelphabot/model/task/Person.java
    public Person(Name name, Phone phone, Email email, Address address, Set<Tag> tags) {
        requireAllNonNull(name, phone, email, address, tags);
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
=======
    public Task(Description description, Status status, DateTime dateTime, ModuleCode moduleCode, Set<Tag> tags) {
        requireAllNonNull(description, status, dateTime, moduleCode, tags);
        this.description = description;
        this.status = status;
        this.dateTime = dateTime;
        this.moduleCode = moduleCode;
>>>>>>> 6ff1123f48edd14e24b902cf99cec113cde2eca6:src/main/java/seedu/jelphabot/model/task/Task.java
        this.tags.addAll(tags);
    }


    public Description getDescription() {
        return description;
    }

    public ModuleCode getModuleCode() {
        return moduleCode;
    }

    public Address getAddress() {
        return address;
    }

    /**
     * Returns an immutable tag set, which throws {@code UnsupportedOperationException}
     * if modification is attempted.
     */
    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    /**
     * Returns true if both persons of the same description have at least one other identity field that is the same.
     * This defines a weaker notion of equality between two persons.
     */
<<<<<<< HEAD:src/main/java/seedu/jelphabot/model/task/Person.java
    public boolean isSamePerson(Person otherPerson) {
        if (otherPerson == this) {
            return true;
        }

        return otherPerson != null
                && otherPerson.getName().equals(getName())
                && (otherPerson.getPhone().equals(getPhone()) || otherPerson.getEmail().equals(getEmail()));
=======
    public boolean isSameTask(Task otherTask) {
        if (otherTask == this) {
            return true;
        }

        return otherTask != null
                && otherTask.getDescription().equals(getDescription())
                && otherTask.getModuleCode().equals(getModuleCode());
>>>>>>> 6ff1123f48edd14e24b902cf99cec113cde2eca6:src/main/java/seedu/jelphabot/model/task/Task.java
    }

    /**
     * Returns true if both persons have the same identity and data fields.
     * This defines a stronger notion of equality between two persons.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Person)) {
            return false;
        }

<<<<<<< HEAD:src/main/java/seedu/jelphabot/model/task/Person.java
        Person otherPerson = (Person) other;
        return otherPerson.getName().equals(getName())
                && otherPerson.getPhone().equals(getPhone())
                && otherPerson.getEmail().equals(getEmail())
                && otherPerson.getAddress().equals(getAddress())
                && otherPerson.getTags().equals(getTags());
=======
        Task otherTask = (Task) other;
        return otherTask.getDescription().equals(getDescription())
                && otherTask.getModuleCode().equals(getModuleCode())
                && otherTask.getTags().equals(getTags());
>>>>>>> 6ff1123f48edd14e24b902cf99cec113cde2eca6:src/main/java/seedu/jelphabot/model/task/Task.java
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
<<<<<<< HEAD:src/main/java/seedu/jelphabot/model/task/Person.java
        return Objects.hash(name, phone, email, address, tags);
=======
        return Objects.hash(description, moduleCode, tags);
>>>>>>> 6ff1123f48edd14e24b902cf99cec113cde2eca6:src/main/java/seedu/jelphabot/model/task/Task.java
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
<<<<<<< HEAD:src/main/java/seedu/jelphabot/model/task/Person.java
        builder.append(getName())
                .append(" Phone: ")
                .append(getPhone())
                .append(" Email: ")
                .append(getEmail())
                .append(" Address: ")
                .append(getAddress())
=======
        builder.append(getDescription())
                .append(" ModuleCode: ")
                .append(getModuleCode())
>>>>>>> 6ff1123f48edd14e24b902cf99cec113cde2eca6:src/main/java/seedu/jelphabot/model/task/Task.java
                .append(" Tags: ");
        getTags().forEach(builder::append);
        return builder.toString();
    }

}
