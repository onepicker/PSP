package exp_2;

import javax.swing.*;
import java.util.*;

public class PSP_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入测试用例:");
        String str = input.nextLine();
        String[] word = str.split(" |\\.|\\,|\\。+");
        int len = word.length;
        HashMap<String, Integer> map = new HashMap<String, Integer>();


        for (int i = 0; i < len; i++) {
            if (map.containsKey(word[i])) {
                int count = map.get(word[i]);
                count++;
                map.put(word[i], count);

            } else {
                map.put(word[i], 1);
            }
        }
        List<HashMap.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());//Lambda表达式

        Set<String> key = map.keySet();
        for (HashMap.Entry<String, Integer> c : list) {
            System.out.println(c.getKey() + " : " + c.getValue());
        }

        /*for(String i : key)
        {
            System.out.println(i+":"+map.get(i));
        }

         */
    }


}
