class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][][]=new int[n][m][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return maxPickup(0,0,m-1,grid,dp);
    }
    public int maxPickup(int i,int j1,int j2,int arr[][],int dp[][][]){
        if(j1<0 || j1==arr[i].length||j2<0||j2==arr[i].length){
            return -1;
        }
        if(i==arr.length-1){
            if(j1==j2){
                return arr[i][j1];
            }
            else{
                return arr[i][j1]+arr[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int maximum=0;
        for(int x=-1;x<=1;x++){
            for(int y=-1;y<=1;y++){
                if(j1==j2){
                    maximum=Math.max(maximum,arr[i][j1]+maxPickup(i+1,j1+x,j2+y,arr,dp));
                }
                else{
                    maximum=Math.max(maximum,arr[i][j1]+arr[i][j2]+maxPickup(i+1,j1+x,j2+y,arr,dp));

                }
            }
        }
        dp[i][j1][j2]=maximum;
        return dp[i][j1][j2];
    }
}