import java.util.Scanner;

public class HyperPower2 {

    static double powerRecursive(int base,int power){

        if (power==0)
            return 1;
        else
            return base* powerRecursive(base,power-1);
    }

    /*
        1^1=1
        1^2=1*1
        2^3=2*2*2=2*(2^2)
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which number you wanna hyperpower it?");
        int number = input.nextInt();
        System.out.println("How many times you wanna hyperpower?");
        int hyperPower = input.nextInt();

        System.out.println("Answer:"+ powerRecursive(number,hyperPower));
    }
}
