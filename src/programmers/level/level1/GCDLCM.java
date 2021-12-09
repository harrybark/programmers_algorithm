package programmers.level.level1;

import java.util.Arrays;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.09
 * Programmers algorithm
 * 최대공약수와 최소공배수
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 *
 * n	m	return
 * 3	12	[3, 12]
 * 2	5	[1, 10]
 */
public class GCDLCM {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = null;
        answer = new int[2];

        int a = n, b = m, temp = 1;
        if(a < b) {
            a = m ;
            b = n ;
        }

        while(temp > 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        answer[0] = a;
        answer[1] = (n*m)/a;

        return answer;
    }
}
