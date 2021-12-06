package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.06
 * Programmers algorithm
 * 콜라츠 추측
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 *
 * 6→3→10→5→16→8→4→2→1
 *
 */
public class GuessCollatz {

    public static void main(String[] args) {
        int answer = solution(626331);
        System.out.println(answer);
    }

    public static int solution(int num) {
        int answer = 0;
        long temp = num;
        while(temp!=1)
        {
            temp = temp % 2 == 0 ? ( temp / 2) : (temp * 3) + 1 ;

            answer++;

            if(answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}
