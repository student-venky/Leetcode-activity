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
    public ListNode doubleIt(ListNode head) {
        ListNode dummy=reverse(head);
        ListNode newNode=new ListNode(-1);
        ListNode newtemp=newNode;
        ListNode temp=dummy;
        int carry=0;
        while(temp!=null || carry!=0){
            int sum=carry;
            if(temp!=null){
                sum=carry+temp.val*2;
                temp=temp.next;
            }
            carry=sum/10;
            ListNode nine=new ListNode(sum%10);
            newtemp.next=nine;
            newtemp=nine;
        }
        ListNode result=newNode.next;
        return reverse(result);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}