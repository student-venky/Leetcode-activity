class Solution {
    public int digitFrequencyScore(int n) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int m=n;
       while(m>0){
        int rem=m%10;
        map.put(rem,map.getOrDefault(rem,0)+1);
        m/=10;
       } 
       int sum=0;
       for(Integer key:map.keySet()){
        sum+=(key*map.get(key));
       }
       return sum;
    }
}