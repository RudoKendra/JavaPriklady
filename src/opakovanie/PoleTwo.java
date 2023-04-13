package opakovanie;

import java.util.Arrays;

public class PoleTwo {


    public static void main(String[] args) {

        int [] pole = {1,8,10,12,90};
        String [] parneNeparne = {"","","","",""};

        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0) {
                parneNeparne[i] = "parne";
            } else {
                parneNeparne[i] = "neparne";
            }
        }
        System.out.println(Arrays.toString(parneNeparne));
    }
}
