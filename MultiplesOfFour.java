import java.util.Scanner;

public class MultiplesOfFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int total = 0;

        do {
            System.out.print("Enter a number : ");
            num = scan.nextInt();
            if (num % 4 == 0) {
                total += num;
            }

        } while (num % 2 == 0);
        System.out.println(total);
    }
}
