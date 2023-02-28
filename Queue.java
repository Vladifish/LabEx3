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
}