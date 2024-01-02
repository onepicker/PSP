package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Picker
 * @date 2022/4/11 13:39
 */
//哈希表法
public class leetcode_1 {

        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }



}
