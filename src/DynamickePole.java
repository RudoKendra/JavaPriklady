import java.util.ArrayList;
import java.util.Scanner;

public class DynamickePole {
    public static void main(String[] args) {

        ArrayList <Integer> pole = new ArrayList<>();
        int number = 0;

        while (number >= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Zadaj cisla");

            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                number = 0;
                System.out.println("?");
            }
            pole.add(number);
        }

        int sum = 0;
        for (int i = 0; i < pole.size()-1; i++) {
            sum += pole.get(i);
        }
        System.out.println("sucet je " + sum);
    }
}
