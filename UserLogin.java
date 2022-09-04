import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****Welcome****");

        System.out.print("Enter user name : ");
        String name = scanner.next();

        System.out.print("Enter the password : ");
        String pin = scanner.next();

        if (pin.equals("12345") && name.equals("Ebrar")) {
            System.out.println("You have successfully logged in.");
        } else {
            System.out.println("""
                    Do you want to reset the password?
                    Press 1 for Yes
                    Press 2 for No""");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Your newly entered password must not be the same as the incorrectly entered " +
                        "and forgotten password.");
                System.out.print("Please enter your new password : ");
                String newPin = scanner.next();

                if (newPin.equals("12345")) {
                    System.out.println("Could not create password, please enter another password.");
                } else {
                    pin = newPin;
                    System.out.println("Password created.");
                }
            }
            if (choice == 2) {
                System.out.println("Exiting...");
            } 

        }
    }
}
