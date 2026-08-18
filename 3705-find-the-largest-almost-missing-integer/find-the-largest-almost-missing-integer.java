class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        for(int i=0;i<=n-k;i++){
            // for(int j=i;j<i+k;j++){
            //     map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            // }
            l=i;
            while(l<n && l-i<k){
                map.put(nums[l],map.getOrDefault(nums[l],0)+1);
                l++;
            }
        }
        if(k==1){
            int ans=-1;
            for(int i=0;i<n;i++){
                if(map.get(nums[i])==1 && nums[i]>ans){
                    ans=nums[i];
                }
            }
            return ans;
        }
        if(k==nums.length){
            int ans=-1;
            for(int i=0;i<n;i++){
                ans=Math.max(ans,nums[i]);
            }
            return ans;
        }
        int max=-1;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==1){
                max=Math.max(max,nums[i]);
            }
        }
        return max;
    }
}