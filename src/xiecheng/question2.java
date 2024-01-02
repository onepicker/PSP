package xiecheng;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Picker
 * @date 2023/3/29 19:11
 */
public class question2 {
    public static int[] findGoodPermutation(int n, int k) {
        // 遍历所有可能的组合
        int[] indices = new int[k];
        for (int i = 0; i < k; i++) {
            indices[i] = i;
        }
        while (true) {
            // 生成当前组合对应的排列
            int[] permutation = new int[n];
            for (int i = 0; i < k; i++) {
                permutation[indices[i]] = i + 1;
            }
            int max = 0;
            boolean valid = true;
            // 检查是否符合要求
            for (int i = 0; i < k; i++) {
                if (permutation[i] <= max) {
                    valid = false;
                    break;
                }
                max = permutation[i];
            }
            if (valid) {
                return permutation;
            }
            // 找到下一个组合
            int j = k - 1;
            while (j >= 0 && indices[j] == n - k + j) {
                j--;
            }
            if (j < 0) {
                break;
            }
            indices[j]++;
            for (int i = j + 1; i < k; i++) {
                indices[i] = indices[i - 1] + 1;
            }
        }
        // 没有找到符合要求的排列
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = findGoodPermutation(n, k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}

