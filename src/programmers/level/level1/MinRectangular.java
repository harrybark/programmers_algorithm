package programmers.level.level1;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.01.03
 * Programmers algorithm
 * 최소직사각형
 * 문제 설명
 * 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
 * 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
 * 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
 *
 * 아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
 *
 * 명함 번호	가로 길이	세로 길이
 * 1	60	50
 * 2	30	70
 * 3	60	30
 * 4	80	40
 */
public class MinRectangular {

    public int solution(int[][] sizes) {
        int answer = 0;
        int max_h = 0 ;
        int max_v = 0 ;
        for(int i = 0 ; i < sizes.length; i++) {
            int h = Math.max(sizes[i][0], sizes[i][1]);
            int v = Math.min(sizes[i][0], sizes[i][1]);

            max_h = Math.max(max_h, h);
            max_v = Math.max(max_v, v);
        }
        answer = max_v * max_h;
        return answer;
    }
}
