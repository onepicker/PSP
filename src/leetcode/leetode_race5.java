package leetcode;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Picker
 * @date 2022/3/20 10:40
 */
//3-20
public class leetode_race5 {
    public int countHillValley(int[] nums) {
        int len = nums.length;
        int feng = 0;
        int gu = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if(map.containsKey(nums[i])){
               continue;
            }
            else {
                map.put(nums[i],nums[i]);
            }
        }
        Set<Integer> key = map.keySet();
        for (int i : key) {
            if(i==0||i==key.size()-1){
                continue;
            }
            if(map.get(i)>map.get(i+1)&&map.get(i-1)<map.get(i)){
                feng++;
            }
            if(map.get(i)<map.get(i+1)&&map.get(i-1)>map.get(i)){
                gu++;
            }
        }
       return feng;


    }
}
