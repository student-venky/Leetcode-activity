class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]=new int[n];
        if(k>0){
            for(int i=0;i<n;i++){
                int j=i+1;
                int x=k;
                int sum=0;
                while(x>0){
                    sum+=code[j%n];
                    j++;
                    x--;
                }
                ans[i]=sum;
            }
        }
        else if(k<0){
            for(int i=0;i<n;i++){
                int j=i-1;
                int x=k;
                int sum=0;
                while(x<0){
                    if(j<0){
                        j+=n;
                    }
                    sum+=code[j];
                    j--;
                    x++;
                }
                ans[i]=sum;
            }
        }
        return ans;
    }
}