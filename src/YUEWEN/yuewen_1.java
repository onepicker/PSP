package YUEWEN;


import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/4/8 18:49
 */
public class yuewen_1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
    }
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public boolean isSubtree (TreeNode s, TreeNode t) {
        // write code here
        if(s==null&&t==null){
            return true;
        }
        if(pre1(s,t)){
            return true;
        }
        else {
            return false;
        }

    }
    public  boolean isSame(TreeNode s ,TreeNode t){
        if(s.left==null&& null == s.right &&t.left==null&&t.right==null&&s.val==t.val){
            return true;
        }else {
            return false;
        }
    }
     boolean pre1(TreeNode s, TreeNode t){
       if(isSame(s,t)){
           return true;
       }
       if(s.left==null&s.right==null&&!(t.left==null&t.right==null)){
           pre1(s,t.left);
           pre1(s,t.right);
       }
       if (t.left==null&t.right==null&&!(s.left==null&s.right==null)){
           pre1(s.left,t);
           pre1(s.right,t);
       }
       else {
           pre1(s.left, t.left);
           pre1(s.right, t.right);
       }
        return false;

    }



}
