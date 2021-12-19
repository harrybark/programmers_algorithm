package programmers.level.level1;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.19
 * Programmers algorithm
 * 약수의 합
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 * n	return
 * 12	28
 * 5	6
 */
public class DivisorSum {

    public static void main(String[] args) {
        System.out.println("Answer is " + solution(12));
    }

    public static int solution(int n) {

        int answer = 0 ;
        for ( int index = 1 ; index <= n ; index++) {
            if(n % index == 0 ) {
                answer += index;
            }
        }
        return answer;
    }
}
