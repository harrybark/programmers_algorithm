package programmers.level.level1;


import java.util.Arrays;
import java.util.Collections;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.15
 * Programmers algorithm
 * 자연수 뒤집어 배열로 만들기
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * n	return
 * 12345	[5,4,3,2,1]
 */
public class ReverseNaturals {

    public static void main(String[] args) {
        System.out.println("Answer is " + Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        int[] answer = {};

        String[] strArr = String.valueOf(n).split("");
        answer = new int[strArr.length];
        Collections.reverse(Arrays.asList(strArr));

        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}
