package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.19
 * Programmers algorithm
 * 문자열을 정수로 바꾸기
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 *
 * 제한 조건
 * s의 길이는 1 이상 5이하입니다.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 "0"으로 시작하지 않습니다.
 */
public class CovertStringToIntegers {

    public static void main(String[] args) {
        System.out.println("Answer is " + solution("-1234"));
    }

    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}
