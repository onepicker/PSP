package leetcode;

import java.util.List;

/**
 * @author Picker
 * @date 2022/4/1 13:11
 */
//反转链表

public class leetcode_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //递归方法
//    public ListNode reverseList(ListNode head) {
//       if(head==null||head.next==null){
//           return head;
//       }
//       ListNode newlistnode = reverseList(head.next);
//       head.next.next = head;
//       head.next = null;
//       return  newlistnode;
//    }
    //迭代方法
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }
}
