// Using Iterative Approach
// 3 pointers approach  - prev, curr, nextNode
// nextNode is used to store the next node before changing the curr.next pointer

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class main {
    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node curr = reverseLinkedList(head);
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

    }
}
