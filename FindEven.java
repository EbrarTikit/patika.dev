public class FindEven {
    public static void main(String[] args) {
        int[] list = {5, 78, 3 , 3, 2, 9, 14, 67, 2, 78};

        for(int i = 0;i< list.length;i++) {
            if(list[i] % 2 == 0) {
                System.out.print(list[i] + " ");
            }
        }
    }
}
