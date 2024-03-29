package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/31 8:25
 */
public class leetcode_22_1 {

        public static List<String> generateParenthesis(int n) {
            List<String> combinations = new ArrayList<String>();
            generateAll(new char[2 * n], 0, combinations);
            return combinations;
        }

        public static void generateAll(char[] current, int pos, List<String> result) {
            if (pos == current.length) {
                if (valid(current)) {
                    result.add(new String(current));
                }
            } else {
                current[pos] = '(';
                generateAll(current, pos + 1, result);
                current[pos] = ')';
                generateAll(current, pos + 1, result);
            }
        }

        public static boolean valid(char[] current) {
            int balance = 0;
            for (char c: current) {
                if (c == '(') {
                    ++balance;
                } else {
                    --balance;
                }
                if (balance <0) {
                    return false;
                }
            }
            return balance == 0;
        }

    public static void main(String[] args) {
        generateParenthesis(3);
    }



}
