package leetcode;

import java.util.Arrays;

/**
 * @author  Picker
 * @date  2022/3/18 0:49
 */public class leetcode_300 {
    int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        for (int i = 0; i < len; i++) {
            for (int j=0; j<len ; j++){
                dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }

        int res = 0;
        Arrays.sort(dp);
        return dp[0];
    
    }
}
