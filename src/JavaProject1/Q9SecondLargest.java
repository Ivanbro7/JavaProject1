package JavaProject1;

public class Q9SecondLargest {

    public static void main(String[] args) {
        //Write a java program to find the second-largest number in the array
        int[] arr = {25, 47, 24, 58, 82, 45, 70};
        int largest = 0;
        int second = 0;
        //Take first 2 elements of the array and find out which one is largest and second largest
        if (arr[0] > arr[1]) {
            largest = arr[0];
            second = arr[1];
        } else {
            largest = arr[1];
            second = arr[0];
        }
        //Iterate the fist two elements(largest and second) through the rest of the array
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest number is " + second);
    }
}
