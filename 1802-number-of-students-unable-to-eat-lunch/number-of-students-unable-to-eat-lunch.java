class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int j=0;
        int count=0;
        while(!q.isEmpty() && count<q.size()){
            int n=q.peek();
            if(n==sandwiches[j]){
                q.poll();
                count=0;
                j++;
            }
            else{
                q.poll();
                q.add(n);
                count++;
            }
        }
        return q.size();
    }
}