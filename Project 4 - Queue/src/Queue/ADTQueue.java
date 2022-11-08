/*
Programmer: David Koh
 */

package Queue;

public class ADTQueue {
    private Node head, tail;

    public ADTQueue() { head = null; tail = null; } // end default constructor

    public boolean isEmpty() { return head == null; } // end isEmpty

    public void enqueue(Object newItem) {
        if(isEmpty()) {
            // when queue is empty sets head and tail to the first node
            this.head = new Node(newItem, this.head);
            this.tail = this.head;

        }
        else {
            //sets newTail node after tail then set tail equal to the last node
            Node newTail = new Node(newItem);
            this.tail.setNext(newTail);
            this.tail = newTail;

        }
    } // end push

    public Object dequeue() {
        if (!isEmpty()) {
            // when there is only one node to remove
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
                return this.head;
            }
            // when there exists more than one node and the head node is to be removed
            else {
                this.head = this.head.getNext();
                return this.head;
            }
        }
        // pop was called but there is nothing in the queue
        else { System.out.println("Queue is empty. There is nothing to pop"); return ""; }
    } // end pop

    public void dequeueAll() { this.head = null; this.tail = null; } // end popAll

    public Object peek() {
        if (!isEmpty()) { return this.head.getItem(); }
        else { System.out.println("There is nothing to peek. Queue is empty."); return ""; } // end if
    } // end peek
}
