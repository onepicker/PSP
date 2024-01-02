package xiecheng;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/29 20:07
 */
public class question_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=n-i;
        }
        for (int i = 0; i <n ; i++) {
            b[i]=i+1;
        }
        if(n==k){
            for (int i = 0; i < n; i++) {
                System.out.print(b[i]);
            }
        }
        if(k==1){
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
        }




    }
}
