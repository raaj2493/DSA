

public class Arrays {
    public static void main(String[] args) {
        // array is a datatype to store multiple values
        // eg. to store roll number of student

        // in normal ways
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        // using arrays
        int [] roll = {1,2,3,4,5};

        // synatx of array
        int[] roll1 = new int[4];
        roll[0] = 1;
        roll[1] = 2;
        roll[3] = 3;
        roll[4] = 4;

        //                      or

        int [] roll2 = {1,2,3,4,5};

        // working of an array

        int[] roll3; // Declaration: array is being declared in the stack memory
        roll3 = new int[4]; // Initialisation: actually here memory is beuing located(heap) to the array

        // printing an array
        int [] arr = {1,2,3,4,5,6};
        System.out.println(java.util.Arrays.toString(arr));
    }
}