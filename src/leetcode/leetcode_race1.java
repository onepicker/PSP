package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Picker
 * @date 2022/3/19 22:32
 */
public class leetcode_race1 {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if(map.containsKey(nums[i])){
                int temp =map.get(nums[i]);
                map.put(nums[i],temp+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        Set<Integer> key = map.keySet();
        int flag = 1;
        for (int i : key) {
            if(map.get(i)%2==1){
                flag=0;
            }
        }
        if (flag==1){
            return true;
        }
        else {
            return false;
        }

    }
}
