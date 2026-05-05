public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        AddAtHead.add(ll, 10);
        AddAtHead.add(ll, 20);

        AddAtTail.add(ll, 30);
        AddAtTail.add(ll, 40);

        Display.print(ll);

        InsertAtIndex.insert(ll, 25, 2);
        Display.print(ll);

        DeleteAtHead.delete(ll);
        Display.print(ll);

        System.out.println(Search.search(ll, 30));
        System.out.println(GetElement.get(ll, 2));
    }
}