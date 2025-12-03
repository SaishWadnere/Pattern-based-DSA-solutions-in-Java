package TwoPointer;
/*
Pattern: Two Pointers
Problem: Squares of a Sorted Array (LeetCode 977)
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

public class SqauringInSortedArrays {

    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int left = 0 , right = n - 1;
        int idx = n-1;
        int[] result = new int[n];
        while( left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[idx] = nums[left] * nums[left];
                left++;
            }else{
                result[idx] = nums[right] * nums[right];
                right--;
            }
            idx--;
        }
     return result;

    }

}
