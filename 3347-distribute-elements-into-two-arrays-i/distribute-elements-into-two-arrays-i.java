class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[l]>arr2[r]){
                l+=1;
                arr1[l]=nums[i];
            }
            else{
                r+=1;
                arr2[r]=nums[i];
            }
        }
        int result[]=new int[n];
        int k=0;
        for(int i=0;i<n && arr1[i]!=0;i++){
            result[k++]=arr1[i];
        }
        for(int i=0;i<n && arr2[i]!=0;i++){
            result[k++]=arr2[i];
        }
        return result;
    }
}