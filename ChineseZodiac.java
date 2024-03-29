import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String zodiac = "";

        System.out.print("Please enter your birth year : ");
        int year = scan.nextInt();

        int remind = year % 12;

        switch (year) {
            case 0 -> zodiac = "Monkey";
            case 1 -> zodiac = "Rooster";
            case 2 -> zodiac = "Dog";
            case 3 -> zodiac = "Pig";
            case 4 -> zodiac = "Rat";
            case 5 -> zodiac = "Ox";
            case 6 -> zodiac = "Tiger";
            case 7 -> zodiac = "Rabbit";
            case 8 -> zodiac = "Dragon";
            case 9 -> zodiac = "Snake";
            case 10 -> zodiac = "Horse";
            case 11 -> zodiac = "Goat";
            default -> System.out.println("Error");
        }
        System.out.println("Chinese zodiac is " + zodiac);

    }
}
