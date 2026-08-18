class Solution {
    public int digitFrequencyScore(int n) {
       //HashMap<Integer,Integer> map=new HashMap<>();
       int arr[]=new int[10];
       int m=n;
       int max=0;
       while(m>0){
        int rem=m%10;
        arr[rem]+=1;
        max=Math.max(max,rem);
        m/=10;
       } 
       int sum=0;
       for(int i=0;i<=max;i++){
        sum+=(i*arr[i]);
       }
       return sum;
    }
}