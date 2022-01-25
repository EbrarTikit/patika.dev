import java.util.Scanner;

public class areaOfTheCircle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        double pi = 3.14;
        System.out.print("Enter the radius: ");
        int r = inp.nextInt();
        System.out.print("Enter the angle: ");
        double a = inp.nextInt();

        double area = (pi * (r*r) * a) / 360;
        System.out.print("Area : " + area );
    }
}
