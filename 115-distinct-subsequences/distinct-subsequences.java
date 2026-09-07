class Solution {
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()]; 
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        int res=count(0,0,s,t,dp);
        return res;
    }
    public int count(int i,int j,String s,String t,int dp[][]){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int choose=0;
        if(s.charAt(i)==t.charAt(j)){
            choose=count(i+1,j+1,s,t,dp);
        }
        int skip=count(i+1,j,s,t,dp);
        dp[i][j]=choose+skip;
        return dp[i][j];
    }
}