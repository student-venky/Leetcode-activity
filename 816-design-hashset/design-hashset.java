class MyHashSet {
    Node head;
    Node tail;
    public MyHashSet() {
        this.head=null;
        this.tail=null;
    }
    
    public void add(int key) {
        Node n=new Node(key);
        if(head==null){
            head=tail=n;
        }
        else{
            Node temp=head;
            while(temp!=null){
                if(temp.data==key){
                    return ;
                }
                temp=temp.next;
            }
            tail.next=n;
            tail=n;
        }
    }
    
    public void remove(int key) {
        if(head==null){
            return ;
        }
        if(head.data==key){
            head=head.next;
            if(head==null){
                tail=null;
            }
            return ;
        }
        Node temp=head.next;
        Node prev=head;
        while(temp!=null){
            if(temp.data==key){
                prev.next=temp.next;
                if(temp==tail){
                    tail=prev;
                }
                return ;
            }
            prev=temp;
            temp=temp.next;
        }
    }
    
    public boolean contains(int key) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */