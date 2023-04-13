import java.text.Normalizer;
import java.util.Scanner;

public class PriradenieHodnotenia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String znamka = "";

        while (!znamka.equalsIgnoreCase("koniec")) {

            System.out.println("Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný)");
            znamka = scanner.next();
            znamka = vymazDia(znamka);

            if (znamka.equalsIgnoreCase("koniec")) {
                break;
            }else if(znamka.equalsIgnoreCase("vyborny")) {
                System.out.println(1);
            } else if (znamka.equalsIgnoreCase("chvalitebny")) {
                System.out.println(2);
            } else if (znamka.equalsIgnoreCase("dobry")) {
                System.out.println(3);
            } else if (znamka.equalsIgnoreCase("dostatocny")) {
                System.out.println(4);
            } else if (znamka.equalsIgnoreCase("nedostatocny")) {
                System.out.println(5);
            } else {
                System.out.println("Neexistuje znamka pre vyraz: " + znamka);
            }
        }
        scanner.close();
    }

    public static String vymazDia(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}

