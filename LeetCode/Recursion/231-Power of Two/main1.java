
public class main1 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n = 16;
        main1 main = new main1();
        boolean result = main.isPowerOfTwo(n);
        System.out.println("Result : "+ result);
    }
}
