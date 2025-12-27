package TwoPointer;
/*
Pattern: Two Pointers
Problem: Remove Duplicates from Sorted Array II (LeetCode 80)
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/
public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return 0;
        int j=2;
        for(int i = 2 ; i < nums.length ; i++){
            if(nums[i] != nums[j-2]){
                nums[j] =nums[i];
                j++;

            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicates2 obj = new RemoveDuplicates2();

        int[][] testCases = {
                {1, 1, 1, 2, 2, 3},
                {0, 0, 1, 1, 1, 1, 2, 3, 3},
                {1, 1, 2, 2, 3, 3},
                {1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5},
                {1},
                {1, 1},
                {},
                {-1, -1, -1, 0, 0, 0, 1, 1},
                {2, 2, 2, 3, 3, 4}
        };

        for (int t = 0; t < testCases.length; t++) {
            int[] nums = testCases[t];
            int k = obj.removeDuplicates(nums);

            System.out.println("Test Case " + (t + 1));
            System.out.println("Length: " + k);
            System.out.print("Array: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println("\n");
        }
    }

}
