// only compare starting from index 0 of haystack
// and see if needle matches completely
// if it does return 0 else -1
public class main {
   public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if(n>m) return -1;

        for(int i=0; i<=m-n; i++){
            int j =0;
            while(j < n && haystack.charAt(j) == needle.charAt(j)){
                j++;
            }
            if(j==n) return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        main m = new main();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(m.strStr(haystack, needle));
    }
}
