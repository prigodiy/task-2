package epam.students.prihodii.entity;

/**
 * This class provides a implementation of the Word
 * class. Word inherits from PartOfSentence class and
 * implements marker interface Pronounceable.
 *
 * @author Nickolay Prihodii
 */

public class Word extends PartOfSentence implements Pronounceable {

    /**
     * Create new word.
     *
     * @param charSeq string which represent char sequence for
     *                create instance of word
     */
    public Word(String charSeq) {
        super(charSeq);
    }
}
