package baidu;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =  input.nextInt();
        int b = input.nextInt();
        int [] orgin = new int[a];
        for (int i = 0; i <a ; i++) {
            orgin[i] = input.nextInt();
        }


    }
    static double fuction(int [] a){
        int len = a.length;
        int sum = 0;
        for(int i=0; i<len; i++){
            sum+=a[i];
        }
        double res = sum/len;
        return res;
    }
}
