package epam.students.prihodii.entity;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SymbolTest {

    private Symbol nullSymbol;
    private Symbol notNullSymbol;

    @Before
    public void setUp() throws Exception {
        notNullSymbol = new Symbol('s');
    }


    @Test
    public void testSymbol_notNullSymbol_expectedEquals() throws Exception {
        assertEquals(new Symbol('s'), notNullSymbol);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSymbol_nullSymbol_expectedNPE() throws Exception {
        nullSymbol.getSymbol();
    }

    @Test
    public void testGetSymbol_notNullSymbol_expectedEquals() throws Exception {
        assertEquals(new Symbol('s').getSymbol(), notNullSymbol.getSymbol());
    }
}
