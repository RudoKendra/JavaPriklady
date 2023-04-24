package knihy;

import java.util.ArrayList;

public class DatabazaKnih {
    public static void main(String[] args) {
        Kniha kniha1 = new Kniha();
        kniha1.setAutor("Isaac Asimov");
        kniha1.setNazov("Ja robot");
        kniha1.setPocetStran(200);

        Kniha kniha2 = new Kniha();
        kniha2.setAutor("J.R.R. Tolkien");
        kniha2.setNazov("Pan prstenov");
        kniha2.setPocetStran(300);

        ArrayList<Kniha> kniznica = new ArrayList<>();
        kniznica.add(kniha1);
        kniznica.add(kniha2);

        for (Kniha konkretnaKniha: kniznica) {
            System.out.println(konkretnaKniha.getAutor());
            System.out.println(konkretnaKniha.getNazov());
            System.out.println(konkretnaKniha.getPocetStran());
        }
    }
}
