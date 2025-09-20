public class WordReplacer {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use StringBuilder to build the modified sentence
        StringBuilder result = new StringBuilder();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            // Replace only exact matches
            if (word.equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        // Trim trailing space and return
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String oldWord = "Java";
        String newWord = "Python";

        String modified = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modified);
    }
}
