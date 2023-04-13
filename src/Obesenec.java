import java.util.Arrays;
import java.util.Scanner;

public class Obesenec {
    public static Scanner scanner = new Scanner(System.in);
    public static String word;
    public static char[] letters;
    public static String newLetter = "";
    public static String newDisplaySecret = "";

    public static void main(String[] args) {

        word = scanner.nextLine();

        // HANGMAN
        letters = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            letters[i] = '*';
        }
        System.out.println("Hladane slovo je: " + Arrays.toString(letters));

        quessLetter();

    }

    public static void quessLetter() {
        System.out.println("Quess the letter");
        char letter = scanner.next().charAt(0);
        String char1 = String.valueOf(letter);
        int position = word.indexOf(char1);
        for (int i = 0; i < word.length(); i++)
            if (i == position) {
                newLetter += word.charAt(i);
            } else {
                newLetter += word.charAt(i);
            }
        newLetter = new String(newDisplaySecret);
        System.out.println(newDisplaySecret);
    }
}

