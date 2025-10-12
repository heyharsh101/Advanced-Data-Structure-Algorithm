import java.util.Stack;

public class main {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int last = stack.pop();
                    int secondlast = stack.peek();
                    int sum = last + secondlast;
                    stack.push(last);
                    stack.push(sum);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        
        return total;
    }

    public static void main(String[] args) {
        main sol = new main();
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(sol.calPoints(ops));
    }
}