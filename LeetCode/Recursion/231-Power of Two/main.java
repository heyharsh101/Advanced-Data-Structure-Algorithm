
public class main {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        if(n%2!=0)
            return false;

        return isPowerOfTwo(n/2);
    }
    public static void main(String[] args) {
        int n = 16;
        main main = new main();
        boolean result = main.isPowerOfTwo(n);
        System.out.println("Result : "+ result);
    }
}
