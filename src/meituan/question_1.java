package meituan;

import java.util.Scanner;

/**
 * @author Picker11551111
 * @date 2023/3/11 19:01
 */
public class question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nums = input.nextLine().toString();
        String arr[] = nums.split("");
        int len = nums.length();
        int [] a = new int[len];
        for (int i =0; i<len; i++){
            a[i]= Integer.parseInt(arr[i]);
        }
        int count = 0;
        for (int i = 1; i < len; i++) {
            if(a[i]==a[i-1]){
                a[i] = 77;
                count++;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(a[i]);
        }
        System.out.println(count);
    }
}
