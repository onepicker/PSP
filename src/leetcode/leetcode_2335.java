package leetcode;

import java.util.Arrays;

/**
 * @author Picker
 * @date 2023/2/11 22:41
 */
public class leetcode_2335 {

        public static int fillCups(int[] amount) {
           Arrays.sort(amount);
           if(amount[2]>amount[0]+amount[1]){
               return amount[2];
           }
           int sum = amount[0]+amount[1]+amount[2]+1;
           return sum/2;




        }

    public static void main(String[] args) {
            int[] mums ={1,2,3};
        System.out.println(fillCups(mums));
    }

}
