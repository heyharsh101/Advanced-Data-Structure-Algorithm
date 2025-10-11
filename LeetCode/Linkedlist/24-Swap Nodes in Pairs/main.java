class ListNode {
   int val;
   ListNode next;

   ListNode(int var1) {
      this.val = var1;
      this.next = null;
   }
}
public class main {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;


        while(current.next != null && current.next.next != null){

            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;
        }
        return dummy.next;
    }

    public static void printLinkedlist(ListNode head){
        while(head!=null){
            System.out.print(" " + head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = swapPairs(head);
        printLinkedlist(head);
    }
}
