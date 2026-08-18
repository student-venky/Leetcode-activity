class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // int arr[]=new int[10];
        // for(int i=0;i<10;i++){
        //     arr[i]=i;
        // }
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        sum3(1,n,k,res,curr);
        return res;
    }
    public void sum3(int s,int n,int k,List<List<Integer>> res,List<Integer> curr){
        if(n<0){
            return;
        }
        if(curr.size()==k){
            if(n==0){
                res.add(new ArrayList<>(curr));
                return;
            }
        }
        for(int i=s;i<=9;i++){
            curr.add(i);
            sum3(i+1,n-i,k,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}