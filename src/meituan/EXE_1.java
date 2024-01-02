package meituan;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/3/19 10:04
 */
public class EXE_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] price = new int[n];
        int[] price1 = new int[n];
        for (int i = 0; i < n; i++) {
            price[i]= input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            price1[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] limit = new int[m];
        for (int i = 0; i < m; i++) {
            limit[i] = input.nextInt();
        }
        int[] cut = new int[m];
        for (int i = 0; i < m; i++) {
            cut[i] = input.nextInt();
        }
        int sum =0;
        int sum1 = 0;
        int sum2 = 0 ;
        for (int i = 0; i < n; i++) {
            sum1 += price1[i];
            sum += price[i];
            sum2= sum;
            for (int i1 = 0; i1 < m; i1++) {
                if(sum>limit[i1]){
                    sum2 = sum-cut[i1];
                }
                 else {
                     sum2 =sum;
                }
            }
            if(sum1==sum2){
                System.out.print("B");
            }
            if(sum1>sum2){
                System.out.print("M");
            }
            if(sum1<sum2){
                System.out.print("Z");
            }
        }

    }
}
