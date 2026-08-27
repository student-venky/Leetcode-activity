class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int total=0;
        Arrays.sort(people);
            int l=0;
            int r=people.length-1;
            while(l<=r){
                int sum=people[l]+people[r];
                if(sum<=limit){
                    l++;
                }
                r--;
                total+=1;
            }
        return total;
    }
}