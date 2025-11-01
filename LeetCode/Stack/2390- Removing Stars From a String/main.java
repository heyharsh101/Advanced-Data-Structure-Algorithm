// Use StringBuilder to efficiently build the result string
// Finally, convert the StringBuilder back to a string and return it

public class main {
    public static String removeStars(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c != '*'){
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        String result = removeStars(s);
        System.out.println(result);
    }
}
