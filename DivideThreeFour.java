import java.util.Scanner;

public class DivideThreeFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int num = scan.nextInt();
        int total = 0;
        int s = 1;

        for (int i=1;i<=num;i++) {
            if (i%3==0 && i%4==0) {
                total += i;
                s++;

            }
        }
        System.out.println(total/s);
    }
}
