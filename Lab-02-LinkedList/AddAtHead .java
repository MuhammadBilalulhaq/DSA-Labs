public class AddAtHead {

    public static void add(LinkedList ll, int val) {
        Node temp = new Node(val);

        if (ll.head == null) {
            ll.head = ll.tail = temp;
        } else {
            temp.next = ll.head;
            ll.head = temp;
        }
        ll.size++;
    }
}