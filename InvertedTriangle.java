import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size :");
        int num = scan.nextInt();

        for (int i=num; i >0 ; i--){

            for (int k=num-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
