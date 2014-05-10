package epam.students.prihodii.entity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PartOfSentenceTest {

    private PartOfSentence nullPart;
    private PartOfSentence emptyPart;
    private PartOfSentence nonEmptyPart;

    @Before
    public void setUp() throws Exception {
        emptyPart = new PartOfSentence("");
        nonEmptyPart = new PartOfSentence("test");
    }

    @Test(expected = NullPointerException.class)
    public void testPartOfSentence_nullPart_expectedNPE() throws Exception {
        nullPart = new PartOfSentence(null);
    }

    @Test
    public void testPartOfSentence_emptyPart_expectedEquals() throws Exception {
        assertEquals(new PartOfSentence(""), emptyPart);
    }

    @Test
    public void testPartOfSentence_nonEmptyPart_expectedEquals() throws Exception {
        assertEquals(new PartOfSentence("test"), nonEmptyPart);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSymbols_nullPart_expectedNPE() throws Exception {
        nullPart.getSymbols();
    }

    @Test
    public void testGetSymbols_emptyPart_expectedEquals() throws Exception {
        assertEquals(new PartOfSentence("").getSymbols(), emptyPart.getSymbols());
    }

    @Test
    public void testGetSymbols_nonEmptyPart_expectedEquals() throws Exception {
        assertEquals(new PartOfSentence("test").getSymbols(), nonEmptyPart.getSymbols());
    }
}
