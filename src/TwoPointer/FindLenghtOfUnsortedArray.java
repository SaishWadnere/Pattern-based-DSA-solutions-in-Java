package TwoPointer;
/*
Pattern: Two Pointers
Problem: Find length of unsorted array
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindLenghtOfUnsortedArray {
    public int findUnsortedSubarray(int[] nums) {
        int max= Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int l =-1;
        int r = -1;
        int n= nums.length;
        for(int i =0 ; i < n-1 ; i++){
            max= Math.max(nums[i],max);
            if( nums[i] < max){
                r = i;
            }
        }
        if(r == -1) return 0;
        for(int i = n-1; i >= 0 ;i-- ){
            min = Math.min(min,nums[i]);
            if( nums[i] > min){
                l =i;
            }
        }

        return r-l+1;
    }

}
