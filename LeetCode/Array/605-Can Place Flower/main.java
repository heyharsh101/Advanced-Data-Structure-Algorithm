
public class main {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i=0; i<len; i++){
            if(flowerbed[i]==0){

                if((i==0 || flowerbed[i-1]==0) && (i == len - 1 || flowerbed[i+1]==0)){
                    flowerbed[i] = 1;
                    n--;

                    if(n==0){
                        return true;
                    }
                }
            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        main obj = new main();
        boolean result = obj.canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}