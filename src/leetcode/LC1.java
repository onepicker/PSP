package leetcode;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Picker
 * @date 2022/2/24 21:16
 */
public class LC1 {

        public static int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<nums.length; i++){
                if (map.containsKey(nums[i])) {
                    int count = map.get(nums[i]);
                    count++;
                    map.put(nums[i], count);
                } else {
                    map.put(nums[i], 1);
                }
            }
            Set<Integer> keySet = map.keySet();
            for (Integer it : keySet) {
                if(map.get(it)==1){
                   return it;
                }
            }
            return 0;

        }

    public static void main(String[] args) {
            int[] nums ={2,2,1};
        System.out.println(singleNumber(nums));
    }


}
