package programmers.level.level1;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.28
 * Programmers algorithm
 * 다트 게임
 * 입출력 예제
 * 예제	dartResult	answer	설명
 * 1	1S2D*3T	    37	    11 * 2 + 22 * 2 + 33
 * 2	1D2S#10S	9   	12 + 21 * (-1) + 101
 * 3	1D2S0T	    3	    12 + 21 + 03
 * 4	1S*2T*3S	23	    11 * 2 * 2 + 23 * 2 + 31
 * 5	1D#2S*3S	5	    12 * (-1) * 2 + 21 * 2 + 31
 * 6	1T2D3D#	    -4	    13 + 22 + 32 * (-1)
 * 7	1D2S3T*	    59	    12 + 21 * 2 + 33 * 2
 */
public class DartGameForKakao {

    private static String dartResult = "1S2D*3T";
    public static void main(String[] args) {
        String answer = String.format("Answer is %s.", String.valueOf(solution(dartResult)));
        System.out.println(answer);
    }

    private static int solution(String dartResult) {

        int answer = 0;

        int count = -1 ;
        int[] score = new int[3];

        for(int i = 0 ; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if(Character.isDigit(ch)) {
                count++;
                if(ch == '1' && dartResult.charAt(i+1) == '0') {
                    score[count] = 10;
                    i++;
                } else {
                    score[count] = ch - '0';
                }
            } else {
                // S, D, T, *, # 인 경우
                switch (ch) {
                    case 'S' :
                        score[count] = (int) Math.pow(score[count], 1);
                        break;
                    case 'D' :
                        score[count] = (int) Math.pow(score[count], 2);
                        break;
                    case 'T' :
                        score[count] = (int) Math.pow(score[count], 3);
                        break;
                    case '#' :
                        score[count] *= (-1);
                        break;
                    case '*' :
                        score[count] *= 2;
                        if(count > 0) {
                            score[count-1] *= 2;
                        }
                        break;
                }
            }
        }

        for(int val : score) {
            answer += val;
        }
        return answer;
    }
}
