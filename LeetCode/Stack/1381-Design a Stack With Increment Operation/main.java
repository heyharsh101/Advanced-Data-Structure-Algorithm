
public class main {
    
    int[] stack;
    int[] inc;
    int top;

    public main(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = x;
        }
    }
    
    public int pop() {
        if (top == -1) return -1;

        int res = stack[top] + inc[top];

        if (top > 0) {
            inc[top - 1] += inc[top];
        }

        inc[top] = 0;
        top--;

        return res;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k - 1, top);
        if (limit >= 0) {
            inc[limit] += val;
        }
    }

    public static void main(String[] args) {
        main cs = new main(5);
        cs.push(1);
        cs.push(2);
        System.out.println(cs.pop()); // returns 2
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6); // stack is full, do nothing
        cs.increment(3, 100); // increment bottom 3 elements by 100
        System.out.println(cs.pop()); // returns 105
        System.out.println(cs.pop()); // returns 104
        System.out.println(cs.pop()); // returns 103
        System.out.println(cs.pop()); // returns 1
        System.out.println(cs.pop()); // returns -1 (stack is empty)
    }
}
