package seedu.jelphabot.storage;

import static seedu.jelphabot.testutil.TypicalTasks.BENSON;

import java.util.List;
import java.util.stream.Collectors;

// TODO rewrite entire test class to replace missing fields
public class JsonAdaptedTaskTest {
    private static final String INVALID_NAME = "R@chel";
    private static final String INVALID_PHONE = "+651234";
    private static final String INVALID_ADDRESS = " ";
    private static final String INVALID_MODULE_CODE = "example.com";
    private static final String INVALID_TAG = "#friend";
    private static final String INVALID_DATETIME = "Jan 2 2020 11 11";

    private static final String VALID_NAME = BENSON.getDescription().toString();
    private static final String VALID_MODULE_CODE = BENSON.getModuleCode().toString();
    private static final String VALID_DATETIME = BENSON.getDateTime().toString();
    private static final List<JsonAdaptedTag> VALID_TAGS = BENSON.getTags().stream()
            .map(JsonAdaptedTag::new)
            .collect(Collectors.toList());

//    @Test
//    public void toModelType_validPersonDetails_returnsPerson() throws Exception {
//        JsonAdaptedTask person = new JsonAdaptedTask(BENSON);
//        assertEquals(BENSON, person.toModelType());
//    }
//
//    @Test
//    public void toModelType_invalidName_throwsIllegalValueException() {
//        JsonAdaptedTask person =
//                new JsonAdaptedTask(INVALID_NAME, VALID_PHONE, VALID_MODULE_CODE, VALID_ADDRESS, VALID_TAGS);
//        String expectedMessage = Description.MESSAGE_CONSTRAINTS;
//        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
//    }
//
//    @Test
//    public void toModelType_nullName_throwsIllegalValueException() {
//        JsonAdaptedTask person = new JsonAdaptedTask(null, VALID_PHONE, VALID_MODULE_CODE, VALID_ADDRESS, VALID_TAGS);
//        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Description.class.getSimpleName());
//        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
//    }

//    @Test
//    public void toModelType_invalidPhone_throwsIllegalValueException() {
//        JsonAdaptedTask person =
//                new JsonAdaptedTask(VALID_NAME, INVALID_PHONE, VALID_MODULE_CODE, VALID_ADDRESS, VALID_TAGS);
//        String expectedMessage = Phone.MESSAGE_CONSTRAINTS;
//        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
//    }
//
//    @Test
//    public void toModelType_nullPhone_throwsIllegalValueException() {
//        JsonAdaptedTask person = new JsonAdaptedTask(VALID_NAME, null, VALID_MODULE_CODE, VALID_ADDRESS, VALID_TAGS);
//        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Phone.class.getSimpleName());
//        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
//    }
//
//    @Test
//    public void toModelType_invalidModuleCode_throwsIllegalValueException() {
//        JsonAdaptedTask person =
//                new JsonAdaptedTask(VALID_NAME, INVALID_MODULE_CODE, VALID_TAGS, VALID_DATETIME);
//        String expectedMessage = ModuleCode.MESSAGE_CONSTRAINTS;
//        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
//    }
//
//    @Test
//    public void toModelType_nullModuleCode_throwsIllegalValueException() {
//        JsonAdaptedTask person = new JsonAdaptedTask(VALID_NAME, null, VALID_TAGS, VALID_DATETIME);
//        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, ModuleCode.class.getSimpleName());
//        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
//    }

    /*@Test
    public void toModelType_invalidAddress_throwsIllegalValueException() {
        JsonAdaptedTask person =
                new JsonAdaptedTask(VALID_NAME, VALID_PHONE, VALID_MODULE_CODE, INVALID_ADDRESS, VALID_TAGS);
        String expectedMessage = Address.MESSAGE_CONSTRAINTS;
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }

    @Test
    public void toModelType_nullAddress_throwsIllegalValueException() {
        JsonAdaptedTask person = new JsonAdaptedTask(VALID_NAME, VALID_PHONE, VALID_MODULE_CODE, null, VALID_TAGS);
        String expectedMessage = String.format(MISSING_FIELD_MESSAGE_FORMAT, Address.class.getSimpleName());
        assertThrows(IllegalValueException.class, expectedMessage, person::toModelType);
    }*/

//    @Test
//    public void toModelType_invalidTags_throwsIllegalValueException() {
//        List<JsonAdaptedTag> invalidTags = new ArrayList<>(VALID_TAGS);
//        invalidTags.add(new JsonAdaptedTag(INVALID_TAG));
//        JsonAdaptedTask person =
//                new JsonAdaptedTask(VALID_NAME, VALID_MODULE_CODE, invalidTags, VALID_DATETIME);
//        assertThrows(IllegalValueException.class, person::toModelType);
//    }

}
