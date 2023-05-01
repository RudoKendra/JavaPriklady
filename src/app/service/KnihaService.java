package app.service;

import app.model.Kniha;

import java.util.ArrayList;
import java.util.Scanner;

public class KnihaService {
    private Scanner scanner;

    public KnihaService() {
        //SINGLETON
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public void zobrazMenu (){
        System.out.println("-------------------------");
        System.out.println("Menu s možnosťami:\n" +
                "1. Zadaj novú knihu\n" +
                "2. Zobraz všetky knihy\n" +
                "3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                "4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                "5. Zobraz počet všetkých kníh\n" +
                "6. Vyhľadaj knihu podľa názvu\n" +
                "9. Vymaž všetky knihy\n" +
                "Koniec = skončí zadávanie novej knihy");
    }

    public void zadajNovuKnihu (ArrayList<Kniha> kniznica){
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

    public void zobrazVsetkyKnihy (ArrayList<Kniha> kniznica){
        System.out.println("Vsetky knihy su: ");
        for (Kniha kniha : kniznica) {
            System.out.println(kniha.toString());
        }
        if (kniznica.isEmpty()) {
            System.out.println("V kniznici nie je ziadna kniha");
        }
    }
    public void zobrazKnihupodlaIndex (ArrayList<Kniha> kniznica) {
        try {
            System.out.println("Zadaj aku knihu chces zobrazit (index knihy napr. \"2\")");
            int indexKnihy = scanner.nextInt();
            System.out.println(kniznica.get(indexKnihy - 1));
        } catch (Exception e) {
            System.out.println("Zadal si zly index alebo kniha na indexe neexistuje");
        }
    }
    public void vymazKnihuPodlaIndex (ArrayList<Kniha> kniznica) {
        try {
            System.out.println("Zadaj aku knihu chces vymazat (index knihy napr. \"2\")");
            int indexKnihyVymaz = scanner.nextInt();
            kniznica.remove(indexKnihyVymaz - 1);
        } catch (Exception e) {
            System.out.println("Zadal si zly index alebo kniha na indexe neexistuje");
        }
    }
    public void vyhladajKnihuPodlaNazvu (ArrayList<Kniha> kniznica) {
        System.out.println("Zadaj nazov zadanej knihy");
        boolean jeNajdena = false;
        String hladanyNazov = scanner.nextLine();
        for (Kniha knihaVZozname : kniznica) {
            if (knihaVZozname.getNazov().contains(hladanyNazov)) {
                System.out.println("Kniha v zozname: " + knihaVZozname);
                jeNajdena = true;
            }
        }
        if (!jeNajdena) {
            System.out.println("kniha nenajdena");
        }
    }
}
