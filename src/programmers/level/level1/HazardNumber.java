package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.11.27
 * Programmers algorithm
 * 하샤드 수
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * input : x 는 1 이상 10000이하의 정수
 * arr	return
 * 10	true
 * 12	true
 * 11	false
 * 13	false
 */
public class HazardNumber {

    public static void main(String[] args){
        int input = 13;

        System.out.println("The result is " + solution(input));
    }

    public static boolean solution(int input){

        if (input % 10 == 0 ){
            return true;
        } else {

            int sum = 0;
            int temp = input;
            while(input != 0){
                sum += input%10;
                input /= 10;
            }
            if(temp % sum == 0) {
                return true;
            }
            return false;
        }
    }
}
