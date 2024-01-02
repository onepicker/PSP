package leetcode;

import static java.lang.Math.max;

public class leetcode_55 {

    public boolean canJump(int[] nums) {

        int len = nums.length;
        int[] dp = new int[len];
        int right = 0;
        for (int i = 0; i < len; i++) {
            dp[i] = 0;
            if (i <= right) {
                right = max(right, nums[i] + i);
                dp[i]++;
            }
            if (right >= len - 1) {
                break;
            }
        }
        return false;

    }

}
