package ALI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* def backtrack(...):
    for 选择 in 选择列表:
        做选择
        backtrack(...)
        撤销选择
*/
/**
 * @author Picker
 * @date 2022/3/24 12:33
 */
public class StirngInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        System.out.println(str1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = null;
        try {
            str = br.readLine().split("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]+" ");
        }
        System.out.println(str.length);


    }
}
