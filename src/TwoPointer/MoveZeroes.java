package TwoPointer;
import java.util.*;
/*
Pattern: Two Pointers
Problem: Move Zeroes (LeetCode 283)
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MoveZeroes {
    public void Solution(int[] nums) {
        int j=0;
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < nums.length){
            nums[j++] =0;
        }
    }
}
