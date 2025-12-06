package TwoPointer;

/*
Pattern: Two Pointers / Dutch National Flag Algorithm
Problem: Sort Colors (LeetCode 75)
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.Arrays;

public class SortColors {
    public void swap(int[] nums , int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public void sortColors(int[] nums) {
        int left=0;
        int mid = 0;
        int right = nums.length-1;

        while( mid <= right){
            if(nums[mid] == 0){
                swap(nums, left,mid);
                left++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,right);
                mid++;
                right--;
            }
        }
    }
}
