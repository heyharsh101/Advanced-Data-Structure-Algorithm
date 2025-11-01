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
    
    }

    public static void main(String[] args) {
        String s = "leet**code*";
    }
}
