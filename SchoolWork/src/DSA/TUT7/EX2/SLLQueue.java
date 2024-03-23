package DSA.TUT7.EX2;

class SLLQueue {
    public QueueNode front, rear;

    public SLLQueue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int temp = front.data;
        front = front.next;
        if (front == rear) {
            front = rear = null;
        }
        return temp;
    }
}
