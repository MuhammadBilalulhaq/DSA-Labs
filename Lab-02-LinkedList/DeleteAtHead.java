public class DeleteAtHead {

    public static void delete(LinkedList ll) {

        if (ll.head == null) {
            System.out.println("List is empty");
            return;
        }

        ll.head = ll.head.next;
        ll.size--;

        if (ll.head == null) {
            ll.tail = null;
        }
    }
}
