public class AddAtTail {

    public static void add(LinkedList ll, int val) {
        Node temp = new Node(val);

        if (ll.head == null) {
            ll.head = ll.tail = temp;
        } else {
            ll.tail.next = temp;
            ll.tail = temp;
        }
        ll.size++;
    }
}