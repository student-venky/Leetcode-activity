class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minarray[]=new int[nums.length];
        int j=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(j>=0){
            min=Math.min(min,nums[j]);
            minarray[j]=min;
            j--;
        }
        int max=Integer.MIN_VALUE;
        for(int m=0;m<nums.length;m++){
            max=Math.max(nums[m],max);
            if(max-minarray[m]<=k){
                return m;
            }
        }
        return -1;
    }
}