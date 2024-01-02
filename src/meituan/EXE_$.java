package meituan;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/3/19 11:15
 */
public class EXE_$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k1 = input.nextInt();
        int k2 = input.nextInt();
        int[] nums = new int[n];
        int sum =0;
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
            }
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
           for( int j =n-1;j>0; i-- ){
               sum += dp[i][j];
               if(sum%k1==0&sum%k2!=0){
                   dp[i][j]=Math.max(dp[i][j-1]+1,dp[i-1][i-j]);
               }
           }

            }
        System.out.println(dp[0][n-1]%998244353);
        }

    }

