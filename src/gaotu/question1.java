package gaotu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/16 17:26
 */
public class question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str =  String.valueOf(num);
        ArrayList<Character> list = new ArrayList<>();
        for (int i = str.length()-1; i > 0; i--) {
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.print(o);
        }
    }
}
