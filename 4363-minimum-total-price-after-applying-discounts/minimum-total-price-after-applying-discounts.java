class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double arr[]=new double[prices.length];
        for(int i=0;i<prices.length;i++){
            arr[i]=prices[i]*1.0;
        }
        int i=prices.length-1;
        int j=discounts.length-1;
        double sum=0;
        while(i>=0 && j>=0){
            double p=arr[i];
            double q=(100-(discounts[j]*1.0))/100;
            arr[i]=p*q;
            sum+=arr[i];
            i--;
            j--;
        }
      //  i++;
        while(i>=0){
            sum+=arr[i];
            i--;
        }
        return sum;
    }
}