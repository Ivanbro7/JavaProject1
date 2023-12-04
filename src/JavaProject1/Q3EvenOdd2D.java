package JavaProject1;

public class Q3EvenOdd2D {

    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even numbers
        //only.
        int[][] numbers = {
                {34, 25, 26, 65, 12},
                {87, 54, 36, 57, 98},
                {56, 29, 85, 16, 6}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
