package exp_2.PSP_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/6 10:33
 */
public class comp1 {
    public static void main(String[] args) {
        cellsInRange("A1:F1");
    }

    public static void cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char l1 = s.charAt(0);
        char l2 = s.charAt(3);
        char w1 = s.charAt(1);
        char w2 = s.charAt(4);
        for(char j = l1; j<=l2; j++){
            for(char i =w1; i<=w2; i++ ){
              String s1 = String.format("%s%s", j, i);
                System.out.println(s1);

              res.add(s1);
            }
        }
    }
}
