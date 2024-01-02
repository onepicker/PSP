package leetcode;

public class leetcode_45 {
    public int jump(int[] nums) {
        int len = nums.length;
        int step = 0;
        while (len > 0) {
            for (int i = 0; i < len; i++) {
                if (i + nums[i] >= len) {
                    step++;
                    len = i;
                    break;

                }
            }
        }


        return step;
    }
}
