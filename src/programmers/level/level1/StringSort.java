package programmers.level.level1;

import java.util.Arrays;
import java.util.Comparator;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.27
 * Programmers algorithm
 * 문자열 내 마음대로 정렬하기
 * 문제 설명
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 *
 * [제한 조건]
 * strings는 길이 1 이상, 50이하인 배열입니다.
 * strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 * 모든 strings의 원소의 길이는 n보다 큽니다.
 * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 *
 * 입출력 예
 * strings	n	return
 * ["sun", "bed", "car"]	1	["car", "bed", "sun"]
 * ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
 */
public class StringSort {

    public static String[] inputArr = {"abce", "abcd", "cdx"};
    public static int n = 2;

    public static void main(String[] args) {
        String answer = String.format("Answer is %s.", Arrays.toString(solution(inputArr, n)));
        System.out.println(answer);
    }

    public static String[] solution(String[] input, int n) {

        String[] answer = input;
        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);
                // n 번째 문자가 같은 경우, 사전순으로 정렬
                if (c1 == c2) {
                    return o1.compareTo(o2);
                }
                // n 번쨰 문자가 다른 경우, 해당 순으로 정렬
                else {
                    return c1 - c2;
                }
            }
        });

        return answer;
    }
}
