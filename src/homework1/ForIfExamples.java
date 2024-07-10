package homework1;

public class ForIfExamples {

    public static void main(String[] args) {
        int x;
        int number = 0;
        for (x = 0; x <= 100; x = x + 1) {

            System.out.println("x: " + x);
        }
        for (int i = 1; i <= 100; i++) {
            number += i;
            System.out.println(+ number);
        }

    }
}
