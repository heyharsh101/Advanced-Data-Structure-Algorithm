
public class main {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        if(n%4!=0)
            return false;

        return isPowerOfFour(n/4);
    }
    public static void main(String[] args) {
        int n = 16;
        main main = new main();
        boolean result = main.isPowerOfFour(n);
        System.out.println("Result : "+ result);
    }
}
