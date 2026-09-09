class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        char a='a';
        int p=(int)a;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int q=(int)(c)-p;
            arr[q]+=1;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int q=(int)(c)-p;
            if(arr[q]==1){
                return i;
            }
        }
        return -1;
    }
}