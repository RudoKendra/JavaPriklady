package opakovanie;

public class Pole {
    public static int [] pole = {1,8,10,12,90};

    public static void main(String[] args) {

        for (int i : pole) {
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i]);
            if (pole[i] % 2 == 0) {
                System.out.print(" je parne");
            } else {
                System.out.print(" je neparne");
            }
            System.out.println();
        }

        System.out.println();

        jeParneNeparne(pole[4]);
        scitaj();
        odcitaj();
        nasob();
        del(pole[1],pole[3]);
    }

    public static void jeParneNeparne (int i) {
        if (i % 2 == 0) {
            System.out.println("Cislo " + i + " je parne");
        } else {
            System.out.println("Cislo " + i + " je neparne");
        }
    }
    public static void scitaj () {
        int sum = 0;
        for (int i = 0; i < pole.length; i++) {
            sum += pole[i];
        }
        System.out.println(sum);
    }
    public static void odcitaj () {
        int sum = 0;
        for (int i = 0; i < pole.length; i++) {
            sum -= pole[i];
        }
        System.out.println(sum);
    }
    public static void nasob () {
        int sum = 1;
        for (int i = 0; i < pole.length; i++) {
            sum *= pole[i];
        }
        System.out.println(sum);
    }
    public static void del (int i, int j) {
        int sum = i / j;
        System.out.println("Podiel cisla " + i + " a cisla " + j + " = " + sum);
    }

}
