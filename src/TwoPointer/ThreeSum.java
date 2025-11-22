package TwoPointer;/*
Pattern: Two Pointers
Problem: 3Sum (LeetCode 15)
Difficulty: Medium
Time Complexity: O(n²)
Space Complexity: O(1)   // ignoring sorting space
*/

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0 ; i < n- 2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j =i+1;
            int k= n-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if( sum == 0) {
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while( j < k && nums[j] == nums[j+1]) j++;
                    while( j < k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                } else if (sum < 0) j++;
                else k--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();

        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = obj.threeSum(arr);

        System.out.println(res);
    }
}
