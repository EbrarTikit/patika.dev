import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Sýcaklýk deðerini giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz...");

        } else if (heat >= 5 && heat <= 10) {

            System.out.println("Sinemaya gidebilirsiniz...");

        } else if (heat >= 15 && heat <= 25) {

            System.out.println("Pikniðe gidebilirsiniz...");

        } else if (heat > 25) {

            System.out.println("Yüzmeye gidebilirsiniz...");

        }

    }
}