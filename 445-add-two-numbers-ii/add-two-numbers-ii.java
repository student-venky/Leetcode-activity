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
        l1=reverse(l1);
        l2=reverse(l2);
        int carry=0;
        int sum=0;
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null || temp2!=null|| carry!=0){
            sum=0;
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
            sum+=carry;
            ListNode n=new ListNode(sum%10);
            prev.next=n;
            prev=n;
            carry=sum/10;
        }
        ListNode curr=dummy.next;
        return reverse(curr);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode t2=temp.next;
            temp.next=prev;
            prev=temp;
            temp=t2;
        }
        return prev;
    }
}