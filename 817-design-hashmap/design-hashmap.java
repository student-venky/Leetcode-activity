class MyHashMap {
     Node head;
     int size;
    public MyHashMap() {
        head=null;
        size=0;
    }
    
    public void put(int key, int value) {
        Node n=new Node(key,value);
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp!=null){
                if(temp.key==key){
                    temp.val=value;
                    return ;
                }
                temp=temp.next;
            }
            n.next=head;
            head=n;
        }
    }
    
    public int get(int key) {
        Node temp=head;
        while(temp!=null){
            if(temp.key==key){
                return temp.val;
            }
            temp=temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        if(head==null){
            return ;
        }
        if(head.key==key){
            head=head.next;
            return ;
        }
        Node prev=head;
        Node temp=head.next;
        while(temp!=null){
            if(temp.key==key){
                prev.next=temp.next;
                return ;
            }
            prev=temp;
            temp=temp.next;
        }
    }
}
class Node{
    int key;
    int val;
    Node  next;
    public Node(int k,int v){
        key=k;
        val=v;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */