class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int result;
        int m=n;
        while(m>0){
            int remainder=m%10;
            sum+=remainder;
            product*=remainder;
            m/=10;
        }
        result=sum+product;
        // boolean b=n%result==0?true:false;
        // // if(n%result==0){
        // //     return true;
        // // }
        return n%result==0?true:false;
    }
}