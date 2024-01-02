package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Picker
 * @date 2023/2/22 18:33
 */
public class leetcode_6 {
    public static String convert(String s, int numRows) {
        if(numRows<2){
            return s;
        }
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int n = 0; n < numRows; n++) {
            rows.add(new StringBuilder());

        }
        int i =0 ,flag =-1;
        for (char c:s.toCharArray()){
            rows.get(i).append(c);
            if(i==0||i == numRows-1) flag=-flag;
            i+=flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows){
            res.append(row);
        }
        return res.toString();


    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
