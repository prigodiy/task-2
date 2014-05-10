package epam.students.prihodii.utils;

import epam.students.prihodii.entity.Sentence;
import epam.students.prihodii.entity.Text;

import java.util.Collections;
import java.util.Comparator;

/**
 * This class provides static method for sort sentences in text;
 *
 * @author Nickolay Prihodii
 */

public class SentencesSorter {

    /**
     * Sentences sorts by word count
     *
     * @param text text for sort
     */
    public static void sortByWordsNumber(Text text) {
        Collections.sort(text.getSentences(), new Comparator<Sentence>() {
            @Override
            public int compare(Sentence o1, Sentence o2) {
                return o1.getWordsNumber() - o2.getWordsNumber();
            }
        });
    }
}
