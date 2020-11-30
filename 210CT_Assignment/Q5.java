

/**
 * Write a description of class t here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5 {
    public static void main(String [] args) {
        try{
            Queue queue = new ArrayQueue();
            queue.enqueue("Alex");
            queue.enqueue("Sandy");
            queue.enqueue("Betty");
            System.out.println(queue);
            System.out.println("Removed: " + queue.dequeue());
            System.out.println(queue);
            System.out.println("Removed: " + queue.dequeue());
            System.out.println(queue);
            System.out.println("Removed: " + queue.dequeue());
            System.out.println(queue);
        }catch(QueueFullException e){
            
        }catch(EmptyQueueException e){
        }
    }
}
