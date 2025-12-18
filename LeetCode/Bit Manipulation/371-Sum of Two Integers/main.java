public class main {
    public static int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1;
            a = a ^b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        main m = new main();
        int a = 1;
        int b = 2;
        System.out.println(m.getSum(a, b));
    }
}
