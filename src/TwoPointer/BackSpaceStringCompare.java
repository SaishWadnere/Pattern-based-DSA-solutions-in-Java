package TwoPointer;

/*
Pattern: Two Pointers
Problem: Backspace String Compare (LeetCode 844)
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        int count = 0;
        int m = s.length();
        int n = t.length();
        String res1 = "";
        String res2 = "";

        for (int i = m - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
                continue;
            }

            if (count != 0) {
                count--;
            } else {
                res1 = s.charAt(i) + res1;
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (t.charAt(i) == '#') {
                count++;
                continue;
            }

            if (count != 0) {
                count--;
            } else {
                res2 = t.charAt(i) + res2;
            }
        }


        return res1.equals(res2);
    }


}
