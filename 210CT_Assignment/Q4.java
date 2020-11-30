/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4 {
    public static void main(String [ ] args) {
        LinkedList s = new LinkedList();
        System.out.println(s);
        s.addToTail(new Integer(42));
        System.out.println(s);
        s.addToTail(new Character('n'));
        System.out.println(s);
        s.addToTail(new String("hello"));
        System.out.println(s);
        s.addToHead(new String("apple"));
        System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println("removed: " + s.removeFromHead());
            System.out.println(s);
        }
    }
}