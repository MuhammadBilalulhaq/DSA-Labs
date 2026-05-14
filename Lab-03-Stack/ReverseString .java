class ReverseString {

    char stack[];
    int top;

    ReverseString(int size) {
        stack = new char[size];
        top = -1;
    }

    // Push character
    void push(char ch) {
        top++;
        stack[top] = ch;
    }

    // Pop character
    char pop() {
        char ch = stack[top];
        top--;
        return ch;
    }

    public static void main(String[] args) {

        String str = "HELLO";

        ReverseString rs = new ReverseString(str.length());

        // Push all characters
        for (int i = 0; i < str.length(); i++) {
            rs.push(str.charAt(i));
        }

        System.out.print("Reversed String: ");

        // Pop all characters
        while (rs.top != -1) {
            System.out.print(rs.pop());
        }
    }
}
