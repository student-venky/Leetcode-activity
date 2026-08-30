class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minInd=0;
        int maxInd=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                minInd=i;
            }
            if(max<nums[i]){
                max=nums[i];
                maxInd=i;
            }
        }
         int left = Math.max(minInd, maxInd) + 1;

        int right = nums.length - Math.min(minInd, maxInd);

        int bothSides = Math.min(minInd, maxInd) + 1
                      + nums.length - Math.max(minInd, maxInd);

        return Math.min(left, Math.min(right, bothSides));
    }
}