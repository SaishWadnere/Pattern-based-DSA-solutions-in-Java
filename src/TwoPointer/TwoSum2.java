package TwoPointer;

/*
Pattern: Two Pointer
Problem: Two Sum II – Input Array Is Sorted (LeetCode 167)
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        while(i <= j){
            int sum = numbers[i] + numbers[j];

            if( sum == target){
                return new int[]{i+1 ,j+1};
            } else if (sum > target) {
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1, -1};
    }
}
