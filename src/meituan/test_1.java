package meituan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/3/18 20:10
 */
public class test_1 {
    public static int outScore(int n, int x, int y, int[] scores) {
        if (x * 2 > n || y * 2 < n) return -1;
        Arrays.sort(scores);

        for (int i = x-1; i < scores.length; i++) {
            int out = i+1;
            int up = scores.length - out;
            if (out >= x && out <= y && up >= x && up <= y) {
                return scores[i];
            }
        }
        return -1;
    }



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
        int[] sum = new int[n];
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];

        for (int i = 0; i < n; i++) {
            if(i==0){
                sum[i]=price[i];
                sum1[i]=price[i];
            }
            else {
                sum[i]=sum[i-1]+price[i];
                sum1[i]=sum1[i-1]+price1[i];
            }
        }



    }


}
