package tonghuashun;

import leetcode.leetcode_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/9 14:24
 */
//输入：head = [1,2,3,4,5], k = 2
//    输出：[4,5,1,2,3]
//}

public class question1 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void fuction(ListNode list ,int k){
        ListNode head =new ListNode();
        ListNode pre =  new ListNode();
        head = list;
        pre = list;
        int len= 0;
        while(pre!=null){
            pre = pre.next;
            len++;
        }
        pre.next=head;
        ListNode prev = head;



    }
}

