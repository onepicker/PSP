//package leetcode;
//
///**
// * @author Picker
// * @date 2022/3/1 23:29
// */
//public class leetcode104 {
//   /* *//**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }
//     */
//        public int maxDepth(TreeNode root) {
//            if(root==null)
//            {
//                return 0;
//            }
//            else{
//                int left = maxDepth(root.left);
//                int right =maxDepth(root.right);
//                int depth =(left>right?left:right)+1;
//                return depth;
//
//            }
//        }
//
//
//}
