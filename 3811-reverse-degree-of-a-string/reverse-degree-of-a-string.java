class Solution {
    public int reverseDegree(String s) {
        char arr[]=s.toCharArray();
        char z='z';
        int num=((int)z)+1;
        int total=0;
        for(int i=0;i<s.length();i++){
            int pro=(num-(int)arr[i])*(i+1);
            total+=pro;
        }
        return total;
    }
}