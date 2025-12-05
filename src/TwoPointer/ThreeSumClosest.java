package TwoPointer;

import java.util.Arrays;
/*
Pattern: Two Pointers
Problem: 3Sum Closest (LeetCode 16)
Difficulty: Medium
Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans =-1;
        int closest = Integer.MAX_VALUE;
        for( int i =0 ; i < n ; i++){
            int j = i+1;
            int k = n-1;

            while( j < k){
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);
                if(diff < closest){
                    closest = diff;
                    ans =sum;
                }

                if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }

}
