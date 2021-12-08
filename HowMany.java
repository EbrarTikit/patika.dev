public class HowMany {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        //int counter = 0;
        for (int i = 0; i < list.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    counter++;
                    list[j] = -1;
                }
            }
            if (list[i] != -1)
                System.out.println("The number " + list[i] + " is repeated " + counter + " times.");
        }

    }
}
