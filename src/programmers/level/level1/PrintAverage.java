package programmers.level.level1;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.11.27
 * Programmers algorithm
 * 배열의 평균 구하기
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 *
 * arr	return
 * [1,2,3,4]	2.5
 * [5,5]	5
 */
public class PrintAverage {

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4};

        double solution = solution(arr);
        System.out.println(solution);
    }

    public static double solution(double[] arr) {

        if( ! isValid(arr)) {
            return -999999;
        }

        double result = 0;
        for ( int index = 0 ; index < arr.length; index++ ){
            result += arr[index];
        }

        return result/arr.length;
    }
    public static boolean isValid(double[] arr){
        if( arr.length < 1 || arr.length > 100 ) {
            return false;
        }

        for(int index = 0 ; index < arr.length; index++) {
            if(arr[index] > 10000 || arr[index] < -10000) {
                return false;
            }

            if(arr[index] % 1 != 0){
                return false;
            }
        }

        return true;
    }
}
