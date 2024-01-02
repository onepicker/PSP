package xiecheng;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/29 19:02
 */
public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next().toString();
        int len  =  str.length();
        int count = 0 ;
        for (int i = 0; i < len; i++) {
            if(str.charAt(i)=='6'||str.charAt(i)=='0'||str.charAt(i)=='9'){
                count+=1;
            }
            if(str.charAt(i)=='8'){
                count+=2;
            }
        }
        System.out.println(count);
    }
}
