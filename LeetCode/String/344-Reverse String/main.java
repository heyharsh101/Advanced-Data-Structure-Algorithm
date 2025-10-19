import java.util.*;

public class main {
    public static void reverse(char[] s){
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s={'H','a', 'r', 's', 'h', 'd', 'e', 'e', 'p'};
        main main = new main();
        main.reverse(s);
        System.out.println("Reversed String : "+Arrays.toString(s));
    }
}
