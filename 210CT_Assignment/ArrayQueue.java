/**
 * Write a description of class ArrayQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayQueue implements Queue{
    private Object[] array;
    private int front;
    private int rear;             // point to the first empty cell
    private int capacity;

    public ArrayQueue(){
        this.capacity = 10;
        array = new Object[capacity];
        rear = 0;
        front = 0;
    }

    
        public ArrayQueue(int number){
        this.capacity = number;
        array = new Object[capacity];
        rear = 0;
        front = 0;
    }
    
    public boolean  full(){
        if(size()+1 == capacity){
            return true;
        }else {
            return false;
        }
    }

    public void enqueue(Object item) throws QueueFullException{

        if(size()+1 == capacity){
            throw new QueueFullException();
        }
        array[rear] = item;
        rear = (rear + 1) % capacity;
        // rear = rear + 1;
        // if(rear == capacity)
        // rear = 0;
    }

    public Object dequeue() throws EmptyQueueException{
        Object item = array[front];
        array[front] = null;
        front = front + 1;
        return item;
    }

    public Object frount() throws EmptyQueueException{
        return array[front];   
    }

    public boolean isEmpty(){
        return front == rear;   
    }

    public int size(){
        int size;
        if (rear >  front){
            size = rear - front;
        }else {
            size = capacity - front + rear;
        }
        return size;
    }
    
    public String toString(){
        String output = "";
        for(int i = 0; i < capacity; i++){
            if(array[i]!= null )
                output += array[i] + " ";
        }
        return output;
    }
}