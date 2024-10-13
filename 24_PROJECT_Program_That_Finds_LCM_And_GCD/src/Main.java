import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, GCD = 0, LCM;

        System.out.print("Please, enter the first number: ");
        num1 = scan.nextInt();

        System.out.print("Please, enter the second number: ");
        num2 = scan.nextInt();

        // GCD
        int min = Math.min(num1, num2);
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
                break;
            }
        }

        // LCM


        LCM = (num1 * num2) / GCD;

        System.out.println("GCD: " + GCD);
        System.out.println("LCM: " + LCM);
    }
}
