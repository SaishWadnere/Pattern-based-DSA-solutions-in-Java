package TwoPointer;

/*
Pattern: Two Pointer / Prefix Max
Problem: Trapping Rain Water (LeetCode 42)
Difficulty: Hard
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class TrappingRainWater {
    public int trap(int[] height) {
        int left=0,right= height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water= 0;
        while(left < right){
            if(leftMax < rightMax){
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax - height[left];
                left++;
            }else{
                rightMax =Math.max(rightMax,height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }

}

