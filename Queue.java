public class Queue<T> {
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
}