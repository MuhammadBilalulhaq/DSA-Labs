public class DeleteAtIndex {

    public static void delete(LinkedList ll, int idx) {

        if (idx < 0 || idx >= ll.size) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            DeleteAtHead.delete(ll);
            return;
        }

        Node temp = ll.head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (idx == ll.size - 1) {
            ll.tail = temp;
        }

        ll.size--;
    }
}