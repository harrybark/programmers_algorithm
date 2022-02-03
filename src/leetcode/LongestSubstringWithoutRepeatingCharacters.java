package leetcode;

import java.util.HashSet;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.02.03
 * LeetCode
 * Longest Substring Without Repeating Characters
 * 문제 설명
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    private final static String INPUT_STRING = "pwwkew";

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(INPUT_STRING));
    }

    private static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int sLength = s.length();
        int i = 0, j = 0;
        HashSet<Character> stringSet = new HashSet<>();

        while ( j < sLength) {
            if ( i > j ) break;
            if(!stringSet.contains(s.charAt(j))) {
                stringSet.add(s.charAt(j++));
                result = Math.max(result, j - i );
                continue;
            }
            stringSet.remove(s.charAt(i++));
        }

        return result;
    }
}
