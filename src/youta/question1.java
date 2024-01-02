package youta;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/2 13:08
 */
public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();//矩阵大小
        int[][] a = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int[][] scores = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                scores[i][j] = input.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int sum = 0;
                sum += scores[i][j];
                if (i > 1) {
                    sum += scores[i - 1][j];
                }
                if (i < size - 1) {
                    sum += scores[i + 1][j];
                }
                if (j > 1) {
                    sum += scores[i][j - 1];
                }
                if (j < size - 1) {
                    sum += scores[i][j + 1];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);


    }
//    public static  int around(int[][] a, int[][] scores,int size,int i,int j){
//        int count = 0;
//        if(i>1){
//            if(a[i][j]==a[i-1][j]);
//            count++;
//        }
//        if(i<size-1){
//            if(a[i+1][j]==a[i][j]){
//                count++;
//            }
//        }
//        if(j>1){
//
//        }
//
//}
}
