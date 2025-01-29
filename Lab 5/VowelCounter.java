import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalVowels = 0;
        int[] vowelCounts = new int[5]; // One slot for each vowel (a, e, i, o, u)

        System.out.println("Enter sentences (type 'quit' to stop):");

        while (true) {
            String sentence = scanner.nextLine().toLowerCase();

            if (sentence.equals("quit")) {
                break;
            }

            for (char ch : sentence.toCharArray()) {
                if (isVowel(ch)) {
                    totalVowels++;
                    updateVowelCount(ch, vowelCounts);
                }
            }
        }

        System.out.println("Total Vowels: " + totalVowels);
        System.out.println("Vowel Counts:");
        System.out.println("a: " + vowelCounts[0]);
        System.out.println("e: " + vowelCounts[1]);
        System.out.println("i: " + vowelCounts[2]);
        System.out.println("o: " + vowelCounts[3]);
        System.out.println("u: " + vowelCounts[4]);
    }

    private static boolean isVowel(char ch) {
        return "aeiou".contains(String.valueOf(ch));
    }

    private static void updateVowelCount(char ch, int[] vowelCounts) {
        switch (ch) {
            case 'a':
                vowelCounts[0]++;
                break;
            case 'e':
                vowelCounts[1]++;
                break;
            case 'i':
                vowelCounts[2]++;
                break;
            case 'o':
                vowelCounts[3]++;
                break;
            case 'u':
                vowelCounts[4]++;
                break;
        }
    }
}