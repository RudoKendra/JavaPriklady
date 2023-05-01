package app;

import app.model.Kniha;
import app.service.KnihaService;

import java.util.ArrayList;
import java.util.Scanner;

public class KniznicaApp {

    public static void main(String[] args) {
        KnihaService knihaService = new KnihaService();
        ArrayList<Kniha> kniznica = new ArrayList<>();
        String menu = "";
        kniznica.add(new Kniha("ahoj", "Sandokan", 50));
        kniznica.add(new Kniha("ahojf", "Superman", 105));

        while (!menu.equalsIgnoreCase("koniec")) {
            Scanner scanner = new Scanner(System.in);
            knihaService.zobrazMenu();
            menu = scanner.nextLine();

            switch (menu) {
                case "1": {
                    knihaService.zadajNovuKnihu(kniznica);
                    break;
                }
                case "2": {
                    knihaService.zobrazVsetkyKnihy(kniznica);
                    break;
                }
                case "3": {
                    knihaService.zobrazKnihupodlaIndex(kniznica);
                    break;
                }
                case "4": {
                    knihaService.vymazKnihuPodlaIndex(kniznica);
                    break;
                }
                case "5": {
                    System.out.println("Su " + kniznica.size() + " knihy v zozname");
                    break;

                }
                case "6": {
                    knihaService.vyhladajKnihuPodlaNazvu(kniznica);
                    break;
                }
                case "9": {
                    kniznica.removeAll(kniznica);
                    System.out.println("Vsetky knihy su vymazane");
                    break;
                }
            }
        }
    }
}
