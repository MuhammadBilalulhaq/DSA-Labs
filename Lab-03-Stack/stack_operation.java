class stack_operation {

    int arr[] = new int[5];
    int top = -1;

    // Push Operation
    void push(int value) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop Operation
    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }

    // Peek Operation
    void peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }

    // Display Operation
    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {

            System.out.println("Stack Elements:");

            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        stack_operation s = new stack_operation();

        // Push 5 numbers
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        // Pop 2 numbers
        s.pop();
        s.pop();

        // Peek
        s.peek();

        // Display remaining elements
        s.display();
    }
}