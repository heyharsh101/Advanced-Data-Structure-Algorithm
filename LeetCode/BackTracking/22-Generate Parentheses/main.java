import java.util.*;

public class main {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public void backtrack(List<String> result, String s, int start, int end, int n){
        
        if(s.length()==2*n){
            result.add(s);
            return;
        }
        if(start<n){
            backtrack(result, s + "(", start+1, end, n);
        }
        if(end<start){
            backtrack(result, s + ")", start ,end+1, n);
        }
    }

    public static void main(String[] args) {
        main obj = new main();
        int n = 3;
        List<String> result = obj.generateParenthesis(n);
        System.out.println(result);
    }
}
