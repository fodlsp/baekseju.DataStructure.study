package datastructure;

public class Stack {

    private Node top; //처음노드

    public void push(int data) {
        Node newNode = new Node(data);

        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {

        if(isEmpty()){
            System.out.println("처음값이 없습니다.");
        }

        int k = top.getData();
        top = top.getNext();

        return k;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
