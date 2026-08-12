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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        ListNode temp=head;
        int cnt=0;
        int k=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int first=0;
        int last=0;
        int x=0;
        ListNode prev=null;
        while(temp.next!=null){
            if(prev!=null){
                if((temp.val>temp.next.val && temp.val>prev.val)||(temp.val<temp.next.val && temp.val<prev.val)){
                    cnt++;
                    last=k;
                    if(first==0){
                        first=k;
                    }
                    if(x!=0){
                        min=Math.min(min,k-x);
                    }
                    x=k;
                }
            }
            k++;
            prev=temp;
            temp=temp.next;
        }
        if(cnt<2){
            return arr;
        }
        arr[0]=min;
        arr[1]=last-first;
        return arr;
    }
}