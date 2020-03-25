package seedu.jelphabot.storage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.jelphabot.commons.exceptions.IllegalValueException;
import seedu.jelphabot.model.tag.Tag;
import seedu.jelphabot.model.task.DateTime;
import seedu.jelphabot.model.task.Description;
import seedu.jelphabot.model.task.ModuleCode;
import seedu.jelphabot.model.task.Priority;
import seedu.jelphabot.model.task.Status;
import seedu.jelphabot.model.task.Task;

/**
 * Jackson-friendly version of {@link Task}.
 */
class JsonAdaptedTask {

    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Task's %s field is missing!";

    private final String description;
    private final Status status;
    private final String dateTime;
    private final String moduleCode;
    private final Priority priority;
    private final List<JsonAdaptedTag> tagged = new ArrayList<>();
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    /**
     * Constructs a {@code JsonAdaptedTask} with the given task details.
     */
    @JsonCreator
    public JsonAdaptedTask(
        @JsonProperty("desc") String description,
        @JsonProperty("status") Status status,
        @JsonProperty("dateTime") String dateTime,
        @JsonProperty("module") String moduleCode,
        @JsonProperty("priority") Priority priority,
        @JsonProperty("tagged") List<JsonAdaptedTag> tagged,
        @JsonProperty("startTime") LocalDateTime startTime,
        @JsonProperty("endTime") LocalDateTime endTime) {
        this.description = description;
        this.status = status;
        this.dateTime = dateTime;
        this.moduleCode = moduleCode;
        this.priority = priority;
        if (tagged != null) {
            this.tagged.addAll(tagged);
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Converts a given {@code Task} into this class for Jackson use.
     */
    public JsonAdaptedTask(Task source) {
        this.description = source.getDescription().fullDescription;
        this.status = source.getStatus();
        this.dateTime = source.getDateTime().toString();
        this.moduleCode = source.getModuleCode().value;
        this.priority = source.getPriority();
        tagged.addAll(source.getTags().stream().map(JsonAdaptedTag::new).collect(Collectors.toList()));
        this.startTime = source.getStartTime();
        this.endTime = source.getEndTime();
    }

    /**
     * Converts this Jackson-friendly adapted task object into the model's
     * {@code Task} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in
     *                               the adapted task.
     */
    public Task toModelType() throws IllegalValueException {
        final List<Tag> taskTags = new ArrayList<>();
        for (JsonAdaptedTag tag : tagged) {
            taskTags.add(tag.toModelType());
        }

        if (description == null) {
            throw new IllegalValueException(
                    String.format(MISSING_FIELD_MESSAGE_FORMAT, Description.class.getSimpleName()));
        }
        if (!Description.isValidDescription(description)) {
            throw new IllegalValueException(Description.MESSAGE_CONSTRAINTS);
        }
        final Description modelDescription = new Description(description);

        if (moduleCode == null) {
            throw new IllegalValueException(
                    String.format(MISSING_FIELD_MESSAGE_FORMAT, ModuleCode.class.getSimpleName()));
        }
        if (!ModuleCode.isValidModuleCode(moduleCode)) {
            throw new IllegalValueException(ModuleCode.MESSAGE_CONSTRAINTS);
        }
        final ModuleCode modelModuleCode = new ModuleCode(moduleCode);

        if (dateTime == null) {
            throw new IllegalValueException(
                    String.format(MISSING_FIELD_MESSAGE_FORMAT, DateTime.class.getSimpleName()));
        }
        if (!DateTime.isValidDateTime(dateTime)) {
            throw new IllegalValueException(DateTime.MESSAGE_CONSTRAINTS);
        }
        final DateTime modelDateTime = new DateTime(dateTime);

        final Set<Tag> modelTags = new HashSet<>(taskTags);

        return new Task(
                modelDescription,
                status,
                modelDateTime,
                modelModuleCode,
                priority,
                modelTags,
                startTime,
                endTime
        );
    }

}
