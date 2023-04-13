package opakovanie;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MaticaUdajov {

    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("HH.mm.ss:SSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        int j = 1;
        for (int i = 1; i <= 25; i++) {
                System.out.print(j + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
            j = j * 2;
        }
        String timeStamp1 = new SimpleDateFormat("HH.mm.ss:SSS").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp1);
    }
}

