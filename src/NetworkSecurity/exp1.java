package NetworkSecurity;

/**
 * @author Picker
 * @date 2022/9/22 8:12
 */
public class exp1 {
    static int N=4;//定义数组的长度为4 也可以更长，这个看自己计算的数据的大小
    static int carry=0;//定义初始进位值//加法函数 a,b,c是用户调用此函数时传来的数组名
   static void add(int[] a, int[] b, int[] c)
    {int i;
        //数组的高位存储的数据的低位 所以我们从i=N-1开始循环
        for(i = N - 1; i >= 0; i--)
        {c[i] = a[i] + b[i] + carry;
            carry=c[i]/10000;
            c[i]=c[i]%10000;
        }
    }
    static void sub(int[] a, int[] b, int[] c){
       int borrow = 0 ;
       for(int i =N - 1; i>=0; i--){
           c[i]=a[i]-b[i]-borrow;
           if(c[i]>=0){
               borrow=0;
           }
           else {
               c[i]+=10000;
               borrow=1;
           }
       }

    }
    static void mul(int[] a, int[] b, int[] c) {
        // b 为乘数且其数值较小，不属于大整数的范围
        int i, tmp;
        carry = 0;
        for (i = N - 1; i >= 0; i--) {
            tmp = (a[i] * b[i]) + carry;
            c[i] = tmp % 10000;
            carry = tmp / 10000;


        }
    }
    static void print(int[] c ,int k){
        int i;
        for (i=0;i<k;i++)
            System.out.print(c[i]);
        System.out.println();
    }


    public static void main(String[] args) {
        //1234034523670098+213654305769786
            int i,d=123;
            int[] a =new int[N];
            int[] b =new int[N];
            a= new int[]{1234, 345, 2367, 98};
            b= new int[]{213, 6543, 576, 9786};
            //将c[]清零
            int[] c = new int[N];
            for (i=0;i<N;i++)
            {c[i]=0;}
            //调用add函数

            mul(a,b,c);
            if (carry==1)
                System.out.println(carry);
            //调用print函数
        print(c,N);


    }
}
