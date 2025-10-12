class Solution {
    public boolean backspaceCompare(String s, String t) {
        // compare processed versions of both strings
        return build(s).equals(build(t));
    } // <-- close backspaceCompare here

    // define build() OUTSIDE the method above, but inside the class
    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    // Optional: test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.backspaceCompare("ab#c", "ad#c")); // true
        System.out.println(sol.backspaceCompare("ab##", "c#d#")); // true
        System.out.println(sol.backspaceCompare("a#c", "b"));     // false
    }
}
