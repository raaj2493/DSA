import java.util.Arrays;

public class Passingfunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    // function for changing value in a string
    static void change(int[]arr){
        arr[0]= 69;
    }

}
