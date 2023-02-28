// I have a feeling we'll make our own modulo operation
public class Queue<Type> {
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

    public int enqueue(int el) {
        if (isFull())
            return -999;
        rear = (rear + 1) % maxQueueSize;
        que[rear] = el;
        if (front == -1)
            front = 0;
        return 1;
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