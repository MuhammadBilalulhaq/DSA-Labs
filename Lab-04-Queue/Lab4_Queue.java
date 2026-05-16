class Queue {
    int[] arr = new int[10];
    int front = 0;
    int rear = -1;

    // Enqueue
    void enqueue(int val) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            arr[rear] = val;
        }
    }

    // Dequeue
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(arr[front] + " removed");
            front++;
        }
    }

    // Display
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue Elements:");

            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Lab4_Queue {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();
    }
}