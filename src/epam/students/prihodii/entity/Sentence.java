package epam.students.prihodii.entity;

import java.util.ArrayList;
import java.util.List;

import static epam.students.prihodii.regex.RegexConstants.PART_OF_SENTENCE_SPLITTER;
import static epam.students.prihodii.regex.RegexConstants.PUNCTUATION_MATCHER;

/**
 * This class provides a implementation of the Sentence
 * class. Sentence can build of part's (words, spaces,
 * punctuation marks).
 *
 * @author Nickolay Prihodii
 */

public class Sentence {

    /**
     * list of PartOfSentence holder.
     */
    private List<PartOfSentence> partsOfSentence = new ArrayList<>();

    /**
     * Create new sentence. Input string splits to sentence part.
     *
     * @param sentence string which represent char sequence for
     *                 create instance of Sentence
     */
    public Sentence(String sentence) {
        for (String s : sentence.split(PART_OF_SENTENCE_SPLITTER)) {
            if (s.matches(PUNCTUATION_MATCHER) || s.isEmpty()) {
                partsOfSentence.add(new PartOfSentence(s));
            } else {
                partsOfSentence.add(new Word(s));
            }
        }
    }

    /**
     * Getter for Sentence class.
     *
     * @return list of part of sentence values which represents instance
     *         of sentence
     */
    public List<PartOfSentence> getPartsOfSentence() {
        return partsOfSentence;
    }

    /**
     * @return int value - number of words contains in this sentence
     */
    public int getWordsNumber() {
        int wordsCount = 0;
        for (PartOfSentence part : partsOfSentence) {
            if (part instanceof Pronounceable) {
                wordsCount++;
            }
        }
        return wordsCount;
    }

    /**
     * Compares the specified sentence with this sentence for equality.
     *
     * @param o object to be compared for equality with this sentence
     * @return true if the specified sentence is equal to this sentence
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;

        Sentence sentence = (Sentence) o;

        if (!partsOfSentence.equals(sentence.partsOfSentence)) return false;

        return true;
    }

    /**
     * @return a string representation of the sentence.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (PartOfSentence part : partsOfSentence) {
            sb.append(part.toString());
        }
        return sb.toString();
    }
}
