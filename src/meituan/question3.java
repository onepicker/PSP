package meituan;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/11 19:27
 */
public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();//几个流星
        int[] start = new int[n];
        int[] end = new int[n];
        int stime = 65535;
        int etime = 0;
        for (int i = 0; i < n; i++) {
            start[i] =  input.nextInt();
            if(start[i]<=stime){
                stime=start[i];
            }
        }
        for (int i = 0; i < n; i++) {
            end[i] =  input.nextInt();
            if(end[i]>=etime){
                etime =  end[i];
            }
        }
        int timecut = etime-stime+1;//时刻数
        int max = 0;
        int count =0;
        int[] timeback =  new int[timecut];
        for (int i = 0; i < n; i++) {
            for (int j = stime; j <=etime; j++) {
                if(j>=start[i]&&j<=end[i]){
                    timeback[j-stime]++;
                }
            }
        }
        for (int i = 0; i < timecut ; i++) {
            if(max<=timeback[i]){
                max=timeback[i];
            }
        }
        for (int i = 0; i <timecut ; i++) {
            if(max==timeback[i]){
                count++;
            }
        }
        System.out.print(max);
        System.out.println(count);
     }
}
