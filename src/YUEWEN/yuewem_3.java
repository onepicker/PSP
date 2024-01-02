package YUEWEN;

import java.util.HashMap;

/**
 * @author Picker
 * @date 2022/4/8 18:49
 */
public class yuewem_3 {
      public class ListNode {
        int val;
      ListNode next = null;
       public ListNode(int val) {
          this.val = val;
        }
      }

    public ListNode middleNode (ListNode head) {
        // write code here
        if(head==null){
            return null;
        }
        HashMap<Integer,ListNode> map = new HashMap<>();
        ListNode dummp = new ListNode(0);
        dummp =head;
        int i = 0;
        while(dummp!=null){
            map.put(++i,dummp);
            dummp = dummp.next;
        }
        ListNode res = map.get(i/2+1);
        return res;
    }
}
