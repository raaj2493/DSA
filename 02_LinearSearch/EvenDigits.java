public class EvenDigits {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    EvenDigits(arr);
  }
 
  static int EvenDigits(int[] nums) {
  
    int count = 0;
    for(int i : nums){
      if (i%2==0) {
        count++;
      }
    }
    System.out.println(count);
    return count;
  }
  
}
