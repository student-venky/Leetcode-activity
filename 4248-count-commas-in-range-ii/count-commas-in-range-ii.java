class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long count=0;
        if(n>=1000){
            count+=(Math.min(n,999999)-1000+1)*1;
        }
        if(n>=1000000){
            count+=(Math.min(n,999999999)-1000000+1)*2;
        }
        if(n>=1000000000){
            count+=(Math.min(n,999999999999l)-1000000000l+1)*3;
        }
        if(n>=1000000000000l){
            count+=(Math.min(n,999999999999999l)-1000000000000l+1)*4;
        }
        if(n>=1000000000000000l){
            count+=(Math.min(n,999999999999999999l)-1000000000000000l+1)*5;
        }
        return count;
    }
}