import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZadavanieKnih {
    public static void main(String[] args) {
        List<String> zoznamKnih = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj nazvy knih (pre koniec napis: koniec) ");
        String kniha = scanner.nextLine();

        while (!kniha.equalsIgnoreCase("koniec")) {
            zoznamKnih.add(kniha);
            kniha = scanner.nextLine();
        }
        System.out.println("Zoznam knih: ");
        for (String zoznam: zoznamKnih) {
            System.out.println(zoznam);
        }
    }
}

