class BrowserHistory {
    Node head;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
    }

    public void visit(String url) {
        Node n = new Node(url);

        head.next = n;
        n.prev = head;
        head = n;
    }
    public String back(int steps) {
        for (int i = 0; i < steps && head.prev != null; i++) {
            head = head.prev;
        }
        return head.data;
    }
    public String forward(int steps) {
        for (int i = 0; i < steps && head.next != null; i++) {
            head = head.next;
        }
        return head.data;
    }
}

class Node {
    String data;
    Node prev;
    Node next;

    public Node(String data) {
        this.data = data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */