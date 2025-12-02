

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class main {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) {
            return null;
        }

        ListNode curr = head;
        int count = 0;
        
        while(curr!=null && count <k){
            curr = curr.next;
            count++;
        }

        if(count <k){
            return head;
        }
        ListNode prev = null;
        ListNode nextnode = null;
        curr = head;
        count = 0;
        while(count<k){
            nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;


    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode newHead = reverseKGroup(head, k);

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
