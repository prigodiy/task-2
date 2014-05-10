package epam.students.prihodii.regex;

/**
 * This class provides string constants which
 * used for parse text.
 *
 * @author Nickolay Prihodii
 */

public class RegexConstants {

    public static final String SENTENCES_SPLITTER = "(?<=[A-Za-z0-9](\\.|\\?|\\!|\\.\\.\\.))\\s+(?=[A-Z])";
    public static final String PART_OF_SENTENCE_SPLITTER = "(?<!^)\\b";
    public static final String PUNCTUATION_MATCHER = "[\\p{Punct}\\s]+";
}
