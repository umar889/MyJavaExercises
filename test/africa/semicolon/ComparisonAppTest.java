package africa.semicolon;

import ChapterTwoExercises.ComparisonApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonAppTest {
    @Test
    void testThatAppCanCompareTwoNumbersAndDisplayLargerNumberFollowedBy_IsLarger(){
        ComparisonApp umarApp = new ComparisonApp();
        assertEquals ("7 is larger", umarApp.compare(5,7));
    }
    @Test
    void testThatAppCanCompareTwoNumbersAndDisplay_WordsAreEqual_WhenNumbersAreEqual(){
        ComparisonApp umarApp = new ComparisonApp();
        assertEquals("Numbers are equal", umarApp.compare(5,5));
    }
}
