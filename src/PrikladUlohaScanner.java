import java.util.Scanner;

public class PrikladUlohaScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vyber si cislo1");
        double cislo1 = scanner.nextDouble();
        System.out.println("Vyber si cislo2");
        double cislo2 = scanner.nextDouble();
        System.out.println("Vyber si operáciu = (+ = sčitanie) (- = odčítanie) (* = násobenie) (/ = delenie)");

        System.out.println();
        System.out.printf("Výsledkom sčítanie hodnôt je " + "%.1f", (cislo1 + cislo2));
        System.out.println();
        System.out.printf("Výsledkom odčítania hodnôt je " + "%.1f", (cislo1 - cislo2));
        System.out.println();
        System.out.printf("Výsledkom násobenia hodnôt je " + "%.1f", (cislo1 * cislo2));
        System.out.println();
        System.out.printf("Výsledkom delenia hodnôt je " + "%.5f", (cislo1 / cislo2));
    }
}