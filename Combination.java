import java.util.Scanner;

public class Combination {
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <=n;i++) {
            result = n * i;
        }
        return result;
    }

    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner inp = new Scanner(System.in);
        System.out.print("C(n,r) için n sayısını giriniz:");
        int n = inp.nextInt();
        System.out.print("C(n,r) için r sayısını giriniz:");
        int r = inp.nextInt();

        Combination c = new Combination();
        System.out.println("C(" + n + "," + r + ") = " + c.factorial(n) / (c.factorial(r) * c.factorial(n-r)));


    }

}
