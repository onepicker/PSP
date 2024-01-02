package leetcode;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

/**
 * @author Picker
 * @date 2022/3/19 22:42
 */
public class leetcode_race2 {

        public static long maximumSubsequenceCount(String text, String pattern) {
            char front = pattern.charAt(0), back = pattern.charAt(1);
            long sum = 0;
            int fcnt = 0, bcnt = 0;
            // 从后向前遍历，统计pattern[0]和pattenr[1]的数量以及初始子序列数量。
            for(int i = text.length() - 1; i >= 0; i--) {
                char c = text.charAt(i);
                if(c == front) {
                    sum += bcnt;
                    fcnt++;
                }
                if(c == back){
                    bcnt++;
                }
            }
            // 返回初始子序列数量+新增的子序列数量
            return sum + Math.max(bcnt, fcnt);
        }






    public static void main(String[] args) {
        String str1 =  "fwymvreuftzgrcrxczjacqovduqaiig";
        String str2 = "yy";
        System.out.println(maximumSubsequenceCount(str1,str2));
    }
}
