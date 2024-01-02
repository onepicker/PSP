package leetcode;

/**
 * @author Picker
 * @date 2022/4/1 13:24
 */
//合并有序链表
public class leetcode_21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


//迭代
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
//        ListNode listNode = new ListNode(0);
//        while(list1!=null&&list2!=null){
//            if(list1.val>= list2.val){
//                listNode= list2;
//                list2 = list2.next;
//            }
//            else {
//                listNode = list1;
//                list1 = list1.next;
//            }
//            listNode =listNode.next;
//
//        }
//        if(list1!=null){
//            listNode=list1;
//        }
//        if(list2!=null){
//            listNode=list2;
//        }
//        return listNode;
//    }

//    递归：
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val>=l2.val){
            l2.next =mergeTwoLists(l1,l2.next);
            return l2;
        }
        else {
            l1.next=mergeTwoLists(l1.next,l2);
            return  l1;
        }
    }



}
