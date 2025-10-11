class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class main {

    public static ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        while(head!=null){
            if(head.next!= null && head.val == head.next.val){

                int duplica = head.val;
                while(head != null && head.val == duplica){
                    head = head.next;
                }
                prev.next = head;
            } else {

                prev = head;
                head = head.next;
            }
        }
        return temp.next;
    }

    public static void printLinkedlist(ListNode head){
        while(head!=null){
            System.out.print(" " + head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        head = deleteDuplicates(head);
        printLinkedlist(head);
    }
}
