package programmers.level.level1;


/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.09
 * Programmers algorithm
 * 짝수와 홀수
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * num	return
 * 3	"Odd"
 * 4	"Even"
 */
public class EvenAndOdd {

    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static String solution(int num) {

        StringBuffer answer = new StringBuffer();
        answer.append(num%2==0 ? "Even" : "Odd");
        return answer.toString();
    }
}
