class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<numsDivide.length;i++){
            set.add(numsDivide[i]);
        }
        for(int x:map.keySet()){
            pq.add(x);
        }
        for(int x:set){
            l.add(x);
        }
        int numberofdeletions=0;
        while(!pq.isEmpty()){
            int ele=pq.poll();
            boolean b=true;
            if(b){
                for(int i:l){
                    if(i%ele!=0){
                        b=false;
                        numberofdeletions+=map.get(ele);
                        break;
                    }
                }
            }
            if(b){
                return numberofdeletions;
            }
        }
        return -1;
    }
}