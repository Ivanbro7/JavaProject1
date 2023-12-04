package JavaProject1;

public class Q4EvenOddSum {

    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array.
        int odd = 0;
        int even = 0;
        int[][] numbers = {
                {43, 65, 34, 75, 36},
                {64, 23, 13, 14, 76},
                {23, 45, 88, 46, 48}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    even = even + numbers[i][j];
                } else {
                    odd = odd + numbers[i][j];
                }
            }
        }
        System.out.println("The sum of all even numbers in the array are " + even);
        System.out.println("The sum of all odd numbers in the array are " + odd);
    }
}
