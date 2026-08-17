class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                int l=i;

                int r=i;
                    while(r+1<n && (nums[r+1]<=threshold && nums[r]%2 != nums[r+1]%2 )){
                        r++;
                    }
                    max=Math.max(max,r-l+1);
            }
        }
        return max;
    }
}