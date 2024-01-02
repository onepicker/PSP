package leetcode;

import java.util.Arrays;

/**
 * @author Picker
 * @date 2022/3/19 23:36
 */
public class leetcode_race3 {
    static int step =0;
    public static int halveArray(int[] nums) {
        int len =nums.length;
        int sum =0;
        Double[] Nums = new Double[len];
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
            Nums[i] = Double.valueOf(nums[i]);
        }

        RB(Nums,sum);
        return step;
    }
    public static void RB (Double[] nums,int sum){

        step++;
        int len =nums.length;
        Arrays.sort(nums);
        Double Max= nums[len-1];
        nums[len-1]=Max/2;
        double sum1 =0;
        for (int i = 0; i < len; i++) {
            sum1+=nums[i];
        }
        if(sum1<=sum/2){
            return;
        }
        else {
            RB(nums,sum);
        }

    }

    public static void main(String[] args) {
        int[] nums ={18,22,62,61,1,88,17,98,38,32,51,57,7,29,40,61,62,13,89,41,73,85,88,60,59,76,71,76,76,41,29,43,19,9,79};
        System.out.println(halveArray(nums));
    }
}
