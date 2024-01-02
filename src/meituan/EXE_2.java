package meituan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2022/3/19 10:37
 */
public class EXE_2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(char val) { this.val = val; }
        ListNode(char val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int key = input.nextInt();
        char[] nums =new char[n];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);
        if(key ==1 )
        {
            JM(s,n);
        }

    }
    public static void JM(String s, int n){

        for (int i = 0; i < n; i++) {

        }







    }
}

