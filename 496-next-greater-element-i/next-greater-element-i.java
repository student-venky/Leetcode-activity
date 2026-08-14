class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        //int next[]=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            int s=nums2[i];
            while(!st.isEmpty() && st.peek()<=s){
                st.pop();
            }
            if(st.isEmpty()){
               // next[i]=-1;
               map.put(s,-1);
            }
            else{
                //next[i]=st.peek();
                map.put(s,st.peek());
            }
            st.push(s);
        }
        for(int i=0;i<nums1.length;i++){
            // for(int j=0;j<nums2.length;j++){
            //     if(nums1[i]==nums2[j]){
            //         nums1[i]=next[j];
            //         break;
            //     }
            nums1[i]=map.get(nums1[i]);
            //}
        }
        return nums1;
    }
}