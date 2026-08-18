class RecentCounter {
Queue<Integer> q;
    public RecentCounter() {
        this.q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        int tnegative=t-3000;
        while(q.peek()<tnegative){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */