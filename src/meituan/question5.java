package meituan;

import YUEWEN.yuewen_1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/11 20:40
 */
public class question5 {
    public static class TreeNode {
        char val;
       TreeNode left;
       TreeNode right;
        TreeNode() {}
        TreeNode(char val) { this.val = val; }
        TreeNode(char val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next().toString();
        int[] index =  new int[n-1];
        
        for (int i = 0; i < n-1; i++) {
            index[i] =  input.nextInt();
            TreeNode node = new TreeNode(str.charAt(i+1));



        }
        System.out.println();


    }
     boolean isPing(TreeNode node){
        if (node.left.val!=node.right.val){
            return true;
        }
        if(node.left==null&&node.right==null){
            return true;
        }
        return false;
    }
}
