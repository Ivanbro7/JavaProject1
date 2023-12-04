package JavaProject1;

public class Q5Swap {

    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable
        int a = 20;
        int b = 30;
        System.out.println("Number before swap");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("Number after swap");
        System.out.println("a = "+a);
        System.out.println("b ="+b);
    }
}
