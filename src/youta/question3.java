package youta;

/**
 * @author Picker
 * @date 2023/3/2 14:20
 */
public class question3 {
    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param k int整型
         * @return int整型
         */
        public int getPrimeFactorElement (int k) {
            // write code here
            int [] test = new int[k];
           // 2 3 5 7
            int count =0;
            int start =1;
            while(count<k+1){
               if(start==1){
                   count++;
                   test[count] = start;
               }
               if(start!=2&&start!=3&&start!=5&&start!=7&&isprime(start)==1){
                   count++;
                   test[count]=start;
               }
               start++;
            }

            return test[k]%(1000000007);
        }
        int isprime(int num){
            if(num==2||num==3||num==5||num==7){
                return 1;
            }
            if(num%2==0&&isprime(num/2)==1){
                return 1;
            }
            if(num%3==0&&isprime(num/3)==1){
                return 1;
            }if(num%5==0&&isprime(num/5)==1){
                return 1;
            }if(num%7==0&&isprime(num/7)==1){
                return 1;
            }
            return 0;
        }
    }
}
