package adtmylist;

/*
*Programmer: David Koh
 */

public class ADTMyList {
    private Node head, tail;
    private int size;

    public ADTMyList() {
        // null argument constructor
        head = null;
        size = 0;
    }

    //  all the items in the array to a linked-list
    public ADTMyList(String[] listItems) {
        for (int i = 0; i < listItems.length; i++) {
            this.add(i, listItems[i]);
            /* sets head to tail if there is only one node */
            if (i==0) {
                tail = head;
            }
        }
    }


    public void add(int index, String newItem) {
        //adds to the head of the list
        if(index == 0){
            // If there is nothing in the linked list yet
            if(size == 0){
                Node newHead = new Node(newItem);
                // Set head and tail to be the node we just added
                this.head = newHead; this.tail = newHead;
            }
            // else if size is greater than 1
            else{
                Node newHead = new Node(newItem);
                /* linking newHead in front of the head node */
                newHead.setNext(this.head);
                /* setting the head node the first-most node */
                this.head = newHead;
            }
        }
        // Adding to the tail of the list
        else if (index > 0 && index == size){
            Node newTail = new Node(newItem);
            this.tail.setNext(newTail);
            this.tail = newTail;
        }
        // Adding anywhere else in the list
        else if(index > 0 && index < size){
            Node current = this.head;
            /* loop stops one before the desired spot */
            for(int i = 0; i < index - 1; i++){
                current = current.getNext();
            }
            Node newNode = new Node(newItem);
            /* setting node next to the desired spot */
            Node next = current.getNext();
            /* links the three nodes with newNode at the center */
            current.setNext(newNode);
            newNode.setNext(next);
        }
        // Else out of bounds
        else{
            System.out.println(index + " is an invalid index number for the item " + newItem);
            return;
        }
        size++;
    }

    public void remove(int index){
        // If the size is 0
        if(size == 0){
            // Nothing to remove
            return;
        }
        // Removing the head
        if(index == 0){
            // If the size is 1
            if(size == 1){
                /* bc there is only one node we can just set head and tail to null */
                this.head = null;
                this.tail = null;
            }
            else {
                /* links the node to the node after the head node */
                Node newHead = this.head.getNext();
                /* deletes head */
                this.head = null;
                /* set head to the node that we linked to above */
                this.head = newHead;
            }
        }
        // In all other cases, traverse through the list to find the node to remove
        else{

            Node current = this.head;
            /* since we are comparing to index-1 the loop will stop at the node before the desired spot */
            for(int i = 0; i < index - 1; i++){
                current = current.getNext();
            }
            /* since current is at the node before the desired node we set nodeToRemove to the node next to current */
            Node nodeToRemove = current.getNext();
            // If we are removing the tail
            if(nodeToRemove == this.tail){
                current.setNext(null);
                this.tail = current;
            }
            // else
            else{
                /* linking current to the node 2 ahead */
                current.setNext(nodeToRemove.getNext());
                /* deleting the node in between current and current.getNext */
                nodeToRemove = null;
            }
        }
        /* decrease the size by one */
        size--;
    }

    public String get(int index){
        if(index >= 0 && index < size) {
            Node current = this.head;
            // traverse through list until we get to desired node
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getItem();
        }
        // else return an empty string
        else{ return ""; }
    }

    //checks if list is empty
    public boolean isEmpty(){
        if (size == 0) { return true; }
        else{ return false; }
    }

    // retrieves the size of the list
    public int size() { return size; }

    // removes the whole list
    public void removeAll(){ head = null; size = 0; }

    // prints out the whole list
    public String toString(){
        /* in the case of an empty list set result to an empty string */
        String result = "";
        Node current = this.head;
        int i =0;
        /* concatenates the list to result */
        while(current != null) {
            result += String.valueOf(i) + " " + current.getItem() + "\n";
            current = current.getNext();
            i++;
        }
        return result;
    }

}

