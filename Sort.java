import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of Elements of the Array >>");
        int num = scan.nextInt();
        int[] list = new int[num];

        int i;
        for (i = 0; i < num; i++) {
            System.out.print("Enter the " + (i + 1) + ". element >>");
            list[i] = scan.nextInt();
        }

        for (i = 0; i < list.length - 1; i++) {

            int sayi = list[i];
            int temp = i;  //sayi 'nin indeksini temp değerine atıyoruz
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < sayi) {
                    sayi = list[j];
                    temp = j;
                }
            }
            if (temp != i) { //temp değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                list[temp] = list[i];
                list[i] = sayi;
            }
        }
        for (int sayi : list) {
            System.out.println(sayi);
        }
    }
}
