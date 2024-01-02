package meituan;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/11 20:12
 */
public class question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int k =input.nextInt();
        String arr= input.next().toString();
        char[][] str = new char[m][n];
        int max = 0;
        int[][] value = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                str[i][j]=arr.charAt(i*n+m);
                value[i][j] = input.nextInt();
            }
        }
        int count=value[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                if(str[i][j]==str[i][j-1]){
                    count+=value[i][j];
                }
                if (str[i][j]!=str[i][j-1]){
                    count+=value[i][j];
                    count-=k;
                }
            }


        }
        System.out.println(count);
    }
}
