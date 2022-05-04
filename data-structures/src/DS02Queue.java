public class DS02Queue {
    public static void main(String args[]) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        System.out.println(queue.peek());

        queue.enqueue(2);
        queue.dequeue();

        System.out.println(queue.peek());

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        queue.dequeue();
        System.out.println(queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(100);
        System.out.println(queue.peek());

        queue.dequeue();

        queue.enqueue(200);
        System.out.println(queue.peek());
    }
}

/**
 * Queue has a fixed size.
 * You can only add element at the rear of Queue - Enqueue
 * You can only remove element at the front of Queue - Dequeue
 */
class Queue {
    //* Fields
    private int elements[]; // To store our elements
    private int front, rear; // To keep track of front and rear elements
    private int size; // Capacity of stack

    //* Constructor
    Queue(int size) {
        this.elements = new int[size];
        this.size = size;

        this.front = -1;
        this.rear = -1;
    }

    //* Methods
    /**
     * Add an element to the top of a stack
     *
     * @param i value of element to add
     */
    public void enqueue(int i) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }

        front = 0;
        elements[++rear] = i;
    }

    /**
     * Get the value of the front element in the queue
     *
     * @return value of element at top
     */
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return elements[front];
    }

    /**
     * Remove an element from the front of the queue
     */
    public void dequeue() {
        // Check queue is empty
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        // Check if we have reached end of queue
        if(front >= rear) {
            System.out.println("End of queue");
            front = rear = -1;
            return;
        }

        // Increment front
        front++;
    }

    /**
     * Check if the queue is empty
     *
     * @return
     */
    private boolean isEmpty() {
        return front == -1;
    }

    /**
     * Check if the queue is full
     *
     * @return true if full, otherwise false
     */
    private boolean isFull() {
        return front == 0 && rear == size - 1;
    }
}
