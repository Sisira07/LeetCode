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
    public int len(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null|| head.next==null) return head;
        int len=len(head);
        int trav=len/k;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        ListNode grpStart=head;
        ListNode prevGrpt=null;
        int cnt=0;


        while(trav!=0){
            prev=null;
            grpStart=curr;
            cnt=0;
            while(cnt<k){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                cnt++;
            }
            if(trav==len/k) head=prev;
            else{
                prevGrpt.next=prev;
            }
            grpStart.next=curr;
            prevGrpt=grpStart;
            trav--;
        }
        return head;
    }
}