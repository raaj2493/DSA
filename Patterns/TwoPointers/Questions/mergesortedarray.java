package Patterns.TwoPointers.Questions;
import java.util.*;

public class mergesortedarray {
    public static void main(String[] args) {
       int arr1[] = {1,3,5,7};
       int arr2[] = {2,4,6,8,10};
       int[] result = mergesortedarray(arr1,arr2);
       System.out.println(Arrays.toString(result));
    }

    public static int[] mergesortedarray(int[]arr1, int[]arr2){
       int i = 0;
       int j = 0;
       int[]newarr = new int[arr1.length+arr2.length];

       while (i< arr1.length && j<arr2.length) {
           if(arr1[i]<arr2[j]){
            newarr[i+j]=arr1[i];
            i++;
           }else{
            newarr[i+j]=arr2[j];
            j++;
           }
       } while (j<arr2.length) {
        newarr[i+j]=arr2[j];
        j++;
       }while (i<arr1.length) {
        newarr[i+j]=arr1[i];
        i++;
       }
       return newarr;
    }
}
