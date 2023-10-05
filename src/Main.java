
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade Here");
        double input = sc.nextDouble();
        double input1 = (int) Math.round(input);

        if (input1 > 100 || input1 < 0) {
            System.out.println("Don't get tricky, put in a number within 0-100 range");
        } else if (input1 >= 90) {
            System.out.println("A");
        } else if (input1 >= 80) {
            System.out.println("B");
        } else if (input1 >= 70) {
            System.out.println("C");
        } else if (input1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        String isItAPrime = "Prime";
        for (int i = 1; i <= input1; i++) {
            if (i != 1 && i != input1 && input1 % i == 0) {
                isItAPrime = "Not A Prime";
                System.out.println("Not A Prime");
                break;
            }
        }
        if (isItAPrime.equals("Prime")) {
            System.out.println("Is a Prime");
        }
    }
}