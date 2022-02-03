package leetcode;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.02.03
 * LeetCode
 * Longest Palindromic Substring
 * 문제 설명
 * Given a string s, return the longest palindromic substring in s.
 * 뒤집어도 동일한 문자열
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String answer = String.format("The Answer is %s",
                new LongestPalindromicSubstring().longestPalindrome("aaa"));

        System.out.println(answer);
    }

    public String longestPalindrome(String s) {
        String ret = "";

        for(int i = 0 ; i < s.length() ; i++) {

            int len = Math.max(palindromeHelper(s, i, i), palindromeHelper(s, i, i+1));
            System.out.println(len);
            if(ret.length() < len ) {
                ret = s.substring(i - (len-1)/2, i + len/2 + 1);
            }
        }
        return ret;
    }

    public int palindromeHelper(String str, int start, int end) {
        if (start < 0 || end >= str.length()) return 0;
        while(start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
