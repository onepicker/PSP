package ALI;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/3/25 9:29
 */
/*
* registration complete
illegal length
acount existed
illegal charactor*/
public class ALI_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = input.next();
        }
        for (int i = 0; i < n; i++) {
            int flag = 1;
            if(map.containsKey(str[i])) {
                System.out.println("acount existed");
                continue;
            }
            if(!map.containsKey(str[i])){
                map.put(str[i],1);
            }
            int len = str[i].length();
            if(len<6||len>12){
                System.out.println("illegal length");
                continue;
            }
            for (int i1 = 0; i1 < len; i1++) {
               char ch= str[i].charAt(i1);
               if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){

               }
               else {
                   flag =0;
                   System.out.println("illegal charactor");
                   break;
               }

            }
            if(flag==1){
                System.out.println("registration complete");

            }


        }

    }
}
