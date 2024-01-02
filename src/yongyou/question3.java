package yongyou;

import java.util.Stack;

/**
 * @author Picker
 * @date 2023/3/18 16:14
 */
public class question3 {
    public boolean isPopOrder (int[] pushSequence, int[] popSequence) {
        // write code here
        if(pushSequence.length==0&&popSequence.length==0)
        return true;
        if(pushSequence.length!=popSequence.length){
            return  false;
        }
        Stack<Integer> stack= new Stack<Integer>();
        for (int i = 0; i < pushSequence.length; i++) {
            for (int j = 0; j < pushSequence.length; j++) {
                if(pushSequence[i]==pushSequence[j]){
                    if(pushSequence[j+1]!=pushSequence[i+1]||pushSequence[j+1]!=popSequence[i-1])
                        return false;

                }
            }
        }
        int A = 1;
        int B=1;
        int flag =1;
        return true;
    }
}
