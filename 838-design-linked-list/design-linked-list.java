class MyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    //List<Integer> l=new ArrayList<>();
    public MyLinkedList() {
        this.head = head;
        this.tail = tail;
    }

    public int get(int index) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (i == index) {
                return temp.data;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = tail = n;
            size++;
            return;
        }
        n.next = head;
        head = n;
        size++;
    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = tail = n;
            size++;
            return;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node n = new Node(val);

        int i = 0;
        Node temp = head;

        while (temp != null) {
            if (i == index - 1) {
                n.next = temp.next;
                temp.next = n;
                size++;
                return;
            }

            i++;
            temp = temp.next;
        }
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        Node temp = head;

        if (index == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

            return;
        }

        int i = 0;
        Node prev = null;

        while (temp != null) {
            if (i == index) {
                prev.next = temp.next;

                if (temp == tail) {
                    tail = prev;
                }

                size--;
                return;
            }

            i++;
            prev = temp;
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    // Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */