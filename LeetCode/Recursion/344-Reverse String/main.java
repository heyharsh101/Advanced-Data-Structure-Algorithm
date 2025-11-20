public class main {
    
    public static void reverseString(char[] s) {
        recursion(s, 0, s.length -1);
        }
    
    public static void recursion(char[] s, int left, int right){
        if(left >= right){
            return ;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        recursion(s, left+1, right-1);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }
}
