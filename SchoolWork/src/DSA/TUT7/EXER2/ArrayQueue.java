package DSA.TUT7.EXER2;

public class ArrayQueue {
    private int[] queueArray;
    private int front; // index of the front element
    private int rear; // index of the rear element
    private int size; // current size of the queue
    private int capacity; // maximum capacity of the queue

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity; // Circular increment
        queueArray[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queueArray[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray[front];
    }

    public int size() {
        return size;
    }
}
