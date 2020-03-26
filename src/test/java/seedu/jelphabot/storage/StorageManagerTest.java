package seedu.jelphabot.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static seedu.jelphabot.testutil.TypicalTasks.getTypicalJelphaBot;

import java.nio.file.Path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import seedu.jelphabot.commons.core.GuiSettings;
import seedu.jelphabot.model.JelphaBot;
import seedu.jelphabot.model.ReadOnlyJelphaBot;
import seedu.jelphabot.model.UserPrefs;

public class StorageManagerTest {

    @TempDir
    public Path testFolder;

    private StorageManager storageManager;

    @BeforeEach
    public void setUp() {
        JsonJelphaBotStorage jelphaBotStorage = new JsonJelphaBotStorage(
            getTempFilePath("ab"), getTempFilePath("reminder"));
        JsonUserPrefsStorage userPrefsStorage = new JsonUserPrefsStorage(getTempFilePath("prefs"));
        storageManager = new StorageManager(jelphaBotStorage, userPrefsStorage);
    }

    private Path getTempFilePath(String fileName) {
        return testFolder.resolve(fileName);
    }

    @Test
    public void prefsReadSave() throws Exception {
        /*
         * Note: This is an integration test that verifies the StorageManager is properly wired to the
         * {@link JsonUserPrefsStorage} class.
         * More extensive testing of UserPref saving/reading is done in {@link JsonUserPrefsStorageTest} class.
         */
        UserPrefs original = new UserPrefs();
        original.setGuiSettings(new GuiSettings(300, 600, 4, 6));
        storageManager.saveUserPrefs(original);
        UserPrefs retrieved = storageManager.readUserPrefs().get();
        assertEquals(original, retrieved);
    }

    @Test
    public void addressBookReadSave() throws Exception {
        /*
         * Note: This is an integration test that verifies the StorageManager is properly wired to the
         * {@link JsonJelphaBotStorage} class.
         * More extensive testing of UserPref saving/reading is done in {@link JsonJelphaBotStorageTest} class.
         */
        JelphaBot original = getTypicalJelphaBot();
        storageManager.saveJelphaBot(original);
        ReadOnlyJelphaBot retrieved = storageManager.readJelphaBot().get();
        assertEquals(original, new JelphaBot(retrieved));
    }

    @Test
    public void getJelphaBotFilePath() {
        assertNotNull(storageManager.getJelphaBotFilePath());
    }

}