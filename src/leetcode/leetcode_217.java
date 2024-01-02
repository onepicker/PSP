package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Picker
 * @date 2023/1/1 13:45
 */
public class leetcode_217 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =1 ;i<nums.length ;i++){
            int j = i-1;
            if(nums[i]==nums[j]){
                return true;
            }
        }
        return false;


    }
        public boolean Hash_containsDuplicate(int[] nums) {
            Set<Integer> set;
            set = new HashSet<Integer>();
            for (int x : nums) {
                if (!set.add(x)) {
                    return true;
                }
            }
            return false;
        }




    public static void main(String[] args) {
        int [] nums={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
