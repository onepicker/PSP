package xiecheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/29 20:16
 */
public class question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] link =new  int[n-1][3];
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < 3; j++) {
                link[i][j]= input.nextInt();
            }
        }
        for (int i = 0; i < n-1; i++) {
            System.out.println(link[i][2]);
        }
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(link[i][0]!=link[j][0]&&link[i][1]!=link[j][1]&&link[i][0]!=link[j][1]&&link[i][1]!=link[j][0]){
                    max = Math.max(link[i][2]+link[j][2],max);
                }
            }
        }
        System.out.println(max);
    }
}
