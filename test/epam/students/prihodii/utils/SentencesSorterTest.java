package epam.students.prihodii.utils;

import epam.students.prihodii.entity.Text;
import org.junit.Before;
import org.junit.Test;

import static epam.students.prihodii.utils.SentencesSorter.sortByWordsNumber;
import static junit.framework.Assert.assertEquals;

public class SentencesSorterTest {

    private static final String NON_EMPTY_TEXT = "   The regular expressions    reference" +
            " on - this website functions... Both as       a reference to all available r" +
            "egex syntax and as a comparison of the features     supported   by the regul" +
            "ar expression: flavors discussed       in the tutorial! The reference tables" +
            " pack an incredible amount of information.       To get the most out of them" +
            ", follow this legend to\t learn how to read them.";

    private static final String NON_EMPTY_TEXT_SORTED = "The regular expressions referenc" +
            "e on - this website functions... The reference tables pack an incredible amo" +
            "unt of information. To get the most out of them, follow this legend to learn" +
            " how to read them. Both as a reference to all available regex syntax and as " +
            "a comparison of the features supported by the regular expression: flavors di" +
            "scussed in the tutorial!";

    private Text nullText;
    private Text emptyText;
    private Text nonEmptyText;

    @Before
    public void setUp() throws Exception {
        emptyText = new Text("");
        nonEmptyText = new Text(NON_EMPTY_TEXT);
    }

    @Test(expected = NullPointerException.class)
    public void testSortByWordsNumber_nullText_expectedNPE() throws Exception {
        sortByWordsNumber(nullText);
    }

    @Test
    public void testSortByWordsNumber_emptyText_expectedEquals() throws Exception {
        sortByWordsNumber(emptyText);
        assertEquals(new Text(""), emptyText);
    }

    @Test
    public void testSortByWordsNumber_nonEmptyText_expectedEquals() throws Exception {
        sortByWordsNumber(nonEmptyText);
        assertEquals(new Text(NON_EMPTY_TEXT_SORTED), nonEmptyText);
    }
}
