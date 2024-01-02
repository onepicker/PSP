package youta;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/2 13:47
 */
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 = input.nextInt();//矩阵大小
        int size2 = input.nextInt();//目标大小
        int l =input.nextInt();
        int r =input.nextInt();
        int u =input.nextInt();
        int d =input.nextInt();
        int[][] a = new int[size1][size1];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                a[i][j] = input.nextInt();
            }
        }
        int add = size2-size1;
        int [][] b = new int[size2][size2];
        for(int i =0; i<size2; i++){
            for(int j=0; j<size2;j++){
                int i2 =i*(size1)/(size2);
                int j2 =j*(size1)/(size2);
                b[i][j] = a[i2][j2];
            }
        }
        for(int i = l; i<=r; i++){
            for(int j=u; j<=d; j++){
                int i1 =(i-l)/(r+add-l)*(r-l)+l;
                int j1 =(j-u)/(d+add-u)*(d-u)+u;
                b[i1][j1]=a[i][j];
            }
        }
        for (int i =0; i<size2; i++){
            for (int j = 0; j < size2; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


    }
}
