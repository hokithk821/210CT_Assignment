/**
 * Write a description of class Queue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Queue{
    public void enqueue(Object item) throws QueueFullException;
    public Object dequeue() throws EmptyQueueException;
    public boolean full();
    public Object frount() throws EmptyQueueException;
    public boolean isEmpty();
    public int size();
}
