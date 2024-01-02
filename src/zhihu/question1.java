package zhihu;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Picker
 * @date 2023/3/24 20:23
 */
public class question1 {
    public int maxRedpockets (int[][] redpockets) {
        // write code here
        int len = redpockets.length;
        int [] target = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(redpockets[i][0]>redpockets[j][0]&&redpockets[i][1]>redpockets[j][1]){
                    target[i]+=target[j]+1;
            }
            }
        }
        Arrays.sort(target);
        return target[len-1];
    }
}
