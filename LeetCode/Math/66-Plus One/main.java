// if the last digit is less than 9, we can simply increment it by 1 and return the array.
// If the last digit is 9, we set it to 0 and move to the next digit to the left, repeating the process.
// If all digits are 9, we create a new array with an additional digit at the front set to 1.

public class main {
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        for(int digit : result){
            System.out.print(digit + " ");
        }
    }
}
