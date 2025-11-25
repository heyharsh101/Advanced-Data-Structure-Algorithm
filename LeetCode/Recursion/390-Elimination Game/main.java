//

public class main {
    public static int lastRemaining(int n) {
        int result = solve(1, 1, n, true);
        return result;
    }
    private static int solve(int head, int step, int remaining, boolean left){
        if(remaining == 1){
            return head;
        }

        if(left || remaining % 2 ==1){
            head = head + step;
        }

        return solve(head, step *2, remaining / 2, !left);
    }
    
    public static void main(String[] args) {
        int n = 9;
        main main = new main();
        int ans = main.lastRemaining(n);
        System.out.println(ans);
    }
}
