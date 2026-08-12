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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // for(int i=0;i<nums.length;i++){
        //     int t=nums[i];
        //     ListNode temp=head;
        //     ListNode prev=null;
        //     while(temp!=null){
        //             if(temp.val==t){
        //                 if(prev==null){
        //                     head=head.next;
        //                     temp=head;
        //                 }
        //                 else{
        //                     while(temp!=null && temp.val==t){
        //                         ListNode next=temp.next;
        //                         temp.next=null;
        //                         prev.next=next;
        //                         temp=prev;
        //                     }
        //                 }
        //             }
        //             else{
        //                 prev=temp;
        //                 temp=temp.next;
        //             } 
        //     }
        // }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp.val)){
                if(prev==null){
                    head=temp.next;
                }
                else{
                    prev.next=temp.next;
                }
            }
            else{
                prev=temp;
            }
                temp=temp.next;
        }
        return head;
    }
}