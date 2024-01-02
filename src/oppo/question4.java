package oppo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/13 20:07
 */
public class question4 {
    public static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        ListNode node3 =combineTwoDisorderNodeToOrder(node1,node2);
        while (node3.val!=0){
            System.out.print(node3.val);
            node3= node3.next;
        }
    }
    public static ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ListNode f1 = node1;
        ListNode f2 = node2;
        int[] res = new int[100];
        int len =0;
        while (f1!=null){
            res[len]=f1.val;
            f1=f1.next;
            len++;
        }
        while (f2!=null){
            res[len]=f2.val;
            f2=f2.next;
            len++;
        }
        Arrays.sort(res);
        ListNode dump = new ListNode(0);
        ListNode we = dump.next;
        for (int i = 0; i < len; i++) {
            we.val=res[i];
            we= we.next;
        }
        return  dump.next;
    }
}
