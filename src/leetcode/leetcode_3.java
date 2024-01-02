package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Picker
 * @date 2022/4/12 8:19
 */
public class leetcode_3 {
//    public static int lengthOfLongestSubstring(String s) {
//
//        int n = s.length();
//        int[][] dp = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            HashMap<Character, Integer> map = new HashMap<>();
//            for(int j = i + 1; j<n; j++){
//                dp[i][j]=1;
//                if(map.containsKey(s.charAt(j))){
//                    dp[i][j]=dp[i][j-1];
//                }else {
//                    dp[i][j] = Math.max(dp[i][j-1]+1,dp[i][j]);
//                    map.put(s.charAt(i),1);
//                }
//            }
//        }
//        return dp[0][n-1];
//    }
public static int lengthOfLongestSubstring(String s) {
    Set<Character> occ = new HashSet<>();
    int n = s.length();
    int rk = -1, ans =0;
    for (int i = 0; i < n; i++) {
        if(i!=0){
            occ.remove(s.charAt(i-1));
        }
        while(rk+1<n&&!occ.contains(s.charAt(rk+1))){

            occ.add(s.charAt(rk+1));
            rk++;
        }
        ans = Math.max(ans,rk-i+1);
    }
    return ans;

}

    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = lengthOfLongestSubstring(s);
        System.out.println(lengthOfLongestSubstring(s));
    }
}
