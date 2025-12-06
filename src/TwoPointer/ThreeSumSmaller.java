package TwoPointer;
/*
Pattern: Two Pointers
Problem: 3Sum Smaller (LeetCode 259)
Difficulty: Medium
Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans=0;
        for(int i = 0 ; i < n -2 ;i++){
            int j=i+1;
            int k= n-1;
            while( j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if( sum > target){
                    k--;
                }else{
                  ans += (k-j);
                  j++;
                  k--;
                }
            }
        }
        return ans;
    }
}
