package programmers.level.level1;

import java.util.Arrays;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.30
 * Programmers algorithm
 * 비밀지도
 */
public class KakaoSecretMap {

    public static void main(String[] args) {
        int size = 5;
        int[] arr1 = {0, 0, 0, 0, 0},
              arr2 = {30, 1, 21, 17, 28};
        String[] solution = solution(size, arr1, arr2);
        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for( int i = 0 ; i < arr1.length ; i++){
            String tempValue = Integer.toBinaryString(arr1[i]|arr2[i]);
            if(n > tempValue.length()) {
                int cnt = n - tempValue.length();
                for ( int k = 0; k < cnt; k++) {
                    tempValue = "0" + tempValue;
                }
            }

            answer[i] = tempValue.replaceAll("0", " ").replaceAll("1", "#");
        }
        return answer;
    }
}
