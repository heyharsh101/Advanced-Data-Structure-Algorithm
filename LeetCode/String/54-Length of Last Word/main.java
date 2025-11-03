// Use length variable to count the length of the last word.

public class main {
    public static int lengthOfLastWord(String s){
        int length =0;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!= ' '){
                length++;
            } else if(length > 0){
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "Hello World ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
}
