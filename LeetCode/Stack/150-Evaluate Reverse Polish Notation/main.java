import java.util.Stack;

public class main {
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String c : tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int a = stack.pop();
                int b = stack.pop();

                int result = 0;
                switch(c){
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = b - a;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = b / a;
                        break;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"3", "4", "+", "2", "*", "7", "/"};
        int result = evalRPN(tokens);
        System.out.println(result);
    }
}
