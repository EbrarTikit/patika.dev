import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter : ");
        int num = scanner.nextInt();
        int max = 0,min = 0 ;

        for (int i = 1;i<num+1;i++) {
            System.out.print("Enter " + i + ". number : ");
            int value = scanner.nextInt();

                    //yani sadece bir sayı girilecekse
            if (i == 1) {
                max = value;
                min = value;
            } else if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
        }

        System.out.println("Max : " + max + "\nMin : " + min);
    }
}
