package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.01.09
 * Programmers algorithm
 * 약수의 개수와 덧셈
 * 문제 설명
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *`
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 * 입출력 예
 * left	right	result
 * 13	17	43
 * 24	27	52
 */
public class AdditionOfFactors {

    private static final int LEFT = 13;
    private static final int RIGHT = 17;

    public static void main(String[] args) {
        System.out.println("The Answer is " + solution(LEFT, RIGHT));
    }

    private static int solution(int left, int right) {
        int answer = 0;

        for ( int n = left ; n <= right ; n++ ) {
            int factorCnt = 0 ;

            for( int index = 1; index <= n; index++) {
                if(n % index == 0 ) {
                    factorCnt++;
                }
            }
            answer = factorCnt % 2 == 0 ? answer + n : answer - n;

        }
        return answer;
    }
}
