class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
        int temp=num;
        int cnt=0;
        while(temp>0){
            int rem=temp%10;
            if(rem%2==1){
                odd.offer(rem);
            }
            else{
                even.offer(rem);
            }
            temp/=10;
            cnt+=1;
        }
        //StringBuilder sb=new StringBuilder();
        int n=cnt;
        int ans=0;
        for(int i=0;i<cnt;i++){
            int x=(int)Math.pow(10,n-1);
            int y=num/x;
            if(y%2==1){
                ans=ans*10+odd.poll();
            }
            else{
                //sb.append(even.poll());
                ans=ans*10+even.poll();
            }
            n-=1;
        }
        // String s=sb.toString();
        // int ans=Integer.parseInt(s);
        return ans;
    }
}