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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            while(!st.isEmpty() && st.peek()<temp.val){
                st.pop();
            }
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode root=new ListNode(st.pop());
        ListNode prev=root;
        while(!st.isEmpty()){
            ListNode n=new ListNode(st.pop());
            prev.next=n;
            prev=n;
        }
        return reverse(root);
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