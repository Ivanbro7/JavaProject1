package JavaProject1;

public class Q2ArraySum {

    public static void main(String[] args) {
        //Create an array of integer values. After the array is created, calculate the
        //sum of all stored elements in that array.
        int[] values = {7, 54, 3, 45, 90, 76, 56, 34};
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = values[i] + sum;
        }
        System.out.println("The sum of integers in the array is "+sum);
    }
}
