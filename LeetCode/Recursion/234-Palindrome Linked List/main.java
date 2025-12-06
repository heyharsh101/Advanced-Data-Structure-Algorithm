class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class main {
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head);
    }
    public boolean check( ListNode right){
        if(right == null) return true;
        
        boolean ans = check( right.next);

        if(!ans){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        left = left.next;
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        main obj = new main();
        System.out.println(obj.isPalindrome(head));
    }
}
