package TwoPointer;
/*
Pattern: Two Pointers
Problem: Remove Duplicates from Sorted Array (LeetCode 26)
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int j =1;
        for( int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[j]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
