// Using two pointer approach to find the middle of the linked list
// slow increments by 1 and fast increments by 2
// middle will be at slow when fast reaches the end

class ListNode{
    int val;
    ListNode next;
    ListNode (int val){
        this.val = val;
        this.next = null;
    }
}

public class main{
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode mid = middleNode(head);

        while(mid != null){
            System.out.print(mid.val + " ");
            mid = mid.next;
        }
    }
}