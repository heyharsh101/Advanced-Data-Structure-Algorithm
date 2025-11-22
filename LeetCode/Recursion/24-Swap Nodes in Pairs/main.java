//

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class main {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        recursion(dummy);
        return dummy.next;
    }

    public static ListNode recursion(ListNode curr){
        if(curr.next == null || curr.next.next == null) {
            return curr.next;
        }

        ListNode first = curr.next;
        ListNode second = curr.next.next;

        first.next = second.next;
        second.next = first;
        curr.next = second;

        return recursion(first);
    }
    public static void printLinkedlist(ListNode head){
        while(head!=null){
            System.out.print(" " + head.val);
            head = head.next;
        }
    }
    
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = swapPairs(head);
        printLinkedlist(head);
    }
}
