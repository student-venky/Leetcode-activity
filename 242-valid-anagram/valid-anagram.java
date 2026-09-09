class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character ,Integer> h=new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        // int i=0;
        // while(i<n){
        //     if(h.containsKey(s.charAt(i))){
        //         h.put(s.charAt(i),h.get(s.charAt(i))+1);
        //     }
        //     else{
        //         h.put(s.charAt(i),1);
        //     }
        //     i++;
        // }
        // int j=0;
        // while(j<n){
        //     if(h.containsKey(t.charAt(j)) && h.get(t.charAt(j))!=0){
        //         h.put(t.charAt(j),h.get(t.charAt(j))-1);
        //         j++;

        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return j==n;
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s.length();i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}