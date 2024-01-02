package yongyou;

/**
 * @author Picker
 * @date 2023/3/18 15:58
 */
public class question2 {
    public String[] toByteArray (int value) {
        // write code here
        int i=0;
        int flag=0;
        while(value>0){
            if(value>128){
                value=value/128;
                i++;
            }
            if(value==128){
                i++;
                flag=1;
                break;
            }
            if(value<128){
                break;
            }
        }
        String[] res =  new String[i];
        for (int j = 0; j < i; j++) {
            if(j==i-1&&flag==1){
                res[j]="1";
            }
            res[j]="80";
        }
        return  res;
    }
}
