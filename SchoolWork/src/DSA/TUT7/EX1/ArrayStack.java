package DSA.TUT7.EX1;

public class ArrayStack {
    private static final int DEFAULT_CAPACITY = 100;
    private String[] stackArray;
    private int top; // index of the top element

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        stackArray = new String[capacity];
        top = -1; // stack is initially empty
    }

    public void push(String item) {
        if (top == stackArray.length - 1) {
            // Resize the array if it's full
            resize(2 * stackArray.length);
        }
        stackArray[++top] = item;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String item = stackArray[top];
        stackArray[top--] = null; // Avoid loitering
        // Shrink the array if it's mostly empty
        if (top > 0 && top == stackArray.length / 4) {
            resize(stackArray.length / 2);
        }
        return item;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void resize(int capacity) {
        String[] newArray = new String[capacity];
        for (int i = 0; i <= top; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }
}
