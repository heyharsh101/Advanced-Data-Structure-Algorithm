// simple game if alice is first and n is even she will always win
public class main {
    public static boolean divisorGame(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        main m = new main();
        int n = 6;
        System.out.println(m.divisorGame(n));
    }
}
