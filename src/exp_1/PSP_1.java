package exp_1;

import java.util.HashMap;
import java.util.*;

public class PSP_1 {
    private static boolean isPime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i < n; i += 2)
            if (n % i == 0)
                return false;
        return true;


    }

    public static void main(String[] args) {
        int n = 100;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (n > 0) {
            int num = (int) (Math.random() * 1000);
            if (isPime(num)) {
                if (map.containsKey(num)) {
                    int count = map.get(num);
                    count++;
                    map.put(num, count);
                } else {
                    map.put(num, 1);
                }
            }
            //System.out.println(num);
            n--;
        }
        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet) {
            System.out.println(i + ":" + map.get(i));
        }
    }
}


