package number;

import java.util.HashMap;

/**
 * Created by lianyuchen on 18/1/2.
 */
public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

     You may assume that each input would have exactly one solution, and you may not use the same element twice.

     Example:
     Given nums = [2, 7, 11, 15], target = 9,

     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     */

    public static void main(String[] args){

    }
    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i= 0; i < length; ++i){
            if (map.containsKey(nums[i])){
                return new int[]{ map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
