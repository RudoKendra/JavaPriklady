import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExcelBasicFormulasTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Zadaj cisla: ");
        int i = 0;
        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
            i++;
        }

        System.out.println("Cisla: " + numbers);
        System.out.println("Najvacsie cislo: " + Collections.max(numbers));
        System.out.println("Najmensie cisla: " + Collections.min(numbers));
        System.out.println(getAverage(numbers));
        System.out.println(getSum(numbers));
    }
    public static double getAverage(List<Integer> numbers){
        int sum = 0;
        for( int d: numbers){
            sum = sum + d;
        }
        int average = sum / numbers.size();
        return average;
    }
    public static double getSum(List<Integer> numbers){
        int sum = 0;
        for( int d: numbers ){
            sum = sum + d;
        }
        return sum;
    }
}

