package oppo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Picker
 * @date 2023/3/13 19:01
 */
public class question1 {
    public static void main(String[] args) {


    }
    public static int maxDigit (int[] digits) {
        // write code here
        int len  = digits.length;
        Arrays.sort(digits);
//        for (int i = 0; i < len; i++) {
//            System.out.println(digits[i]);
//        }
        int sum = 0;
        for (int i = len-1; i >=0 ; i--) {
            sum=sum*10+digits[i];
        }
        return sum;
    }
}
