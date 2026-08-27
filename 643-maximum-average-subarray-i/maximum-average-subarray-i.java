// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int l=0;
//         int r=0;
//         int sum=0;
//         double ans = Double.NEGATIVE_INFINITY;
//         while(r<nums.length){
//             sum+=nums[r];
//             double avg=0;
//             if((r-l)+1==k){
//                 avg=(sum*1.0)/(k*1.0);
//                 ans=Math.max(avg,ans);
//             }
//             r++;
//             if(r>=k){
//                 sum-=nums[l];
//                 l++;
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;
        double max=0;
        int l=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[l++]+nums[i];
            max=Math.max(sum,max);
        }
        avg=(max)/k;
        return avg;
    }
}