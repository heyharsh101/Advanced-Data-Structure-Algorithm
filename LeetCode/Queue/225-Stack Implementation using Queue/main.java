import java.util.LinkedList;
import java.util.Queue;

public class main {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public main() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    
    public int pop() {
        if (q1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return q1.poll();
    }
    
    public int top() {
        if (q1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        main obj = new main();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Top: " +obj.top());   // 30
        System.out.println("Pop: " +obj.pop());   // 30
        System.out.println("Top after pop: " +obj.top()); // 20
        System.out.println("Empty: " + obj.empty()); // false
    }
}
