package FastAndSlowPointer;

class ListNode{
    int data;
    ListNode next;
    public ListNode(int value){
        this.data = value;
    }
}

public class ReorderList {

    public ListNode reverseList(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverseList(slow.next);
        slow.next = null;

        ListNode first = head;

        while(second != null){
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first =t1;
            second =t2;
        }

    }
}
