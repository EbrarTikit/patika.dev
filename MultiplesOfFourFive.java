import java.util.Scanner;

public class MultiplesOfFourFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        String s = "";

        for (int i =1;i<n;i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
