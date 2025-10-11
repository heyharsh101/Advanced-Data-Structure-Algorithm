class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class main1 {

    public static int getdecimalvalue(ListNode head){
        int res =0;
        while(head!=null){
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);

        int sum = getdecimalvalue(head);
        System.out.println(sum);
    }
}
