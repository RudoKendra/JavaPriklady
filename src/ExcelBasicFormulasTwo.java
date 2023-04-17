import java.util.Scanner;

public class ExcelBasicFormulasTwo {

    public void getSum() {
        for (int value : values) {
            System.out.println("Suma čisel je: " + values);
        }
    }

    public void getAverage() {
        System.out.println("Priemer čísel je: " + ((value1+value2) / 2));
    }

    public void getMax() {
        System.out.println("Max číslo je: " + Math.max(value1,value2));
    }

    public void getMin() {
        System.out.println("Min číslo je: " + Math.min(value1,value2));
    }

    public void getCount() {
        System.out.println("Počet čísel je: " + (value1+value2));
    }

    int value1;
    int value2;
    static int[] values;
    public static void main(String[] args) {
        ExcelBasicFormulasTwo excelBasicFormulastwo = new ExcelBasicFormulasTwo();
        excelBasicFormulastwo.value1 = 6;
        excelBasicFormulastwo.value2 = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj ľubovoľný počet čísel");
        values = new int[]{Integer.parseInt(scanner.nextLine())};

        excelBasicFormulastwo.getSum();


    }
}

