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
        head=reverse(head);
        ListNode root=new ListNode(-1);
        ListNode prev=root;
        ListNode temp=head;
        int carry=0;
        while(temp!=null||carry!=0){
            int sum=0;
            if(temp!=null){
                sum=temp.val*2;
                temp=temp.next;
            }
            sum+=carry;
            ListNode n=new ListNode(sum%10);
            prev.next=n;
            prev=n;
            carry=sum/10;
        }
        return reverse(root.next);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}