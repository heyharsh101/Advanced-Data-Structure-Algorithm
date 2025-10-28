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
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        // Find the middle of the linked list
        while(fast !=null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; // Split the list into two halves
        // Reverse the second half
        ListNode curr = slow;
        ListNode prevNode = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
    }

    public static void main(String[] args) {
        main main = new main();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


    }
}
