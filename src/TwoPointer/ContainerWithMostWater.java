package TwoPointer;
/*
Pattern: Two Pointer
Problem: Container With Most Water (LeetCode 11)
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ContainerWithMostWater {

    // Do NOT implement logic here
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length-1;
        int maxArea = 0;

        while(left < right){
            int h = Math.min(height[left], height[right] );
            int w = right - left;
            int area = h*w;
            maxArea = Math.max(area, maxArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

    // Main method for testing
    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();

        // Test Case 1
        int[] h1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        printResult(obj.maxArea(h1));

        // Test Case 2
        int[] h2 = {1, 1};
        printResult(obj.maxArea(h2));

        // Test Case 3
        int[] h3 = {4, 3, 2, 1, 4};
        printResult(obj.maxArea(h3));
    }

    // Helper method to print output
    private static void printResult(int result) {
        System.out.println(result);
    }
}
