// Using two Pointers approach which makes easy to solve

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = val;
        this.next = null;
    }
}
public class main{
    public boolean hasCycle(ListNode head) {
        if(head==null && head.next== null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        main main = new main();
        
        boolean result = main.hasCycle(head);
        System.out.println(result);

    }
}