package baidu;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//组数
        for (int i = 0; i < n; i++) {
            int len = input.nextInt();
            int [] a = new int[len];
            for(int j=0; j<len; j++){
                a[j] = input.nextInt();
            }
            int count=0;
            for(int s =0; s<len;s++){
                if(istrue(a,s+1)){
                    count++;
                }
                if(istrue2(a,s)){
                    count++;

                }
            }
            System.out.println(count);
        }
    }
    static void  bubbleSort(int[] a){
        int len =a.length;
        for(int i =0; i<len; i++){
            for(int j=i+1; j<len;j++){
                if(a[i]>a[j]){
                    int exp;
                    exp=a[j];
                    a[j]=a[i];
                    a[i]=exp;
                }
            }
        }
    }
    static boolean istrue(int[] b,int n){
        int flag=0;
        int [] a= new int[n];
        for(int i =0; i<n; i++){
            a[i] = b[i];
        }
        bubbleSort(a);
        int len =a.length;
        for (int i = 0; i < len; i++) {
            if(a[i]!=i+1){
                flag=1;
            }

        }
        if(flag==0){
            return true;
        }
        return false;
    }
    static boolean istrue2(int[] b,int n1){
        int flag=0;
        int len1 =b.length;
        int n = len1-n1-1;
        int [] a= new int[n];
        for(int i =0; i<n; i++){
            a[i] = b[n1+i];
        }
        bubbleSort(a);
        int len =a.length;
        for (int i = 0; i < len; i++) {
            if(a[i]!=i+1){
                flag=1;
            }

        }
        if(flag==0){
            return true;
        }
        return false;
    }
}
