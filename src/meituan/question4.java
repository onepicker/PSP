package meituan;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/11 19:53
 */
public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine().toString();
        String str2 = input.nextLine().toString();
        int[][] battle = new int[16][16];
        battle[0][0] =1;
        battle[15][15]=2;
        int x1=0,y1=0;
        int x2 = 15,y2=15;
        for (int i = 0; i < 256; i++) {
            if(str1.charAt(i)=='U'){
                if(x2==(x1-1)&&y1==x1){
                    continue;

                }
                else {
                    x1 =x1-1;
                    battle[x1][y1]=1;
                }
            }


        }
        System.out.println("D");
    }
}
