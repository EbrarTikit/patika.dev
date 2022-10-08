import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 1000 : ");
        int num = scan.nextInt();
        int toplam = 0;

        while(num != 0)
        {
            toplam +=  (num%10);
            num /= 10;
        }

        System.out.println(toplam);
    }
}
