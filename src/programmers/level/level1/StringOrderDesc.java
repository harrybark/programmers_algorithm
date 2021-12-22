package programmers.level.level1;

import java.util.Arrays;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.22
 * Programmers algorithm
 * 문자열 내림차순으로 배치하기
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 * 입출력 예
 * s	return
 * "Zbcdefg"	"gfedcbZ"
 */
public class StringOrderDesc {

    public static void main(String[] args) {
        String answer = String.format("Answer is %s.", solution("Zbcdefg"));
        System.out.println(answer);
    }

    public static String solution(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new StringBuffer().append(temp).reverse().toString();
    }
}
