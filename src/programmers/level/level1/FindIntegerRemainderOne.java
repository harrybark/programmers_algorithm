package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.01.03
 * Programmers algorithm
 * 나머지가 1이 되는 수 찾기
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다.
 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 *
 * 제한사항
 * 3 ≤ n ≤ 1,000,000
 * 입출력 예
 * n	result
 * 10	3
 * 12	11
 */
public class FindIntegerRemainderOne {

    public static void main(String[] args) {
        FindIntegerRemainderOne findIntegerRemainderOne = new FindIntegerRemainderOne();
        System.out.println(findIntegerRemainderOne.solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        for ( int index = 2; index < n; index++) {
            if( n % index == 1) {
                answer = index;
                break;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        for(int i = n - 1; i > 1 ; i-- ) {
        	if( n / i == 1) {
        		int temp = i;
        		System.out.println(temp);
        		for (int k = 2; k <= temp; k++) {
        			if(temp % k == 0) {
        				answer = k;
        				return answer;
        			}
        		}
        	}
        }
        return answer;
    }
}
