class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int target=nums.length/2;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int cnt=0;
        for(int x:map.keySet()){
            if(map.get(x)%2==1){
                return false;
            }
        }
        return true;
    }
}