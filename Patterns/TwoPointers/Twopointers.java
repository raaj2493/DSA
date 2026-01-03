package Patterns.TwoPointers;
/*
======================== TWO POINTERS TECHNIQUE ========================

🔹 WHAT IS TWO POINTERS?
Two Pointers is a problem-solving technique where we use TWO indices
(pointers) to traverse an array or string instead of using nested loops.

This helps reduce time complexity, usually from O(n²) to O(n).

-----------------------------------------------------------------------

🔹 WHEN DO WE USE TWO POINTERS?
We use Two Pointers when:
1. The input is an array or string
2. We need to find pairs, compare elements, or shrink a range
3. The array is SORTED (or can be sorted)
4. We want an in-place solution (without extra space)

-----------------------------------------------------------------------

🔹 HOW TO IDENTIFY TWO POINTER QUESTIONS?
Ask these questions:
✔ Is the array sorted?
✔ Am I checking pairs or comparing elements?
✔ Can I move pointers inward or forward?
✔ Can I solve this without nested loops?

If YES → Two Pointers is likely the solution.

Common keywords in questions:
- "Find pair"
- "Check palindrome"
- "Remove duplicates"
- "Reverse array"
- "Target sum"

-----------------------------------------------------------------------

🔹 TYPES OF TWO POINTERS

1️⃣ OPPOSITE DIRECTION POINTERS
- One pointer starts from beginning
- One pointer starts from end
- Used when comparing elements from both sides

Examples:
✔ Palindrome
✔ Two Sum in sorted array

2️⃣ SAME DIRECTION POINTERS (SLOW & FAST)
- Both pointers start at beginning
- Fast pointer moves faster than slow
- Used for in-place modification

Examples:
✔ Remove duplicates
✔ Move zeros

-----------------------------------------------------------------------

🔹 WHY TWO POINTERS IS IMPORTANT?
✔ Optimizes time complexity
✔ Reduces extra space
✔ Very common in interviews (FAANG, startups)

=======================================================================
*/
public class Twopointers {
     /*
    ----------------- EXAMPLE 1: TWO SUM (SORTED ARRAY) -----------------

    PROBLEM:
    Given a sorted array, check if there exists a pair whose sum equals target.

    APPROACH:
    - Use two pointers: left (start) and right (end)
    - Calculate sum of arr[left] + arr[right]
    - If sum == target → pair found
    - If sum < target → move left pointer to increase sum
    - If sum > target → move right pointer to decrease sum

    TIME COMPLEXITY: O(n)
    SPACE COMPLEXITY: O(1)
    */

    public static boolean twosum(int[]arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int sum = arr[left]+arr[right];
            if (sum<target) {
                left++;
            }else if(sum>target){
                right--;
            }else if(sum == target){
                return true;
            }else{
               return false;
            }
        }
        return false;
    }

     /*
    ----------------- EXAMPLE 2: PALINDROME CHECK -----------------

    PROBLEM:
    Check if a string is a palindrome.

    APPROACH:
    - Place one pointer at start and one at end
    - Compare characters
    - If mismatch → not a palindrome
    - Move pointers inward

    TIME COMPLEXITY: O(n)
    SPACE COMPLEXITY: O(1)
    */

    public static boolean checkpalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }



    /*
    ----------------- EXAMPLE 3: REMOVE DUPLICATES (SORTED ARRAY) -----------------

    PROBLEM:
    Remove duplicates from sorted array IN-PLACE and return new length.

    APPROACH (SLOW & FAST POINTER):
    - Slow pointer keeps track of unique elements
    - Fast pointer scans array
    - When new element found → move slow and update value

    TIME COMPLEXITY: O(n)
    SPACE COMPLEXITY: O(1)
    */

    public static int removeDuplicates(int[] arr) {

        int slow = 0;                  // Points to last unique element

        for (int fast = 1; fast < arr.length; fast++) {

            if (arr[fast] != arr[slow]) {
                slow++;                // Move slow pointer
                arr[slow] = arr[fast]; // Update value
            }
        }

        return slow + 1;               // Length of unique elements
    }

    /*
    ----------------- MAIN METHOD FOR TESTING -----------------
    */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(twosum(arr, 6)); // true

        System.out.println(checkpalindrome("madam")); // true
        System.out.println(checkpalindrome("hello")); // false

        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums)); // 3
    }
}
