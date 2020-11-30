
/**
 * Write a description of class EmptyQueueException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmptyQueueException extends Exception{
    public EmptyQueueException(){
        super("Queue is Empty");
    }
}
