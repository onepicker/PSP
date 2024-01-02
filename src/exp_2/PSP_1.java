package exp_2;

import java.util.*;;

public class PSP_1 {
    public static void main(String[] args) {
        int n = 100;
        HashMap<Integer, Integer> map = new HashMap<>(n);
        while (n > 0) {
            int num = (int) (Math.random() * 1000);
            if (map.containsKey(num)) {
                int count = map.get(num);
                count++;
                map.put(num, count);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> key = map.keySet();
        for (int i : key) {
            System.out.println(i + ":" + map.get(i));
        }


    }
}
