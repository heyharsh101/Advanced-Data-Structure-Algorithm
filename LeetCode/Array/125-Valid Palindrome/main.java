// Use two pointers to check for palindrome
// learn some string functions like Character.isLetterOrDigit() and Character.toLowerCase()

public class main {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while (left <right) {
            char leftChar =s.charAt(left);
            char rightChar =s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = ("A man, a plan, a canal: Panama");
        main obj = new main();
        boolean result = obj.isPalindrome(s);
        System.out.println(result);
    }
}
