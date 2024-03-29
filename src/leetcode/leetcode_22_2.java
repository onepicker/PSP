package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/31 8:52
 */
public class leetcode_22_2 {
    public static List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        backtrack(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    public static void  backtrack(List<String> ans, StringBuilder cur , int open,int close,int max){
        if(cur.length()==max*2){
            ans.add(cur.toString());
            return;
        }
        if(open <max){
            cur.append('(');
            backtrack(ans,cur,open+1,close,max);
        }
        if(close<open){
            cur.append(')');
            backtrack(ans,cur,open,close+1,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }

    public static void main(String[] args) {
        generateParenthesis(6);
    }
}
