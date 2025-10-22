// stored in dummy node to handle edge cases like reversing from head
// prev node to the left position
// curr node at left position
//      nextNode = curr.next  working node to be moved
//      curr.next = nextNode.next  work on curr node to skip nextNode
//      nextNode.next = prev.next  insert nextNode after prev
//      prev.next = nextNode  link prev to nextNode

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class main {
    public static ListNode reverseLinkedList(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=0; i<left -1; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;
        for(int i=0; i<right-left; i++){
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

        int left = 2;
        int right = 4;
        
    ListNode curr = reverseLinkedList(head, left, right);

        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
