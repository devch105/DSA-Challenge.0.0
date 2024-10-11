public class ShortestPalindrome {
    public static void main(String[] args) {
       String input="abcd";
       String result=shortestPalindrome(input);
       String output="dcbabcd";
        System.out.println("===> "+result);
        System.out.println("===> "+output);
    }

    public static String shortestPalindrome(String s) {
        int i = 0;
        int n = s.length();
        for (int j = 0; j < n; j++) {
            if (s.charAt(i) == s.charAt(n - j - 1)) {
                i++;
            }
        }
        if (i == n) {
            return s;
        }
        String p = new StringBuilder(s.substring(i, n)).reverse().toString();
        return p + shortestPalindrome(s.substring(0, i)) + s.substring(i);
    }


}