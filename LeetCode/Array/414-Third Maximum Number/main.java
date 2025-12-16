
public class main {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            long n = num;

            if (num == first || num == second || num == third) {
                continue;
            }

            if (n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (n > second) {
                third = second;
                second = n;
            }
            else if (n > third) {
                third = n;
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) first;
        } else {
            return (int) third;
        }
    }
    public static void main(String[] args) {
        main m = new main();
        int[] nums = {3, 2, 1};
        System.out.println(m.thirdMax(nums));
    }
}
