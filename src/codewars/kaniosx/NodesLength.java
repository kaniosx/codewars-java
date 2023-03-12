package codewars.kaniosx;

class Node {
    public Node next;
}

public class NodesLength {

    static int length(Node head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}
