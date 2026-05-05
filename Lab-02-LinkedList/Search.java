public class Search {

    public static int search(LinkedList ll, int val) {

        Node temp = ll.head;
        int idx = 0;

        while (temp != null) {
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }

        return -1;
    }
}