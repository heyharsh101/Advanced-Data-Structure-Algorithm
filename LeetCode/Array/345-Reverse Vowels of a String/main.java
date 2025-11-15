// make new function boolean isVowel(char c)
// use two pointer approach to swap vowels in the string

public class main {
    public static String reverseVowels(String s) {
        char[]  chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while(left<right){
            while(left<right && !isVowel(chars[left])){
                left++;
            }
            while(left < right && !isVowel(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    private static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public static void main(String[] args) {
        String s = "hello";
        main obj = new main();
        System.out.println(obj.reverseVowels(s));

    }
}
