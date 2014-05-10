package epam.students.prihodii.entity;

import java.util.ArrayList;
import java.util.List;

import static epam.students.prihodii.regex.RegexConstants.SENTENCES_SPLITTER;

/**
 * This class provides a implementation of the Text
 * class. Text can build of part's (sentences).
 *
 * @author Nickolay Prihodii
 */

public class Text {

    /**
     * list of Sentence holder.
     */
    private List<Sentence> sentences = new ArrayList<>();

    /**
     * Create new text. Input string splits to sentence.
     *
     * @param text string which represent char sequence for
     *             create instance of text
     */
    public Text(String text) {
        text = text.replaceAll("\\s+", " ").trim();
        for (String s : text.split(SENTENCES_SPLITTER)) {
            this.sentences.add(new Sentence(s));
        }
    }

    /**
     * Getter for Text class.
     *
     * @return list of sentences which represents instance
     *         of text
     */
    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * Compares the specified text with this text for equality.
     *
     * @param o object to be compared for equality with this text
     * @return true if the specified text is equal to this text
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;

        Text text = (Text) o;

        if (!sentences.equals(text.sentences)) return false;

        return true;
    }

    /**
     * @return a string representation of the text.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString());
            sb.append(' ');
        }
        return sb.toString().trim();
    }
}
