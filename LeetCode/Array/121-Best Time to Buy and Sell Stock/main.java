
public class main {
    
     public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int p : prices){
            if(p < minprice) {
                minprice = p;
            }

            if(p - minprice > maxprofit ){
                maxprofit = p - minprice;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
