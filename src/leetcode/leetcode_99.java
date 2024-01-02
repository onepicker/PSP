package leetcode;


import java.util.HashSet;
/*DFS YYDS！！！*/
/**
 * @author Picker
 * @date 2022/3/27 0:10
 */
public class leetcode_99 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        //用两个变量x，y来记录需要交换的节点
        private TreeNode x = null;
        private TreeNode y = null;
        private TreeNode pre = null;
        public void recoverTree(TreeNode root) {
            dfs(root);
            //如果x和y都不为空，说明二叉搜索树出现错误的节点，将其交换
            if(x!=null && y!=null) {
                int tmp = x.val;
                x.val = y.val;
                y.val = tmp;
            }
        }

        //中序遍历二叉树，并比较上一个节点(pre)和当前节点的值，如果pre的值大于当前节点值，则记录下这两个节点
        private void dfs(TreeNode node) {
            if(node==null) {
                return;
            }
            dfs(node.left);
            if(pre==null) {
                pre = node;
            }
            else {
                if(pre.val>node.val) {
                    y = node;
                    if(x==null) {
                        x = pre;
                    }
                }
                pre = node;
            }
            dfs(node.right);
        }


}
