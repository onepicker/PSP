package ALI;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/3/25 9:51
 */
public class ALI_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] nums = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < 5; i1++) {
                nums[i][i1]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int flag =1;
            int step =0;
            while (flag==1){
                Arrays.sort(nums[i]);
                for (int i1 = 1; i1 < 5; i1++) {
                    if(nums[i][i1]>0){
                        nums[i][i1]--;
                    }
                    else {
                        flag = 0;
                        break;
                    }
                }
                step++;
            }
            System.out.println(step-1);
        }




    }
}
