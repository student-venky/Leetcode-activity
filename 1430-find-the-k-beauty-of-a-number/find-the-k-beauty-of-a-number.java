class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=num+"";
        int cnt=0;
       for(int i=0;i<s.length()-k+1;i++){
        int div=Integer.parseInt(s.substring(i,i+k));
        if( div!=0 && num%div==0){
            cnt+=1;
        }
       }
       return cnt; 
    }
}