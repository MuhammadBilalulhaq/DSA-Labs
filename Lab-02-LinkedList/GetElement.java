public class GetElement {

    public static int get(LinkedList ll, int idx) {

        if (idx < 0 || idx >= ll.size) {
            System.out.println("Invalid index");
            return -1;
        }

        Node temp = ll.head;

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.val;
    }
}