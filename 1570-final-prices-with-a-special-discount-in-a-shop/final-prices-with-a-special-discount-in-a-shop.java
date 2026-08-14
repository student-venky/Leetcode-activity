class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
       // int discounts[]=new int [prices.length];
        for(int i=prices.length-1;i>=0;i--){
            int n=prices[i];
            while(!st.isEmpty() && st.peek()>n){
                st.pop();
            }
            if(!st.isEmpty()){
                prices[i]-=st.peek();
            }
            st.push(n);
        }
        // for(int i=0;i<prices.length;i++){
        //     prices[i]-=discounts[i];
        // }
        return prices;
    }
}