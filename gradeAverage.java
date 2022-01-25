import java.util.Scanner;

public class gradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your physic grade: ");
        int physic = input.nextInt();

        System.out.print("Your chemistry grade: ");
        int chemistry = input.nextInt();

        System.out.print("Your turkish grade: ");
        int turkish = input.nextInt();

        System.out.print("Your math grade: ");
        int math = input.nextInt();

        System.out.print("Your music grade: ");
        int music = input.nextInt();

        System.out.print("Your history grade: ");
        int history = input.nextInt();

        double average = (physic + chemistry + turkish + math + music + history) / 6.0;

        if (average > 60) {
            System.out.println("Passed the class.");
        } else {
            System.out.println("Not passed the class.");
        }



    }
}
