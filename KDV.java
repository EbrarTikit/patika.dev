import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Price: ");
        double price = input.nextInt();

        if (price < 1000 && price > 0) {
            double kdvPer = 0.18;
            double kdvPrice = price + (price * kdvPer);
            System.out.print("Price with KDV: " + kdvPrice);
        } else {
            double kdvPer = 0.08;
            double kdvPrice = price + (price * kdvPer);
            System.out.print("Price with KDV: " + kdvPrice);
        }
    }
}