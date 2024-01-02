package gaotu;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/16 17:40
 */
public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.next().toString();
        String num2 = input.next().toString();
        if(num1.equals("0")||num2.equals("0")){
            System.out.println("0");
            System.exit(0);
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int [] res = new int[len1+len2];
//        int count1=0,count2=0;
        for (int i = len1-1; i >= 0; i--) {
            int x =  num1.charAt(i)-'0';
            for (int j = len2-1; j >=0; j--) {
                int y = num2.charAt(i)-'0';
                res[i+j+1]=x*y;
            }
        }
        for (int i = len1+len2-1; i>0; i--) {
            res[i-1]+=res[i]/10;
            res[i]%=10;
        }
        int index  = res[0]==0?1:0;
        StringBuffer count = new StringBuffer();
        while (index<len1+len2){
            count.append(res[index]);
            index++;
        }
        System.out.println(count.toString());
        

    }
}
