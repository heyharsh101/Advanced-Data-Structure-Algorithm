
public class main {
    public double myPow(double x, int n) {
        long power = n;
        if(power < 0){
            x = 1 / x;
            power = -power;
        }
        return recursion(x, power);
    }
    public double recursion(double x, long n){
        if(n==0) return 1.0;

        double half = recursion(x, n/2);

        if(n % 2 ==0){
            return half * half;
        } else {
            return half * half * x;
        }
    }
    
    public static void main(String[] args) {
        main sol = new main();
        double x = 2.0;
        int n = 10;
        double result = sol.myPow(x, n);
        System.out.println(result); // Output: 1024.0
    }
}
