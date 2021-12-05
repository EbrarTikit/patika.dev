public class MaxMin {
    public static void main(String[] args) {
        int[] list = {5, 32, 6, 42, 73, 2};
        int maxVal= list[0];
        for(int i=0; i<list.length; i++ ) {
            if(maxVal < list[i]) {
                maxVal = list[i];
            }
        }
        System.out.println(maxVal);

        int minVal= list[0];
        for(int i=0; i<list.length; i++ ) {
            if(minVal > list[i]) {
                minVal = list[i];
            }
        }
        System.out.println(minVal);


    }
}
