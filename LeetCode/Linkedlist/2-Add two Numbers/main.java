
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class main {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode result = new ListNode(0);
        ListNode ans = result;
        int carry=0;
        while(l1 != null && l2 != null){
            
            int sum = carry + l1.val + l2.val;
            int digit = sum%10;
            carry = sum/10;
            
            l1 = l1.next;
            l2 = l2.next;
            
           result.next = new ListNode(digit);
            result = result.next;
        }
        
        while(l1 != null){
            int sum = carry + l1.val;
            int digit = sum%10;
            carry = sum/10;
            result.next = new ListNode(digit);
            l1 = l1.next;
            result = result.next;
        }
        
        while(l2 != null){
            int sum = carry + l2.val;
            int digit = sum%10;
            carry = sum/10;
            result.next = new ListNode(digit);
            l2 = l2.next;
            result = result.next;
        }
        
        if(carry != 0){
            result.next = new ListNode(carry);
        }
        
        return ans.next;
    }

        public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        main solution = new main();
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Print result
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
