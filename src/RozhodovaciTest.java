public class RozhodovaciTest {

    public void rozhodnutie (int cislo1) {
        if (cislo1 >= 90) {
            System.out.println("A");
        } else if (cislo1 >= 75) {
            System.out.println("B");
        } else if (cislo1 >= 65) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        RozhodovaciTest rozhodovaciTest = new RozhodovaciTest();
        rozhodovaciTest.rozhodnutie(90);
        rozhodovaciTest.rozhodnutie(64);
        rozhodovaciTest.rozhodnutie(10);
    }
}
