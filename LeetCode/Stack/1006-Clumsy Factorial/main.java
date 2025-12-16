import java.util.Stack;
public class main {
    public int clumsy(int n) {
        Stack<Integer> st = new Stack<>();
        st.push(n);
        n--;

        int op = 0;
        while(n > 0){
            if( op == 0){
                st.push(st.pop() * n);
            } else if(op==1){
                st.push(st.pop() / n);
            } else if(op==2){
                st.push(n);
            } else if(op==3){
                st.push(-n);
            }
            op = (op + 1) % 4;
            n--;
        }
    int result = 0;
    while(!st.isEmpty()) {
        result = result + st.pop();
    }
    return result;
    }
    public static void main(String[] args) {
        main m = new main();
        int n = 10;
        System.out.println(m.clumsy(n));
    }
}
