package datastructure;

public class StackQueue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void add(int data) {

        stack1.push(data);
    }

    public int remove() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("값이 없습니다.");
            return -1;
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

}
