package DSA.TUT7.EX2;

public class SLLQueueApp {
    public static void main(String[] args) {
        SLLQueue queue = new SLLQueue();

        // Enqueueing elements
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(3);
        queue.enqueue(7);

        // Printing the queue
        System.out.println("Queue:");
        printQueue(queue);

        // Finding max and min
        System.out.println("Max element: " + findMax(queue));
        System.out.println("Min element: " + findMin(queue));
    }

    public static void printQueue(SLLQueue q) {
        QueueNode current = q.front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static int findMax(SLLQueue q) {
        if (q.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int max = Integer.MIN_VALUE;
        QueueNode current = q.front;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public static int findMin(SLLQueue q) {
        if (q.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int min = Integer.MAX_VALUE;
        QueueNode current = q.front;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }
}
