package leetcode;

/**
 * @author Picker
 * @date 2022/3/13 23:19
 */
/*
    双指针结局定位问题
    关键是返回值必须存在
    题中的 first 和 second必须存在
    second = null 时
    second .next是不存在的，会报空指针异常
 */
public class leetcode_19 {
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

}
