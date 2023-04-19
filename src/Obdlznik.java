import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
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

                while (true) {
                    boolean isError = false;
                    scanner = new Scanner(System.in);
                    try {
                        System.out.println("Zadaj stranu a");
                        a = scanner.nextDouble();
                        System.out.println("Zadaj stranu b");
                        b = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Zadaj cislo");
                        isError = true;
                    } catch (Exception e) {
                        System.out.println("Nieco je zle");
                        isError = true;
                    }
                    if (!isError) break;
                }

                System.out.println("chceš vypočítať obvod alebo obsah obdlžníka?");

                do {
                    System.out.println("napíš \"o\" pre obvod a \"s\" pre obsah");
                    scan = scanner.next();
                    if (scan.equalsIgnoreCase("o")) {
                        vypocitajObvod();
                        break;
                    } else if (scan.equalsIgnoreCase("s")) {
                        vypocitajObsah();
                        break;
                    } else {
                        System.out.println("Neznáme písmeno");
                    }
                } while (!scan.equalsIgnoreCase("o") || !(scan.equalsIgnoreCase("s")));

            } else if (startPorgram.equalsIgnoreCase("q")){
                System.out.println("Koniec programu");
                System.exit(0);
            } else {
                System.out.println("Neznáme písmeno");
            }
        } while (!startPorgram.equalsIgnoreCase("q"));
    }
    static void vypocitajObvod () {
        double c = (2 * (a + b));
        System.out.println("Obvod obdlznika je: " + c);
    }
    static void vypocitajObsah () {
        double c = (a * b);
        System.out.println("Obsah obdlznika je: " + c);
    }

    @Test
    void otestujObvod () {
//        assertEquals(10, vypocitajObsah(2,5));
    }
}
