
public class main {
        public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int[] DP = new int[n+1];
        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 1;

        for(int i=3; i<=n; i++){
            DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
        }
        return DP[n];
    }
    public static void main(String[] args) {
        main obj = new main();
        int n = 4;
        int result = obj.tribonacci(n);
        System.out.println(result); // Output: 4
    }
}
