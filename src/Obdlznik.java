import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Obdlznik {
    public static double a;
    public static double b;
    public static String scan;
    public static String startPorgram;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("napíš \"s\" pre začiatok a \"q\" pre koniec");
            startPorgram = scanner.next();

            if (startPorgram.equalsIgnoreCase("s")) {
                System.out.println("Zadaj stranu a");
                a = scanner.nextInt();
                System.out.println("Zadaj stranu b");
                b = scanner.nextInt();

                System.out.println("chceš vypočítať obvod alebo obsah obdlžníka?");
                System.out.println("napíš \"o\" pre obvod a \"s\" pre obsah");
                scan = scanner.next();

                if (scan.equalsIgnoreCase("o")) {
                    vypocitajObvod();
                } else if (scan.equalsIgnoreCase("s")) {
                    vypocitajObsah();
                } else {
                    System.out.println("Neznáme písmeno");
                }
            } else {
                System.out.println("Koniec programu");
                System.exit(0);
            }
        } while (!startPorgram.equalsIgnoreCase("q"));
    }
    static void vypocitajObvod () {
        double c = (2 * (a + b));
        System.out.println(c);
    }
    static void vypocitajObsah () {
        double c = (a * b);
        System.out.println(c);
    }

    @Test
    void otestujObvod () {
//        assertEquals(10, vypocitajObsah(2,5));
    }
}
