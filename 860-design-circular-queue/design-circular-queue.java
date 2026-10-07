class MyCircularQueue {
    int queue[];
    int front=0;
    int rear=0;
    int size=0;
    public MyCircularQueue(int k) {
        queue=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(size==queue.length){
            return false;
        }
        queue[rear]=value;
        rear++;
        if(rear>=queue.length){
            rear=rear%queue.length;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0){
            return false;
        }
        queue[front]=-1;
        size--;
        front++;
        if(front>=queue.length){
            front=front%queue.length;
        }
        return true;
    }
    
    public int Front() {
        if(size==0){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(size==0){
            return -1;
        }
        return queue[(rear - 1 + queue.length) % queue.length];
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==queue.length){
            return true;
        }
        return false;
    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */