// Find middle using Pointer Approach by slow and fast pointer
// Reverse the second half of the linked list
// Merge the two halves 

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class main {
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null;
        }

        ListNode curr = slow;
        ListNode prevNode = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }

        
        ListNode first = head;
        ListNode second = prevNode;
        while(first != null && second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            if (temp1 != null) {
                second.next = temp1;
            }
            first = temp1;
            second = temp2;
        }

    }

    public static void main(String[] args) {
        main main = new main();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        main.reorderList(head);
        
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
