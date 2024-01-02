package exp_2.PSP_3;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Picker
 * @date 2022/3/6 11:06
 */
public class comp2 {
    public static void main(String[] args) {
        int[] nums ={1,4,25,10,25};
        System.out.println(minimalKSum(nums,2));

    }

    public static long minimalKSum(int[] nums, int k) {
        HashMap<Integer, Integer> map =new HashMap<>();
        long temp =0;
        for(int i=0; i<nums.length; i++){
           if(map.containsKey(nums[i])){
               int t =map.get(nums[i]);
               map.put(nums[i],t+1);
           }
           else {
               map.put(nums[i],1);
           }
        }
        int sat =1;
        int p =0;

        while(p<k){
            if(!map.containsKey(sat)){
//                System.out.println(sat);
                temp+=(long) sat;
                p++;
            }
            sat++;
        }
        return temp;

    }

}
