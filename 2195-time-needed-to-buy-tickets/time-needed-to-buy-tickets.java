class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int i=0;
        int cnt=0;
        while(tickets[k]!=0){
            i=i%n;
            if(tickets[i]>0){
                tickets[i]=tickets[i]-1;
                cnt++;
            }
            i++; 
        }
        return cnt;
    }
}