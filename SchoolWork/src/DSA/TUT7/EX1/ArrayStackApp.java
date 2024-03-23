package DSA.TUT7.EX1;

public class ArrayStackApp {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        // Pushing elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Printing the stack
        System.out.println("Stack:");
        printStack(stack);

        // Copying stack to another stack
        ArrayStack copiedStack = new ArrayStack();
        copyStack(stack, copiedStack);

        // Printing the copied stack
        System.out.println("\nCopied Stack:");
        printStack(copiedStack);
    }

    public static void copyStack(ArrayStack src, ArrayStack des) {
        ArrayStack tempStack = new ArrayStack(src.size());
        while (!src.isEmpty()) {
            tempStack.push(src.pop());
        }
        while (!tempStack.isEmpty()) {
            String item = tempStack.pop();
            src.push(item);
            des.push(item);
        }
    }

    public static void printStack(ArrayStack s) {
        ArrayStack tempStack = new ArrayStack(s.size());
        copyStack(s,tempStack);
        while (!tempStack.isEmpty()) {
            String a =tempStack.pop();
            System.out.println(a);
        }
    }
}
