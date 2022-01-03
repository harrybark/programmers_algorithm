package programmers.level.level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.01.03
 * Programmers algorithm
 * 두 개 뽑아서 더하기
 * 문제 설명
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
 * 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 * 입출력 예
 * numbers	result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 * [5,0,2,7]	[2,5,7,9,12]
 */
public class AddTwoNumInArray {

    private static final int[] INPUT1 = {2,1,3,4,1};
    private static final int[] INPUT2 = {5,0,2,7};

    public static void main(String[] args) {
        String answer = String.format("The Answer is %s.", Arrays.toString(solution(INPUT2)));
        System.out.println(answer);
    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < numbers.length ; i++ ) {
            for (int k = i + 1; k < numbers.length; k++ ) {
                int temp = numbers[i] + numbers[k];

                if(list.indexOf(temp) < 0) {
                    list.add(temp);
                }
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).sorted().toArray();

        return answer;
    }
}
