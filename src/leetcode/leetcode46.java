package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/11 0:31
 */
public class leetcode46 {
        List<List<Integer>> res = new LinkedList<>();
        public List<List<Integer>> permute(int[] nums) {
            LinkedList<Integer>  stack = new LinkedList<>();
            boolean[] used= new boolean[nums.length];

            backstack(used,nums,stack);
            return res;



        }
        public void backstack(boolean[] used, int[] nums, LinkedList<Integer> stack){
            if(stack.size()==nums.length){
                res.add(new LinkedList<>(stack));
                return;

            }
            for (int i = 0; i < nums.length; i++) {
                if(used[i]){
                    continue;
                }
                stack.add(nums[i]);
                used[i]=true;
                backstack(used,nums,stack);
                stack.removeLast();
                used[i]=false;
            }
        }

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        System.out.println();
    }

}
