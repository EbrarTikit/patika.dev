import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your height: ");
        double m = inp.nextDouble();
        System.out.print("Please enter you weight: ");
        double kg = inp.nextDouble();

        double index = kg / (m*m);
        System.out.print("body Mass Index: " + index );
    }
}
