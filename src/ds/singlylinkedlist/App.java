package ds.singlylinkedlist;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(77);
        myList.insertFirst(64);
        myList.insertFirst(65);
        myList.insertLast(99999);

        myList.displayList();
    }
}
