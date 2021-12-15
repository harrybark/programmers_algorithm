package programmers.level.level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.15
 * Programmers algorithm
 * 정수 내림차순으로 배치하기
 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * n	return
 * 118372	873211
 */
public class SortIntegers {

    public static void main(String[] args) {
        long input = 118372;
        System.out.println("Answer is " + solution(input));
    }

    public static long solution(long n) {
        long answer = 0;
        List<Character> list = new ArrayList<>();
        for(char k : String.valueOf(n).toCharArray()){
            list.add(k);
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuffer sb = new StringBuffer();
        for(Character k : list) {
            sb.append(k);
        }

        return Long.parseLong(sb.toString());
    }
}
