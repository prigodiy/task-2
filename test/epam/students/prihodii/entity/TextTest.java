package epam.students.prihodii.entity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TextTest {

    private static final String NON_EMPTY_TEXT = "   The regular expressions    reference" +
            " on - this website functions... Both as       a reference to all available r" +
            "egex syntax and as a comparison of the features     supported   by the regul" +
            "ar expression: flavors discussed       in the tutorial! The reference tables" +
            " pack an incredible amount of information.       To get the most out of them" +
            ", follow this legend to\t learn how to read them.";

    private Text nullText;
    private Text emptyText;
    private Text nonEmptyText;

    @Before
    public void setUp() throws Exception {
        emptyText = new Text("");
        nonEmptyText = new Text(NON_EMPTY_TEXT);
    }

    @Test(expected = NullPointerException.class)
    public void testSentences_nullText_expectedNPE() throws Exception {
        nullText = new Text(null);
    }

    @Test
    public void testSentences_emptyText_expectedEquals() throws Exception {
        assertEquals(new Text(""), emptyText);
    }

    @Test
    public void testSentences_nonEmptyText_expectedEquals() throws Exception {
        assertEquals(new Text(NON_EMPTY_TEXT), nonEmptyText);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSentences_nullText_expectedNPE() throws Exception {
        nullText.getSentences();
    }

    @Test
    public void testGetSentences_emptyText_expectedEquals() throws Exception {
        assertEquals(new Text("").getSentences(), emptyText.getSentences());
    }

    @Test
    public void testGetSentences_nonEmptyText_expectedEquals() throws Exception {
        assertEquals(new Text(NON_EMPTY_TEXT).getSentences(), nonEmptyText.getSentences());
    }
}
