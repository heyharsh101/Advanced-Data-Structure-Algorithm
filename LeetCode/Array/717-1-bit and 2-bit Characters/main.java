
public class main {
    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i=0;
        while(i<n -1){
            if(bits[i]==1){
                i= i+2;
            } else {
                i = i+1;
            }
        }
        if(i==n-1){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] bits = {1,0,0};
        System.out.println(isOneBitCharacter(bits));
    }
}
