class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int m=n;
        while(m>0){
            int rem=m%10;
            rev=rev*10+rem;
            m/=10;
        }
        return Math.abs(n-rev);
    }
}