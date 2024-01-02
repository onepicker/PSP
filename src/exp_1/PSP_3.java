package exp_1;

import java.util.*;

public class PSP_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入测试语句:");
        String str = input.next();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> keySet = map.keySet();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (map.containsKey(ch)) {
                char ch1 = (char) (ch - 32);
                int num = map.get(ch);
                if (map.containsKey(ch1)) {
                    num = num + map.get(ch1);
                }
                System.out.println(ch + " " + (char) (ch - 32) + " : " + num);
            }
        }
    }
}
