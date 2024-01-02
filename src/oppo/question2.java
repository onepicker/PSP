package oppo;

import java.util.Scanner;

/**
 * @author Picker
 * @date 2023/3/13 19:06
 */
public class question2 {

     public static class ListNode {
        int val;
       ListNode next = null;
        public ListNode(int val) {
          this.val = val;
        }
      }

    public static void main(String[] args) {
         ListNode node1= new ListNode(0);
         ListNode node2 = new ListNode(0);
         ListNode head1 = node1.next;
         ListNode op1 = head1;
         ListNode head2 = node2.next;
         ListNode op2 =head2;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            head1.val=input.nextInt();
            head1=head1.next;

        }
        for (int i = 0; i < 3; i++) {
            head2.val=input.nextInt();
            head2=head1.next;
        }
        ListNode res =  combineTwoDisorderNodeToOrder(op1,op2);
        while(res!=null){
            System.out.print(res.val);
            res=res.next;
        }

    }
    public static ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ListNode head1=Merge_sort(node1);
        ListNode head2=Merge_sort(node2);
        return MergeList(head1,head2);
    }
    public static ListNode Merge_sort(ListNode head){
         if(head==null||head.next==null){
             return head;
         }
         ListNode fast = head;
         ListNode slow = head;
         while ((fast.next!=null&&fast.next.next!=null)){
             fast = fast.next.next;
             slow = slow.next;
         }
         fast = slow.next;
         slow.next=null;
         ListNode head1 = Insert_sort(fast);
         ListNode head2 = Insert_sort(slow);
         return MergeList(head1,head2);
    }
    public static ListNode Insert_sort(ListNode head){
         if(head==null&&head.next==null){
             return head;
         }
         ListNode fake = new ListNode(0);
         ListNode flag1 =  head;
         while(flag1!=null){
             ListNode flag2 =flag1;
             ListNode flag3 = fake;
             flag1=flag1.next;
             while(flag3.next!=null&&flag2.val> flag3.val){
                 flag3=flag3.next;
             }
             flag2.next=flag3.next;
             flag3.next=flag2;
         }
         return fake.next;
    }
    public static ListNode MergeList(ListNode head1, ListNode head2){
         ListNode dum = new ListNode(0);
         ListNode temp = dum;
         while(head1!=null&&head2!=null){
             if(head1.val<head2.val){
                 temp.next=head1;
                 head1 = head1.next;
             }
             if(head1.val>= head2.val)
             {
                 temp.next=head2;
                 head2 = head2.next;
             }
             temp = temp.next;
         }
         if(head1!=null){
             temp.next=head1;
         }
         if (head2!=null){
             temp.next=head2;
         }
         return dum.next;
    }


}
