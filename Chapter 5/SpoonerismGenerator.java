import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.print(prompt);
            word = scanner.nextLine().trim();
            if (word.isEmpty()) {
                System.out.println("The input field is empty. Please enter a word.");
            }
        } while (word.isEmpty());
        return word;
    }

    public static int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static void run() {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == 0 || vowelIndex2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize (one or both start with a vowel).");
            return;
        } else if (vowelIndex1 == -1 || vowelIndex2 == -1) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize (one or both have no vowels).");
            return;
        }

        String prefix1 = word1.substring(0, vowelIndex1);
        String prefix2 = word2.substring(0, vowelIndex2);
        String restOfWord1 = word1.substring(vowelIndex1);
        String restOfWord2 = word2.substring(vowelIndex2);

        String spoonerizedWord1 = prefix2 + restOfWord1;
        String spoonerizedWord2 = prefix1 + restOfWord2;

        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
    }

    public static void main(String[] args) {
        run();
    }
}
