class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=0;
        int sum=0;
        double ans = Double.NEGATIVE_INFINITY;
        while(r<nums.length){
            sum+=nums[r];
            double avg=0;
            if((r-l)+1==k){
                avg=(sum*1.0)/(k*1.0);
                ans=Math.max(avg,ans);
            }
            r++;
            if(r>=k){
                sum-=nums[l];
                l++;
            }
        }
        return ans;
    }
}