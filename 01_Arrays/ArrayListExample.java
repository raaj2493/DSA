import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner putScanner = new Scanner(System.in);

        // ArrayList is used when we don't need to have a specific size of the array

        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

        // Add some elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Print the elements of the ArrayList
        System.out.println("ArrayList elements: " + list);

        // some funstions

        list.contains(12);   // to check if an element exist in an array
        list.add(4);  // to add element
        list.set(0, 69); // to replace an element on ana index , first numer index second the changed value
        list.remove(2);  // to remove element of an index


        // input

        for (int i =0; i<5; i++){
            list.add(putScanner.nextInt());
        }

        // get item at any index
        for (int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }

        /*
        Q. how does arraylist works / how is it able to store as many as elements without specifying the size

        an array list creates a array of some size in starting when that size is filled to a partcular amount
        it creates a new array of around double the size and then copy the element of the previous array to the new one

             */
    }
}
