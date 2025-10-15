public class main {
    public int factorial(int n) {
        if(n==0 || n==1)
            return 1;

        return factorial(n-1)*n;
    }
    public static void main(String[] args) {
        int n = 5;
        main main = new main();
        int result = main.factorial(n);
        System.out.println("Result : "+ result);
    }
}
