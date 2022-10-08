import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number >>");
        int num = scan.nextInt();
        if (num < 2) {
            System.out.println("It is not a prime number");
            // We can use 'return' directly instead of connecting with if else
        } else {
            int i = 2;
            boolean control = false;
            while (i <= num / 2) {
                // condition for nonprime number
                if (num % i == 0) {
                    control = true;
                    break;
                }

                ++i;
            }

            if (!control)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
}
