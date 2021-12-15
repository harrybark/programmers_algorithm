package programmers.level.level1;

import java.util.*;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.12.11
 * Programmers algorithm
 * 제일 작은 수 제거하기
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * arr	return
 * [4,3,2,1]	[4,3,2]
 * [10]	[-1]
 */
public class RemoveMinimum {

    public static void main(String[] args) {
        int[] answer = solution(new int[]{4,3,2,1});
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};

        if(arr.length == 1) {
            return new int[]{-1};
        }

        int[] tempArr = arr.clone();
        // 1.정렬
        Arrays.sort(tempArr);
        // 2.가장 작은 값이 배열에 포함되어 있는지 확인
        int minNum = tempArr[0];

        List<Integer> list = new ArrayList<>();
        for ( int i = 0 ; i < arr.length; i++) {
            if( minNum != arr[i]) {
                list.add(arr[i]);
            }

        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static boolean checkExist(int[] arr, int num){
        for(int k : arr) {
            if(k == num) {
                return true;
            }
        }
        return false;
    }
}
