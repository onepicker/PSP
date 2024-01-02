package leetcode;

/**
 * @author Picker
 * @date 2022/3/29 0:25
 */
public class leetcide_35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int  right = n-1;
        int ans = n;
        while (left<=right){
            int mid = (right-left)/2+left;
            if(nums[mid]>=target){
                ans = mid;
                right = mid -1 ;
            }
            if(nums[mid]<target){
                ans = mid;
                left = mid +1;
            }
        }
        return ans;




    }
}
