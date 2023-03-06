// I have a feeling we'll make our own modulo operation
public class Queue <Type> {
    private int maxQueueSize = 100;
    private int front = -1, rear = -1;
    private Object[] que;

    public Queue() {
        que = new Object[maxQueueSize];
    }

    public Queue(int n) {
        if (n > 0)
            maxQueueSize = n;
        que = new Object[maxQueueSize];
    }

    public void clear() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        return ((rear + 1) % maxQueueSize == 0);
    }



    public <T> void enqueue(T el) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            this.front = 0;
        }
        this.rear = (this.rear + 1) % maxQueueSize;
        this.que[rear] = el;
    }

    public Type dequeue() {
        if (isEmpty())
            return null;
        Type el = (Type) que[front];
        if (front == rear)
            clear();
        else
            front = (front + 1) % maxQueueSize;
        return el;
    }

    public Type peek() {
        if (isEmpty())
            return null;
        else
            return (Type) que[front];
    }

}