package leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/***
 * @author Harry (@aka 갈색토마토)
 * @since 2022.01.31
 * LeetCode
 * Two Sum
 * 문제 설명
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    private final static int[] ARR_NUM = {3,2,4};
    private final static int TARGET = 6;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum1(ARR_NUM, TARGET)));
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] answer = new int[2];

        for(int index = 0 ; index < nums.length ; index++ ) {
            int temp = target - nums[index];

            for(int k = index + 1 ; k < nums.length; k++) {
                if ( nums[k] == temp ) {
                    temp -= nums[k];
                    answer[1] = k;
                    break;
                }
            }
            answer[0] = index;
            if(temp == 0 ) {
                break;
            }
        }

        return answer;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            } map.put(target - nums[i], i);
        }
        return new int[]{};
    }

}
