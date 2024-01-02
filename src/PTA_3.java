import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class PTA_3 {
    static int c;
    static int n;
    static boolean Out = true;//这里新建一个标记位，用来记录有无第一个解出现，结束递归；

    public static void main(String args[]) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));//当需要输入大量数据时BufferedReader处理速度快，比Scanner高效；
        in.nextToken();
        n = (int) in.nval;
        in.nextToken();
        c = (int) in.nval;
        int a[] = new int[n];
        int SUM = 0;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            a[i] = (int) in.nval;
            SUM += a[i];//减去当所有数和小于c时的分支；
        }
        if (SUM >= c) {
            Count(a, 0, 0, "");
            if (Out)
                System.out.println("No Solution!");
        } else
            System.out.println("No Solution!");
    }

    private static void Count(int a[], int count, int sum, String s) {
        if (count < n && Out) {
            if (sum + a[count] == c) {
                Out = false;//结束递归；
                System.out.println(s + a[count] + " ");
            } else if (sum + a[count] < c) {//分支向下求解；
                Count(a, count + 1, sum + a[count], s + a[count] + " ");
                System.out.println(s + a[count] + " ");
            }
            Count(a, count + 1, sum, s);
        }
    }

}

