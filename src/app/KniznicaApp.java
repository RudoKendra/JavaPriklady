package app;

import app.model.Kniha;

import java.util.ArrayList;
import java.util.Scanner;

public class KniznicaApp {

    public static void main(String[] args) {

        ArrayList<Kniha> kniznica = new ArrayList<>();
        String menu = "";

        while (!menu.equalsIgnoreCase("koniec")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.println("Menu s možnosťami:\n" +
                    "1. Zadaj novú knihu\n" +
                    "2. Zobraz všetky knihy\n" +
                    "3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                    "4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                    "5. Zobraz počet všetkých kníh\n" +
                    "9. Vymaž všetky knihy\n" +
                    "Koniec = skončí zadávanie novej knihy");

            menu = scanner.nextLine();

            switch (menu) {
                case "1": {
                    novaKniha(kniznica, scanner);
                    break;
                }
                case "2": {
                    System.out.println("Vsetky knihy su: ");
                    for (Kniha kniha : kniznica) {
                        System.out.println(kniha.toString());
                    }
                    break;
                }
                case "3": {
                    System.out.println("Zadaj aku knihu chces zobrazit (index knihy napr. \"2\")");
                    int indexKnihy = scanner.nextInt();
                    System.out.println(kniznica.get(indexKnihy-1));
                    break;
                }
                case "4": {
                    System.out.println("Zadaj aku knihu chces vymazat (index knihy napr. \"2\"");
                    int indexKnihyVymaz = scanner.nextInt();
                    kniznica.remove(indexKnihyVymaz-1);
                    break;
                }
                case "5": {
//                    TODO DOROBIT
//                    kniznica.size(kniznica);
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

    private static void novaKniha(ArrayList<Kniha> kniznica, Scanner scanner) {
        System.out.println("Zadaj nazov knihy");
        Kniha kniha = new Kniha();
        kniha.setNazov(scanner.nextLine());
        System.out.println("Zadaj autora");
        kniha.setAutor(scanner.nextLine());
        System.out.println("Zadaj rok vydania");
        kniha.setRokVydania(scanner.nextInt());
        kniznica.add(kniha);
        System.out.println("Kniha ulozena");
    }
}
