package FastAndSlowPointer;
/*
Pattern: Fast & Slow Pointer (Floyd’s Cycle Detection)
Problem: Happy Number (LeetCode 202)
Difficulty: Easy
Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.HashSet;

public class HappyNumber {
    public int getNum(int n){
        int sum=0;
        while(n != 0){
            int lastDigit = n % 10;
            sum += (lastDigit * lastDigit);
            n = n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = getNum(n);
        int fast = getNum(getNum(n));

        while(slow != fast){
            if(fast == 1) return true;

            slow = getNum(slow);
            fast = getNum(getNum(fast));
        }
        return slow ==1;
    }
}
