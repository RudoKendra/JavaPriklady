import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzzTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Zadaj cele cisla: ");

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer[] cisla = list.toArray(new Integer[0]);
        for (int i = 0; i < cisla.length; i++) {
            for (int j = cisla.length; j <= cisla.length; j++) {
                if (cisla[i] % 3 == 0 && cisla[i] % 5 == 0) {
                    System.out.print("Fizz Buzz, ");
                } else if (cisla[i] % 3 == 0) {
                    System.out.print("Fizz, ");
                } else if (cisla[i] % 5 == 0) {
                    System.out.print("Buzz, ");
                } else {
                    System.out.print(cisla[i] + ", ");
                }
            }
        }
    }
}
