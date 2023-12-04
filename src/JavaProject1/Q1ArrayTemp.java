package JavaProject1;

import java.util.Scanner;

public class Q1ArrayTemp {

    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.
        Scanner scan = new Scanner(System.in);
        int[] week = new int[7];

        for (int i = 0; i < week.length; i++) {
            System.out.println("Enter the temperature for day number " + (i + 1));
            week[i] = scan.nextInt();
        }

        int hi = week[0];
        int low = week[0];

        for (int i = 0; i < week.length; i++) {
            if (hi < week[i]) {
                hi = week[i];
            }
        }
        for (int i = 0; i < week.length; i++) {
            if (low > week[i]) {
                low = week[i];
            }
        }
        System.out.println("The highest temperature for the week is " + hi);
        System.out.println("The lowest temperature for the week is " + low);
    }
}
