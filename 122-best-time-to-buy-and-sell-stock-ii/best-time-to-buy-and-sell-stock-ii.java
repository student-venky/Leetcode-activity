class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,prices,dp);
    }
    public int func(int ind,int buy,int prices[],int dp[][]){
        if(ind==prices.length){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }
        int profit;
        if(buy==0){
            profit=Math.max(-prices[ind]+func(ind+1,1,prices,dp),func(ind+1,0,prices,dp));
        }
        else{
            profit=Math.max(prices[ind]+func(ind+1,0,prices,dp),func(ind+1,1,prices,dp));
        }
        dp[ind][buy]=profit;
        return dp[ind][buy];
    }
}