package leetcode;

public class leetcode_53 {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int pre = 0;//pre是每次遍历前面的累加值，是以该位置元素为结尾的最大和
        int max = nums[0];
        for (int x : nums) {
            pre = Math.max(x, pre + x);
            max = Math.max(max, pre);
        }
        return max;
    }
}
