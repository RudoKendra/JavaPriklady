public class ExcelBasicFormulas {
    int value1;
    int value2;
    public static void main(String[] args) {
        ExcelBasicFormulas excelBasicFormulas = new ExcelBasicFormulas();
        excelBasicFormulas.value1 = 5;
        excelBasicFormulas.value2 = 6;


        excelBasicFormulas.getMax();
        excelBasicFormulas.getSum();
        excelBasicFormulas.getCount();
        excelBasicFormulas.getAverage();
        excelBasicFormulas.getMin();

    }
    public void getSum() {
        System.out.println("Suma čisel je: " + (value1+value2));
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
}
