import java.util.Scanner;

public class SpoonerismGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine().toLowerCase();

        int vowel1 = findFirstVowel(word1);
        int vowel2 = findFirstVowel(word2);

        if (vowel1 > 0 && vowel2 > 0) {
            String spoonerized1 = word2.substring(0, vowel2) + word1.substring(vowel1);
            String spoonerized2 = word1.substring(0, vowel1) + word2.substring(vowel2);
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerized1 + " " + spoonerized2);
        } else {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        }
    }

    private static int findFirstVowel(String word) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if ("aeiou".contains(String.valueOf(word.charAt(i)))) {
                index = i;
                break; 
            }
        }
        return index;
    }
}