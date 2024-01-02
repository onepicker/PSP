package leetcode;

/**
 * @author Picker
 * @date 2023/2/21 14:51
 */
public class leetcode_5 {
    public static String longestPalindrome(String s) {
        int length = s.length();
        if(length<2){
            return s;
        }
        int[][] dp = new int[length][length];

        for (int i = 0;  i< length; i++) {
            dp[i][i]=1;
        }
        for(int j =1; j<length-1;j++){
            for (int i = 1; i <= j; i++) {
                if(s.charAt(i-1)==s.charAt(j+1)){
                    dp[i-1][j+1]=dp[i][j];
                }

            }
        }
        int max =0;
        int left=0;
        int right=0;
        for (int i = 0; i < length; i++) {
            for (int j= 0; j< length; j++){
                if(max<(j-i)&&dp[i][j]==1){
                    max = j-1;
                    left=i;
                    right=j;
                }
            }

        }
        System.out.println(dp[1][3]);
        return s.substring(left,right+1);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababa"));

    }

}
