
public class main {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2;
        long right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid*mid;

            if(square == num) {
                return true;
            } else if(square < num) {
                left = mid +1;
            } else {
                right = mid- 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        main obj = new main();
        int num = 16;
        boolean result = obj.isPerfectSquare(num);
        System.out.println(result); // Output: true
    }
}
