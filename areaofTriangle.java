import java.util.Scanner;

public class areaofTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Edge 1 :" );
        int a = inp.nextInt();
        System.out.print("Edge 2: ");
        int b = inp.nextInt();
        System.out.print("Edge 3: ");
        int c = inp.nextInt();

        int u = (a+b+c) / 2;
        double area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("Area of triangle is " + area);

    }
}
