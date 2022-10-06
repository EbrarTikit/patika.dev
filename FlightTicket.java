import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km = 0.10;

        double ageDiscount;
        double roundDiscount;

        System.out.print("Enter the distance in km : ");
        double dist = scan.nextDouble();

        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        System.out.print("Enter your trip type(1 -> one way 2 -> round-trip) : ");
        int type = scan.nextInt();


        if (age < 0 || dist < 0 || (type != 1 && type != 2)) {
            System.out.println("You entered incorrect data.");
        } else {
            double total = dist * km;
            if (age <= 12) {
                ageDiscount = 0.50;
                total -= (total * ageDiscount);
            } else if (age > 12 && age <= 24) {
                ageDiscount = 0.10;
                total -= (total * ageDiscount);
            } else if (age >= 65) {
                ageDiscount = 0.30;
                total -= (total * ageDiscount);
            }

            if (type == 1) {
                roundDiscount = 0.0;
            } else {
                roundDiscount = 0.20;
                total -= (total * roundDiscount);
                total = total * 2;
            }
            System.out.println("Total amount : " + total + " TL");
        }






    }
}
