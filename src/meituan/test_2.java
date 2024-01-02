package meituan;

/**
 * @author Picker
 * @date 2022/3/18 20:51
 */
import java.io.*;
import java.util.*;
public class test_2 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] ss = br.readLine().split(" ");
        int n = Integer.parseInt(s);
        int[] nums = new int[n];
        for(int i = 0;i < nums.length;i++){
            nums[i] = Integer.parseInt(ss[i]);
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1;i <= nums.length;i++){
            //记录操作次数，序列上的数和顺序序号的绝对值
            count += Math.abs(nums[i - 1] - i);
        }
        System.out.println(count);
    }

}


