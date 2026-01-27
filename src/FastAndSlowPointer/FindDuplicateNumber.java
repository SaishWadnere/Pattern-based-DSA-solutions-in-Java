package FastAndSlowPointer;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {

        int slow = nums[0], fast = nums[0];

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast ) break;
        }

        fast = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }

    public static void main(String[] args) {

        FindDuplicateNumber obj = new FindDuplicateNumber();

        /* ---------- Test Case 1 ---------- */
        int[] nums1 = {1, 3, 4, 2, 2};
        // Expected: 2
        System.out.println("Test Case 1 → " + obj.findDuplicate(nums1));

        /* ---------- Test Case 2 ---------- */
        int[] nums2 = {3, 1, 3, 4, 2};
        // Expected: 3
        System.out.println("Test Case 2 → " + obj.findDuplicate(nums2));

        /* ---------- Test Case 3 ---------- */
        int[] nums3 = {1, 1};
        // Expected: 1
        System.out.println("Test Case 3 → " + obj.findDuplicate(nums3));

        /* ---------- Test Case 4 ---------- */
        int[] nums4 = {1, 4, 6, 3, 2, 5, 6};
        // Expected: 6
        System.out.println("Test Case 4 → " + obj.findDuplicate(nums4));

        /* ---------- Test Case 5 ---------- */
        int[] nums5 = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        // Expected: 9
        System.out.println("Test Case 5 → " + obj.findDuplicate(nums5));
    }

}
