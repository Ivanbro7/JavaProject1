package JavaProject1;

public class Q8MaxMinArray {
    //Maximum and minimum number in the array?
    public static void main(String[] args) {

        int[] values = {34, 5, 23, 65, 84, 21, 73, 93, 11};

        int max = values[0], min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);

    }
}
