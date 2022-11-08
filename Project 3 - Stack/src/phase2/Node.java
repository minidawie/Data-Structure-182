package phase2;
/**
 *
 * Programmer: Benjamin Riveira
 * Programmer: David Koh
 *
 */

public class Node {
    private Object item;
    private Node next;

    public Node() {
        item = 0;
        next = null;
    }
    public Node(Object newItem) {
        setItem(newItem);
        next = null;
    }
    public Node(Object newItem, Node newNext) {
        setItem(newItem);
        setNext(newNext);
    }
    public void setItem(Object newItem) {
        item = newItem;
    }
    public void setNext(Node newNext) {
        next = newNext;
    }
    public Object getItem() {
        return item;
    }
    public Node getNext() {
        return next;
    }
}
