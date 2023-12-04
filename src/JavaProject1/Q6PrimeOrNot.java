package JavaProject1;

import java.util.Scanner;

public class Q6PrimeOrNot {
    //Write a java program to check whether a given number is prime or not

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime or not");
        int primeOrNot = scan.nextInt();

        if (isPrime(primeOrNot)) {
            System.out.println("The number " + primeOrNot + " is a prime number");
        } else {
            System.out.println("The number " + primeOrNot + " is not a prime number");
        }

    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}
