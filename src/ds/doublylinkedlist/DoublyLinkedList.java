package ds.doublylinkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode; // if empty, last will refer to the new Node being created
        } else{
            first.previous = newNode;
        }

        newNode.next = first; // the newNode's next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        } else{
            last.next = newNode; // assigning old last to newnode
            newNode.previous = last; // the old last will be the new node's previous
        }

        last = newNode; // the linkedList's last field should point to the new node
    }
    // assume non empty list
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ // Is only 1 item in the lsit
            last = null;
        } else{
            first.next.previous = null; // the list's first node will point to null
        }
        first = first.next; // Assigning the reference of the node following the old first node to the first field in the linked list object
        return temp; // return the deleted old first node
    }

    //assume non empty list
    public Node deleteLast(){

    }



}
