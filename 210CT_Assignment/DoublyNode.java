public class DoublyNode {
    public Object data;
    public DoublyNode previous;
    public DoublyNode next;

    public DoublyNode(Object data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public DoublyNode(Object data, DoublyNode previous, DoublyNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

}