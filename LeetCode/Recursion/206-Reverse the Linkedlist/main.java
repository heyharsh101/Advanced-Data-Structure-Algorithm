
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class main {
    
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        return recursion(curr, prev);
    }
    public static ListNode recursion(ListNode curr, ListNode prev){
        if(curr == null){
            return prev;
        }
        
        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
        return recursion(curr, prev);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    ListNode curr = reverseList(head);

        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
