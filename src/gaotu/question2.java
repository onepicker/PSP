package gaotu;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/16 17:37
 */
public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
