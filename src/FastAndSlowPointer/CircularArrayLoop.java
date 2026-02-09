

package FastAndSlowPointer;

public class CircularArrayLoop {

    public int calcNext(int[] nums,int curr){
        int n = nums.length;
        int next = ((curr + nums[curr])% n + n ) % n;
        return next;
    }

    public boolean circularArrayLoop(int[] nums) {


        for(int i =0 ; i < nums.length ; i++){
            if(nums[i] == 0) continue;

            int slow = i;
            int fast =i;

            boolean isPositive = nums[i] > 0;
            while(true){
                slow = calcNext(nums,slow);
                if(nums[slow] == 0 || (nums[slow] > 0) != isPositive) break;

                fast = calcNext(nums,fast);
                if(nums[fast] == 0 || (nums[fast] > 0) != isPositive) break;

                fast = calcNext(nums,fast);
                if(nums[fast] == 0 || (nums[fast] > 0) != isPositive) break;

                if(slow == fast){
                    int next = calcNext(nums,slow);
                    if(slow == next) break;
                    return true;
                }

            }

            int curr = i;
            if(isPositive){
                while (nums[i] > 0){
                    int next = calcNext(nums,curr);
                    nums[curr] =0;
                    curr = next;
                }
            }else{
                while (nums[i] < 0){
                    int next = calcNext(nums,curr);
                    nums[curr] =0;
                    curr = next;
                }
            }
        }

        return false;
    }

}
