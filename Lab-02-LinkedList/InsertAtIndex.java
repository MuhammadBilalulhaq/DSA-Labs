public class InsertAtIndex {

    public static void insert(LinkedList ll, int val, int idx) {

        if (idx < 0 || idx > ll.size) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            AddAtHead.add(ll, val);
            return;
        }

        if (idx == ll.size) {
            AddAtTail.add(ll, val);
            return;
        }

        Node temp = ll.head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;

        ll.size++;
    }
}
