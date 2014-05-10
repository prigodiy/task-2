package epam.students.prihodii.entity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SentenceTest {

    private static final String NON_EMPTY_SENTENCE = "To solve this problem, Java provides access specifiers.";

    private Sentence nullSentence;
    private Sentence emptySentence;
    private Sentence nonEmptySentence;

    @Before
    public void setUp() throws Exception {
        emptySentence = new Sentence("");
        nonEmptySentence = new Sentence(NON_EMPTY_SENTENCE);
    }

    @Test(expected = NullPointerException.class)
    public void testPartsOfSentence_nullSentence_expectedNPE() throws Exception {
        nullSentence = new Sentence(null);
    }

    @Test
    public void testPartsOfSentence_emptySentence_expectedEqual() throws Exception {
        assertEquals(new Sentence(""), emptySentence);
    }

    @Test
    public void testPartsOfSentence_nonEmptySentence_expectedEqual() throws Exception {
        assertEquals(new Sentence(NON_EMPTY_SENTENCE),
                nonEmptySentence);
    }

    @Test(expected = NullPointerException.class)
    public void testGetPartsOfSentence_nullSentence_expectedNPE() throws Exception {
        nullSentence.getPartsOfSentence();
    }

    @Test
    public void testGetPartsOfSentence_emptySentence_expectedEquals() throws Exception {
        assertEquals(new Sentence("").getPartsOfSentence(),
                emptySentence.getPartsOfSentence());
    }

    @Test
    public void testGetPartsOfSentence_nonEmptySentence_expectedEquals() throws Exception {
        assertEquals(new Sentence(NON_EMPTY_SENTENCE).getPartsOfSentence(),
                nonEmptySentence.getPartsOfSentence());
    }

    @Test(expected = NullPointerException.class)
    public void testGetWordsNumber_nullSentence_expectedNPE() throws Exception {
        nullSentence.getWordsNumber();
    }

    @Test
    public void testGetWordsNumber_emptySentence_expectedEquals() throws Exception {
        assertEquals(0, emptySentence.getWordsNumber());
    }

    @Test
    public void testGetWordsNumber_nonEmptySentence_expectedEquals() throws Exception {
        assertEquals(8, nonEmptySentence.getWordsNumber());
    }
}
