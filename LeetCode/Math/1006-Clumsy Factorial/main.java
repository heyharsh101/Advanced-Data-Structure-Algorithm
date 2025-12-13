
public class main {
    public int clumsy(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 6;

        int result = n* (n-1) / (n-2);
        n = n -3;

        while(n > 0){
            if(n >= 4) {
                result = result + n;
                result = result - ((n -1) * (n - 2) / (n - 3));
                n = n - 4;
            } else {
                if (n== 3){
                    result += 3 - 2 *1;
                } else if(n == 2) {
                    result += 2 -1;
                } else {
                    result += 1;
                }
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        main solution = new main();
        int[] tests = {4, 10, 1, 2, 3, 5, 6, 7, 8, 9};
        for (int t : tests) {
            System.out.println("n=" + t + " -> " + solution.clumsy(t));
        }
    }
}
