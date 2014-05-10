package epam.students.prihodii.entity;

/**
 * The Symbol class wraps a value of the primitive type char in an
 * object. An object of type Symbol contains a single field whose
 * type is char.
 *
 * @author Nikolay Prihodii
 */

public class Symbol {

    /**
     * Char value holder.
     */
    private char symbol;

    /**
     * Constructs symbol.
     *
     * @param symbol char value which represents instance of Symbol
     */
    Symbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter for Symbol class.
     *
     * @return symbol char value which represents instance of Symbol
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Compares the specified symbol with this symbol for equality.
     *
     * @param o object to be compared for equality with this symbol
     * @return true if the specified symbol is equal to this symbol
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol1 = (Symbol) o;

        if (symbol != symbol1.symbol) return false;

        return true;
    }

    /**
     * @return a string representation of the symbol.
     */
    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
