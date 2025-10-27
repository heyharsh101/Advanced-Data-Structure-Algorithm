// Using simple arithmetic to reverse the integer
// Handling overflow by checking before multiplying

public class main {
    public static int reverse(int x) {
        int rev =0;

        while(x != 0){
            int digit = x % 10;
            x /= 10;
            
            // Check overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit > 7)) {
            return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
    public static void main(String[] args) {
        main solution = new main();
        int n = -123;
        int result = main.reverse(n);
        
        System.out.println("Reversed Integer: " + result);
        
    }
}
