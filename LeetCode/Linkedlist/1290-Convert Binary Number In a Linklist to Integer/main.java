class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class main {

    public static int getdecimalvalue(ListNode head){
        int count =0;
        int sum =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        while(head!=null){
            sum += head.val * (1 << (--count)); // use bit shift instead of Math.pow
            head = head.next;
        }
        return sum;
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
