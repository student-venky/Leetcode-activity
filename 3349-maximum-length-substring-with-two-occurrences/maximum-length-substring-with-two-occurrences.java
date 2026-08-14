class Solution {
    public int maximumLengthSubstring(String s) {
       int arr[]=new int[27];
       int l=0;
       int max=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int a=(int)(c-'a');
        arr[a]+=1;
        while(arr[a]>2){
            char d=s.charAt(l);
            int b=(int)(d-'a');
            arr[b]-=1;
            l++;
        }
        max=Math.max(i-l+1,max);
       }
       return max;  
    }
}