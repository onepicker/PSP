package baidu;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fornum = 0;
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        while (num2 == 0) {
            String text = input.next().toString();
            if(text =="for"){
                res++;
            }
            if(input.next().toString()==null){
                break;
            }

        }
        System.out.println(res);
    }
}
