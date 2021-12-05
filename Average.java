public class Average {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int average = 0;
        for(int i =0; i<list.length; i++ ) {
            average += list[i];
        }
        System.out.println(average / list.length);
    }
}
