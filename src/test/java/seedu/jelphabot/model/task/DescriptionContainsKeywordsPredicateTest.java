package seedu.jelphabot.model.task;

import org.junit.jupiter.api.Test;
import seedu.jelphabot.testutil.TaskBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DescriptionContainsKeywordsPredicateTest {

    @Test
    public void equals() {
        List<String> firstPredicateKeywordList = Collections.singletonList("first");
        List<String> secondPredicateKeywordList = Arrays.asList("first", "second");

        DescriptionContainsKeywordsPredicate firstPredicate = new DescriptionContainsKeywordsPredicate(firstPredicateKeywordList);
        DescriptionContainsKeywordsPredicate secondPredicate = new DescriptionContainsKeywordsPredicate(secondPredicateKeywordList);

        // same object -> returns true
        assertEquals(firstPredicate, firstPredicate);

        // same values -> returns true
        DescriptionContainsKeywordsPredicate firstPredicateCopy = new DescriptionContainsKeywordsPredicate(firstPredicateKeywordList);
        assertEquals(firstPredicate, firstPredicateCopy);

        // different types -> returns false
        assertNotEquals(1, firstPredicate);

        // null -> returns false
        assertNotEquals(null, firstPredicate);

        // different person -> returns false
        assertNotEquals(firstPredicate, secondPredicate);
    }

    @Test
    public void test_nameContainsKeywords_returnsTrue() {
        // One keyword
        DescriptionContainsKeywordsPredicate predicate = new DescriptionContainsKeywordsPredicate(Collections.singletonList("Alice"));
        assertTrue(predicate.test(new TaskBuilder().withName("Alice Bob").build()));

        // Multiple keywords
        predicate = new DescriptionContainsKeywordsPredicate(Arrays.asList("Alice", "Bob"));
        assertTrue(predicate.test(new TaskBuilder().withName("Alice Bob").build()));

        // Only one matching keyword
        predicate = new DescriptionContainsKeywordsPredicate(Arrays.asList("Bob", "Carol"));
        assertTrue(predicate.test(new TaskBuilder().withName("Alice Carol").build()));

        // Mixed-case keywords
        predicate = new DescriptionContainsKeywordsPredicate(Arrays.asList("aLIce", "bOB"));
        assertTrue(predicate.test(new TaskBuilder().withName("Alice Bob").build()));
    }

    @Test
    public void test_nameDoesNotContainKeywords_returnsFalse() {
        // Zero keywords
        DescriptionContainsKeywordsPredicate predicate = new DescriptionContainsKeywordsPredicate(Collections.emptyList());
        assertFalse(predicate.test(new TaskBuilder().withName("Alice").build()));

        // Non-matching keyword
        predicate = new DescriptionContainsKeywordsPredicate(Arrays.asList("Carol"));
        assertFalse(predicate.test(new TaskBuilder().withName("Alice Bob").build()));

        // Keywords match phone, module code and address, but does not match name
        predicate = new DescriptionContainsKeywordsPredicate(Arrays.asList("12345", "alice@email.com", "Main", "Street"));
<<<<<<< HEAD
<<<<<<< HEAD
        assertFalse(predicate.test(new PersonBuilder().withName("Alice").withPhone("12345")
=======
        assertFalse(predicate.test(new PersonBuilder().withName("Alice")
>>>>>>> 95397b1d4961ff23ae35cb13d7514e827de096bf
                .withEmail("alice@email.com").build()));
=======
        assertFalse(predicate.test(new TaskBuilder().withName("Alice")
                .withModuleCode("alice@email.com").build()));
>>>>>>> d45233b98fc1ee46828325c99aaf8bd09fefdaa5
    }
}
