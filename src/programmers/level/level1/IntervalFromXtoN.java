package programmers.level.level1;


import java.util.Arrays;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.11.20
 * Programmers algorithm
 * x만큼 간격이 있는 n개의 숫자
 * x	n	answer
 * 2    5   {2, 4, 6, 8, 10}
 * -4  -2   {-4, -2}
 */
public class IntervalFromXtoN {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        long[] solution = solution(a, b);

        System.out.println(Arrays.toString(solution));
    }

    public static long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        for(int i = 0 ; i < n ; i++ ){
            answer[i] = Long.valueOf( x ) * (i+1);
        }
        return answer;
    }
}
