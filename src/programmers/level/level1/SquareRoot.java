package programmers.level.level1;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.15
 * Programmers algorithm
 * 정수 제곱근 판별
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 * n	return
 * 121	144
 * 3	-1
 */
public class SquareRoot {

    public static void main(String[] args){
        int input = 11;
        System.out.println("Answer is " + solution(input));
    }

    public static long solution(int n){
        long answer = -1;

        double sqrtNum = Math.sqrt(n);
        if(Math.pow((int)sqrtNum, 2) == n) {
            answer = (long) Math.pow(sqrtNum + 1, 2);
        }

        return answer;
    }
}
