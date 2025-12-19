package TwoPointer;

/*
Pattern: Two Pointer + Sorting
Problem: 4Sum (LeetCode 18)
Difficulty: Medium
Time Complexity: O(n^3)
Space Complexity: O(1)
*/

import java.util.*;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > 0 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int m = n - 1;

                while (k < m) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));

                        while (m > k && nums[k] == nums[k + 1]) k++;
                        while (m > k && nums[m] == nums[m - 1]) m--;
                        k++;
                        m--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        m--;
                    }
                }
            }
        }
        return result;
    }
}

