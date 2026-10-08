/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int dig1=(l1!=null)?l1.val %10:0;
            int dig2=(l2!=null)?l2.val%10:0;
            int sum=dig1+dig2+carry;
            carry=sum/10;
            int dig=sum%10;
            res.next=new ListNode(dig);
            res=res.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
}