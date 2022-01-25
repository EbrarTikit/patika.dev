import java.util.Scanner;

public class groceryStore {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double pear = 2.14 ;
        double apple = 3.67 ;
        double tomato = 1.11 ;
        double banana = 0.95 ;
        double aubergine = 5.00 ;

        System.out.print("how many kilograms of pears:");
        double p = inp.nextDouble();
        System.out.print("how many kilograms of apple:");
        double a = inp.nextDouble();
        System.out.print("how many kilograms of tomato:");
        double t = inp.nextDouble();
        System.out.print("how many kilograms of banana:");
        double b = inp.nextDouble();
        System.out.print("how many kilograms of aubergine:");
        double au = inp.nextDouble();

        double amount = (pear*p) + (apple*a) + (tomato*t) + (banana*b) + (aubergine*au);
        System.out.print("Total amount: " + amount);


    }
}
