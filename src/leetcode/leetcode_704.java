package leetcode;

/**
 * @author Picker
 * @date 2022/3/29 12:14
 */
public class leetcode_704 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = n;
        while(right>=left){
            int mid = (right-left)/2+left;
            if(nums[mid]>=target){
                right = mid-1;
                ans = mid;
            }
            else {
                left = mid+1;
            }
        }
        return ans;

    }
}
