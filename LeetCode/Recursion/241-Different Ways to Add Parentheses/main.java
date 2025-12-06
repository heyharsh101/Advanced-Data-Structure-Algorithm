import java.util.List;
import java.util.ArrayList;
public class main {

    public static List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }

    public static List<Integer> solve(String s){
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='+' || c=='-' || c == '*'){
                List<Integer> left = solve(s.substring(0,i));
                List<Integer> right = solve(s.substring(i + 1));
            
                for(int a : left){
                    for(int b : right){
                        if(c=='+'){
                            result.add(a+b);
                        } else if(c=='-'){
                            result.add(a-b);
                        } else if(c=='*'){
                            result.add(a*b);
                        }
                    }
                }

            }
        }
        if(result.isEmpty()){
            result.add(Integer.parseInt(s));
        }
        return result;
    }
    public static void main(String[] args) {
        String expression = "2-1-1";
        List<Integer> results = diffWaysToCompute(expression);
        System.out.println(results); // Output: [0, 2]
    }
}
