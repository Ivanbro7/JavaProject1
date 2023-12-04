package JavaProject1;

public class Q10DuplicateElements {

    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings
        String[] objects = {"bread", "car", "fish", "bread", "banana", "fish"};

        System.out.println("The duplicate elements in the array are: ");

        for (int i = 0; i < objects.length; i++){
            for(int j = i + 1; j < objects.length; j++){
                if (objects[i].equals(objects[j])){
                    System.out.println(objects[j]);
                }
            }
        }
    }
}
