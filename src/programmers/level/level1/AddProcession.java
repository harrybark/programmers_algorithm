package programmers.level.level1;


import java.util.Arrays;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2021.11.20
 * Programmers algorithm
 * 행렬의 덧셈
 * arr1	                arr2	        return
 * [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
 * [[1],[2]]	    [[3],[4]]	    [[4],[6]]
 */

public class AddProcession {

    private static int[][] arr1 = {{1,2}, {2,3}};
    private static int[][] arr2 = {{3,4}, {5,6}};

    public static void main(String[] args) {
        int[][] solution = {};
        try {
            solution = solution(arr1, arr2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Arrays.toString(solution));
        }
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) throws Exception {

        int[][] answer = {};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        answer = new int[arr1Length][arr1[0].length];
        if (arr1Length != arr2Length) {
            throw new Exception();
        }


        return answer;
    }
}
