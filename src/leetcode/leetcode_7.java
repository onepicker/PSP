package leetcode;

/**
 * @author Picker
 * @date 2023/2/22 22:25
 */
public class leetcode_7 {
    public static int reverse(int x) {
        int symbol = 0;
        if(x==0){
            return x;
        }
        if(x>0){
            symbol = 1;
        }
        if(x<0){
            symbol = 0;
            x= -x;
        }
        int res =0;
        while(x>0){
            int concern =x%10;
            x=x/10;
            res=res*10+concern;
        }
        if(symbol==0 ){
            res = -res;
        }
        return  res;


    }

    public static void main(String[] args) {
        System.out.println(reverse(456));
    }
}
