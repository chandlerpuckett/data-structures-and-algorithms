package datastructures.linkedlist;

public class App {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(6);
        l1.insert(7);

        LinkedList l2 = new LinkedList();
        l2.insert(12);
        l2.insert(21);
        l2.insert(35);

        System.out.println(l1.toString());
        System.out.println(l2.toString());

        LinkedList zip = new LinkedList().merge(l1,l2);

        System.out.println(zip.toString());
    }
}
