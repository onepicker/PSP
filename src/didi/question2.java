package didi;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/12 19:55
 */
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p =input.nextInt();
        int[] prt = new int[p];
        for (int i = 0; i < p; i++) {
            prt[i]= input.nextInt();
        }
        int area = (int) Math.pow(2,n);
        char [][] gard = print(n);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < area; j++) {
                System.out.print(gard[prt[i]-1][j]);
            }
            System.out.println();

        }


    }
    static char[][] print(int n){
        int area = (int) Math.pow(2,n);
        char[][] gard = new char[area][area];
        char[][] chars1 = new char[2][2];
        char[][] chars2 = new char[2][2];
        chars1= new char[][]{{'W', 'B'}, {'B', 'W'}};
        chars2=new char[][]{{'B', 'B'}, {'B', 'B'}};
        if(n==1){
            return chars1;
        }
        if(n>=2){
            for (int i = 0; i < area; i++) {
                for (int j = 0; j < area; j++) {
                    if(i<area/2&&j<area/2){
                        gard[i][j]='B';
                    }
                    if (i<area/2&&j>=area/2){
                        char[][] temp = print(n-1);
                        gard[i][j]=temp[i][j-area/2];
                    }
                    if(i>=area/2&&j>=area/2){
                        gard[i][j]='B';
                    }
                    if (i>=area/2&&j<area/2){
                        char[][] temp =print(n-1);
                        gard[i][j]=temp[i-area/2][j];
                    }
                }
            }
        }
        return gard;


    }
}
