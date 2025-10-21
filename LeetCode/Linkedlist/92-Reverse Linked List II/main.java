// stored in dummy node to handle edge cases like reversing from head
// prev node to the left position
// curr node at left position
//      nextNode = curr.next  working node to be moved
//      curr.next = nextNode.next  work on curr node to skip nextNode
//      nextNode.next = prev.next  insert nextNode after prev
//      prev.next = nextNode  link prev to nextNode

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
public class main {
    public static Node reverseLinkedList(Node head, int left, int right) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for(int i=0; i<left -1; i++){
            prev = prev.next;
        }

        Node curr = prev.next;
        for(int i=0; i<right-left; i++){
            Node nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int left = 2;
        int right = 4;
        Node curr = reverseLinkedList(head, left, right);

        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
