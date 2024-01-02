package leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * @author Picker
 * @date 2022/3/16 0:23
 */
//下降路径最小和
public class leetcode_931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], 66666);
        }

        for (int j = 0; j < n; j++) {
            res = Math.min(res,dp(matrix,n-1,j));
        }
       return res;
    }
    int[][] memo;//备忘录
//    int dp(int[][] matrix, int i, int j) {
//        // 1、索引合法性检查
//        if (i < 0 || j < 0 ||
//                i >= matrix.length ||
//                j >= matrix[0].length) {
//
//            return 99999;
//        }
//        // 2、base case
//        if (i == 0) {
//            return matrix[0][j];
//        }
//        // 3、查找备忘录，防止重复计算
//        if (memo[i][j] != 66666) {
//            return memo[i][j];
//        }
//        // 进行状态转移
//        memo[i][j] = matrix[i][j] + min(
//                dp(matrix, i - 1, j),
//                dp(matrix, i - 1, j - 1),
//                dp(matrix, i - 1, j + 1)
//        );
//        return memo[i][j];
//    }
    /*表示从第一行某列的位置到(i,j)最短路径*/
    public int dp(int[][] matrix ,int i ,int j){
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length){
            return 99999;
        }
        if(i==0) //表示为起始位置
        {
            return matrix[0][j];
        }
        if(memo[i][j]!=6666){
            return memo[i][j];
        }
       memo[i][j] = matrix[i][j]+min(dp(matrix, i, j + 1),dp(matrix, 1 + i,j+1),dp(matrix,i-1,j+1));
        return memo[i][j];

    }
    int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }




}
