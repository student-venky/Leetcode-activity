class Solution {
    int count=0;
    public int totalNumbers(int[] digits) {
        List<Integer> l=new ArrayList<>();
        boolean b[]=new boolean [digits.length];
        countPossibilities(0,0,digits,l,b);
        return count;
    }
    public void countPossibilities(int s,int num,int digits[],List<Integer> l,boolean b[]){
        
        if( s==3 ){
            if(num%2==0 && !l.contains(num)){
                count+=1;
                l.add(num);
            }
            return ;
        }
        int prev=num;
        for(int i=0;i<digits.length;i++){
            if(b[i] ){
                continue;
            }
            if(s==0 &&  digits[i]==0)
                continue;
            b[i]=true;
            num=num*10+digits[i];
            countPossibilities(s+1,num,digits,l,b);
            b[i]=false;
            num=prev;
        }
    }
}