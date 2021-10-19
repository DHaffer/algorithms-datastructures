package ds.queue;

public class Queue {

    private int maxSize; // initialize the set number of slots
    private long[] queueArray; // slots to maintain the data
    private int front; // the index position for the element in the front
    private int rear; // the index position for the element in the back
    private int nItems; // counter to maintain the number of items in our queue

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0; // index position of the first slot in the array;
        rear = -1; // there is no item in the array yet to be considered as the last item
        nItems = 0; // no elements in the array yet
    }

    public void insert(long j){
        if(rear == maxSize -1){ // Creates a circular queue
            rear = -1;
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long remove(){   // removes item from the front of the queue
        long temp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0; // Can set front back to the 0th index so that we can utilize the entire array again
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view() {
        System.out.println("[ ");
        for(int i = 0; i < queueArray.length; i++){
            System.out.println(queueArray[i]+ " ");
        }
        System.out.println("]");
    }

}
