import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzzThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Zadaj cele cisla: ");

        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer[] cislo = list.toArray(new Integer[0]);
        for (Integer cisla : cislo) {
            if (cisla % 3 == 0 && cisla % 5 == 0) {
                System.out.print("Fizz Buzz, ");
            } else if (cisla % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (cisla % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(cisla + ", ");
            }
        }
    }
}
