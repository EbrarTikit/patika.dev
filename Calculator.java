import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the first input : ");
        int inp1 = scanner.nextInt();

        System.out.print("Write the second input : ");
        int inp2 = scanner.nextInt();

        System.out.print("1 for + ,2 for - ,3 for /, 4 for * \n" +
                "Choose the operation : ");
        int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("The result : " + (inp1 + inp2));
                    break;
                case 2:
                    System.out.print("The result : " + (inp1 - inp2));
                    break;
                case 3:
                    if (inp2 != 0) {
                        System.out.println("The result : " + (inp1 / inp2));
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case 4:
                    System.out.print("The result : " + (inp1 * inp2));
                    break;

                default:
                    System.out.print("Try again.");
                    
            }
    }
}
