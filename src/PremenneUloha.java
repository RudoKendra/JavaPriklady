import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {

    public static void main(String[] args) {
        String meno = "Jozef";
        String priezvisko = "Mrkvicka";
        String narodenie = "03.04.2000";
        double znamka = 1.5;
        int rok = 2000;

        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        System.out.printf("Študent " + meno + " " + priezvisko + " sa narodil " + narodenie +
                ", z maturitnej skúšky má známku " + "%.1f", znamka);
        System.out.println();
        System.out.println("a od septembra " + rok + " nastúpi do nového zamestnania ako Java programátor.");
        System.out.println("V Bratislave dňa " + formatDatumu.format(datum));
    }
}