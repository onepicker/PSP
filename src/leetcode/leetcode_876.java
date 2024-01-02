package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Picker
 * @date 2022/3/13 23:10
 */
public class leetcode_876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode middleNode(ListNode head) {
        ListNode start = new ListNode(0);
        int flag = 0;
        start = head;
        List<ListNode> list = new LinkedList<>();
        while(start!=null){
            flag++;
            list.add(start);
            start=start.next;
        }

            return list.get(flag/2);




    }
}
