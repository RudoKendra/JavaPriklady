import java.util.Random;
import java.util.Scanner;

public class GuessNumberTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 1;
        int gNumber = 0;

        while (number != gNumber) {
            number = random.nextInt(10) + 1;
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
}