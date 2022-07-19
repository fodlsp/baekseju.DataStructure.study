package datastructure2;

public class QueueStack {

    Queue queue1 = new Queue();
    Queue queue2 = new Queue();

    public void push(int data) {

        if(queue1.isEmpty()){
            queue1.inqueue(data);
        } else {
            while (!queue1.isEmpty()){
                queue2.inqueue(queue1.dequeue());
            }
                queue1.inqueue(data);
                while(!queue2.isEmpty()) {
                    queue1.inqueue(queue2.dequeue());
                }
        }
    }

    public int push(){
        return queue1.dequeue();
    }
}
