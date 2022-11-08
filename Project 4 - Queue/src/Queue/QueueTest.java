/*
Programmer: David Koh
 */

package Queue;

public class QueueTest {
    public static void main(String[] args) {

        // creates empty queue
        ADTQueue myList = new ADTQueue();

        // should return true
        System.out.println("Test 1");
        System.out.println("Is the list empty? " + myList.isEmpty());

        // should print apple
        System.out.println("Test 2");
        myList.enqueue("apple");
        System.out.println("The front of the queue is " + myList.peek());

        // should print apple
        System.out.println("Test 3");
        myList.enqueue("pencil");
        System.out.println("The front of the queue is " + myList.peek());

        // should print pencil
        System.out.println("Test 4");
        myList.dequeue();
        System.out.println("The front of the queue is " + myList.peek());

        // should return "Queue is empty. There is nothing to pop"
        System.out.println("Test 5");
        myList.dequeue();
        myList.dequeue();

        // should print david
        System.out.println("Test 6");
        myList.enqueue("david");
        myList.enqueue("eric");
        myList.enqueue("william");
        myList.enqueue("ian");
        myList.enqueue("sam");
        myList.enqueue("casey");
        myList.enqueue("brent");
        System.out.println("The front of the queue is " + myList.peek());

        // should return false
        System.out.println("Test 7");
        System.out.println("Is the list empty? " + myList.isEmpty());

        // should return true
        System.out.println("Test 8");
        myList.dequeueAll();
        System.out.println("Is the list empty? " + myList.isEmpty());

        // should return "There is nothing to peek. Queue is empty."
        System.out.println("Test 9");
        myList.peek();

    }
}
