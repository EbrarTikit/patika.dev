import java.util.Scanner;

public class HyperPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which number you wanna hyperpower it?");
        int number = input.nextInt();
        System.out.println("How many times you wanna hyperpower?");
        int hyperPower = input.nextInt();
        int total = 1;
        for(int i =1; i<=hyperPower;i++){
            total  *= number;
        }
        System.out.println("Answer:"+ total);
    }
}
