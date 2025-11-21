/*
Pattern: HashMap
Problem: Two Sum (LeetCode 1)
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.HashMap;

public class TwoSum {
    public int[] Solution(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return  new int[]{-1,-1};
    }
}
