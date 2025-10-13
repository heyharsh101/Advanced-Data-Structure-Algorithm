public class main {
    
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
        while(tickets[k]>0){
            for(int j=0; j<tickets.length; j++){
                if(tickets[j]!=0){
                tickets[j]--;
                time++;
                }
                if(tickets[k]==0) {
                    return time;
                }
            }
        }
        return time;
    }
    public static void main(String[] args) {
        main sol = new main();

        int[] tickets1 = {2, 3, 2};
        int k1 = 2;
        System.out.println("Time required: " + sol.timeRequiredToBuy(tickets1, k1)); // Output: 6
    }
}
