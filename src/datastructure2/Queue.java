package datastructure2;

public class Queue {

    private Node head;
    private Node tail;

    public void inqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("삭제할 노드가 없습니다.");
            return -1;
        } else if (head == tail) { //노드가 하나일 때 - head와 tail이 같은주소를 가르키고있다
            tail = null; //tail의 주소값은 있지만 가르키는 건 없다.
        }

        int k = head.data;
        Node nextNode = head.next;
        head.next = null;
        head = nextNode;

        return k;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
