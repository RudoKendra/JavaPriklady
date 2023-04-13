public class PrikladUloha {

    public double cislo1 = 2.3;
    public double cislo2 = 1;
    public double vysledok;

    public double scitanie (){
        return vysledok = cislo1 + cislo2;
    }
    public double odcitanie (){
        return vysledok = cislo1 - cislo2;
    }
    public double nasobenie () {
        return vysledok = cislo1 * cislo2;
    }
    public double delenie () {
        return vysledok = cislo1 / cislo2;
    }

    public static void main(String[] args) {
        PrikladUloha prikladUloha = new PrikladUloha();

        System.out.println();
        System.out.printf("Výsledkom sčítanie hodnôt je " + "%.1f", prikladUloha.scitanie());
        System.out.println();
        System.out.println(prikladUloha.odcitanie());
        System.out.printf("Výsledkom odčítania hodnôt je " + "%.1f", prikladUloha.odcitanie());
        System.out.println();
        System.out.printf("Výsledkom násobenia hodnôt je " + "%.1f", prikladUloha.nasobenie());
        System.out.println();
        System.out.printf("Výsledkom delenia hodnôt je " + "%.5f", prikladUloha.delenie());
    }
}