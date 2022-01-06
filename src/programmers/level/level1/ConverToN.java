package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.01.07
 * Programmers algorithm
 * 3진법 뒤집기
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다.
 * n을 3진법 상에서 앞뒤로 뒤집은 후,
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 * 입출력 예
 * n	result
 * 45	7
 * 125	229
 */
public class ConverToN {

    public static void main(String[] args) {
        ConverToN converToN = new ConverToN();
        int result = converToN.solution(45);
        System.out.println("The Answer is " + result );
    }

    public int solution(int n) {
        int answer = convertNtoN(convertInputToN(n, 3), 3);
        //FlipOverTernary
        return answer;
    }


    public static String convertInputToN(int input, int n) {

        StringBuffer sb = new StringBuffer();

        int current = input;

        while( current > 0 ) {
            if(current % n < 10) {
                sb.append(current % n);
            } else {
                sb.append((char)(current % n - 10 + 'A'));
            }
            current /= n;
        }
        System.out.println("숫자 : " + input + "를 " + n + "진법으로 변환한 수(Reverse) : " + sb.toString());
        return sb.toString();
    }

    // 0021
    public static int convertNtoN(String input, int n) {
        char[] nums = input.toCharArray(); // char의 배열로 만들어서 하나씩 숫자별로 대응
        int ans = 0; // 시작은 0으로 시작

        for(int i=0; i < nums.length; i++){
            // 'A'이상의 숫자, 즉 10이상의 경우에는 'A'를 빼고 10을 더하면 원래 숫자가 됨
            if(nums[i] >= 'A'){
                ans = ans * n + (nums[i] - 'A' + 10);
                // 그 이하는 단순히 '0'만 빼면 된다.
            } else {
                ans = ans * n + (nums[i] - '0');
            }
        }
        return ans;
    }
}
