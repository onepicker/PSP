//package leetcode;
//
///**
// * @author Picker
// * @date 2022/2/28 23:18
// */
//public class leetcode_92 {
//
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//        public ListNode reverseBetween(ListNode head, int left, int right) {
//            ListNode dummyHead = new ListNode(0);
//            dummyHead.next = head;
//            List p = dummyHead;
//            List q = dummyHead.next;
//
//            p.next =q;
//
//            for(int i=0; i<left-1; i++){
//                p=p.next;
//                q=q.next;
//            }
//
//            for(int j=0; j<(right-left); j++){
//
//                List removed = p.next;
//                p.next=p.next.next;
//
//                removed.next=q.next;
//                q.next=removed;
//
//
//
//            }
//            return dummyHead.next;
//
//
//
//        }
//
//}
