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
        List<Integer> l=new ArrayList<>();
        int k=1;
        int min=Integer.MAX_VALUE;
        int o=0;
        ListNode prev=null;
        while(temp.next!=null){
            if(prev!=null){
                if((temp.val>temp.next.val && temp.val>prev.val)||(temp.val<temp.next.val && temp.val<prev.val)){
                    l.add(k);
                    if(o!=0){
                        min=Math.min(min,k-o);
                    }
                    o=k;
                }
            }
            k++;
            prev=temp;
            temp=temp.next;
        }
        if(l.size()<2){
            return arr;
        }
        int size=l.size();
        arr[0]=min;
        arr[1]=l.get(size-1)-l.get(0);
        return arr;
    }
}