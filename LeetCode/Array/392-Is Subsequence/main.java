// two pointer approach
// Used to check if string s is subsequence of string t

public class main {
    public static boolean isSubsequence(String s, String t){
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }

    public static void main(String[] args) {
        String s = "aaaa";
        String t = "bbaabb";
        main obj = new main();
        boolean result = obj.isSubsequence(s, t);
        System.out.println(result);
    }
}
