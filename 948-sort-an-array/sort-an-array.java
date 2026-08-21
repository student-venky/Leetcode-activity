class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            heapifydown(i,nums,nums.length);
        }

        int l=nums.length-1;
        while(l>0){
            int temp=nums[l];
            nums[l]=nums[0];
            nums[0]=temp;
            heapifydown(0,nums,l);
            l--;
        }

        return nums;
    }
    public void heapifyup(int i,int nums[]){
        int ind=(i-1)/2;
        if(ind>=0 && nums[ind]>nums[i]){
            int temp=nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
            heapifyup(ind,nums);
        }
    }
    public void heapifydown(int i,int nums[],int size){
        int min_ind=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && nums[left]>nums[min_ind]){
            min_ind=left;
        }
        if(right<size && nums[right]>nums[min_ind]){
            min_ind=right;
        }
        if(min_ind!=i){
            int temp=nums[min_ind];
            nums[min_ind]=nums[i];
            nums[i]=temp;
            heapifydown(min_ind,nums,size);
        }
    }
}