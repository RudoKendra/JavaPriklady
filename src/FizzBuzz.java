import java.util.Random;

public class FizzBuzz {

    public static void main(String[] args) {

        Random random = new Random();
        int cislo1 = 30;
        
        for (int i = 1; i <= cislo1; i++) {
            int cislo2 = random.nextInt(100)+1;
            if (cislo2 % 3 == 0 && cislo2 % 5 == 0) {
                System.out.print("Fizz Buzz, ");
            } else if (cislo2 % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (cislo2 % 5 == 0) {
                System.out.print("Buzz, ");
            }else {
                System.out.print(cislo2 + ", ");
            }
        }
    }
}
