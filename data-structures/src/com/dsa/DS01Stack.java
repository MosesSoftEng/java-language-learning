package com.dsa;

public class DS01Stack {
    public static void main(String args[]) {
        Stack stack = new Stack(5);

        stack.push(4);
        System.out.println(stack.peek());

        stack.push(3);
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

/**
 * DataStrucutures.Stack has a fixed size.
 * You can add element at the top of stack.
 * You can only remove the top element of stack.
 */
class Stack {
    //* Fields
    private int arr[]; // To store our elements
    private int top; // Pointer - To keep track of top element
    private int capacity; // Size of stack

    //* Constructor
    Stack(int size) {
        arr = new int[size];
        capacity = size;

        // Keep index of top-most element
        top = -1; // -1 to indicate stack is empty.
    }

    //* Methods

    /**
     * Add an element to the top of a stack
     *
     * @param i value of element to add
     */
    public void push(int i) {
        // Prevent Overflow, out of bounds error.
        if (isFull()) System.exit(1);

        // Increment top and add i to array.
        arr[++top] = i;
    }

    /**
     * Get the value of the top element
     *
     * @return value of element at top
     */
    public int peek() {
        // Prevent out of bounds error
        if (isEmpty()) System.exit(1);

        return arr[top];
    }

    /**
     * Remove an element from the top of a stack
     *
     * @return element removed
     */
    public int pop() {
        // Prevent out of bounds error
        if (isEmpty()) System.exit(1);

        // Decrement top and return element removed
        return arr[top--];
    }

    /**
     * Check if the stack is empty
     *
     * @return
     */
    private boolean isEmpty() {
        return top == -1;
    }

    /**
     * Check if the stack is full
     *
     * @return true if full, otherwise false
     */
    private boolean isFull() {
        return top == capacity - 1;
    }
}
