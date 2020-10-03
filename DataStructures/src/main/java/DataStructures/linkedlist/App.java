package DataStructures.linkedlist;

public class App {
    public static void main(String[] args) {

//        --- linked list ---
        LinkedList list1 = new LinkedList();

//        --- insert at head of list ---
        list1.insert(5);
        list1.insert(6);
        list1.insert(7);

//        --- output ---
        System.out.println("List 1: ");
        System.out.println(list1);
        System.out.println();

        System.out.println("Head: ");
        System.out.println(list1.head.value);
    }
}
