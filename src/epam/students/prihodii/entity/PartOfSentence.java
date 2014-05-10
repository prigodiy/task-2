package epam.students.prihodii.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a implementation of the PartOfSentence
 * class. Part of sentence is space, word or punctuation mark.
 *
 * @author Nickolay Prihodii
 */

public class PartOfSentence {

    /**
     * list of Symbols holder.
     */
    private List<Symbol> symbols = new ArrayList<>();


    /**
     * Create new part of sentence (word, punctuation, space).
     *
     * @param charSeq string which represent char sequence for
     *                create instance of part of sentence
     */
    public PartOfSentence(String charSeq) {
        for (char c : charSeq.toCharArray()) {
            symbols.add(new Symbol(c));
        }
    }

    /**
     * Getter for PartOfSentence class.
     *
     * @return list of symbols values which represents instance
     *         of part of sentence
     */
    public List<Symbol> getSymbols() {
        return symbols;
    }

    /**
     * Compares the specified part of sentence with this part of
     * sentence for equality.
     *
     * @param o object to be compared for equality with this part
     *          of sentence
     * @return true if the specified part of sentence is equal to
     *         this part of sentence
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PartOfSentence)) return false;

        PartOfSentence that = (PartOfSentence) o;

        if (!symbols.equals(that.symbols)) return false;

        return true;
    }

    /**
     * @return a string representation of the part of sentence.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Symbol symbol : symbols) {
            sb.append(symbol.toString());
        }
        return sb.toString();
    }
}
