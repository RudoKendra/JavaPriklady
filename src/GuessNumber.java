import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        number = random.nextInt(10)+1;
        int gNumber;

        System.out.println("Uhádni číslo od 1 do 10");
        gNumber = Integer.parseInt(scanner.nextLine());

        if (gNumber > number) {
            System.out.println("Neuhádol si, moje číslo je menšie ... číslo bolo: " + number);
        } else if (gNumber < number) {
            System.out.println("Neuhádol si, moje číslo je väčšie ... číslo bolo: " + number);
        } else {
            System.out.println("BINGO! Uhádol si!");
        }
    }
}
