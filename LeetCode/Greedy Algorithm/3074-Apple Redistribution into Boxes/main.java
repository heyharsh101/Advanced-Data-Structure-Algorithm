import java.util.Arrays;
class main{
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        for(int ap : apple){
            total += ap;
        }
        Arrays.sort(capacity);
        int count =0;
        int sum = 0;

        for(int i=capacity.length -1; i>=0; i--){
            sum += capacity[i];
            count++;

            if(sum >=total){
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        main sol = new main();
        int[] apple = {10, 20, 30};
        int[] capacity = {15, 25, 10, 20, 30};
        System.out.println(sol.minimumBoxes(apple, capacity)); // Output the minimum number of boxes needed
    }
}