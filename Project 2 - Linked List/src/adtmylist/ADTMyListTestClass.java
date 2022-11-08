package adtmylist;

/*
Programmer: David Koh
 */

public class ADTMyListTestClass {
    public static void main(String[] args) {
        /* Test #1
         * Create a new ADTMyList object using the no-arg constructor.
         * This creates an empty ADTMyList object.
         */
        System.out.println("Test #1");
        ADTMyList groceryList1 = new ADTMyList();
        System.out.println("Empty list created");
        System.out.println();
        System.out.println("*************************************************");

        /* Test #2
         * Test the add(index, item) method by adding six items,
         * milk, eggs, butter, apples, bread, chicken.
         * milk is at the head of groceryList1.
         */
        System.out.println("Test #2");
        groceryList1.add(0, "milk");
        groceryList1.add(1, "eggs");
        groceryList1.add(2, "butter");
        groceryList1.add(3, "apples");
        groceryList1.add(4, "bread");
        groceryList1.add(5, "chicken");
        System.out.println("*************************************************");

        /* Test #3
         * Test the toString() method.
         * toString() should return a String containing the six items and
         * and their index numbers:
         * 0 milk
         * 1 eggs
         * 2 butter
         * 3 apples
         * 4 bread
         * 5 chicken
         */
        System.out.println("Test #3");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #4
         * Test the remove() method.
         * remove(0) should remove the item at the head of groceryList1,
         * milk.  After removal, groceryList1 contains:
         * 0 eggs
         * 1 butter
         * 2 apples
         * 3 bread
         * 4 chicken
         */
        System.out.println("Test #4");
        System.out.println("remove(0)");
        groceryList1.remove(0);
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #5
         * Test the remove() method again.
         * remove(3) should remove the item in index 3 of groceryList1,
         * bread.  After removal, the groceryList1 contains:
         * 0 eggs
         * 1 butter
         * 2 apples
         * 3 chicken
         */
        System.out.println("Test #5");
        System.out.println("remove(3)");
        groceryList1.remove(3);
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #6
         * Test the remove() method again.
         * remove(3) should remove the item in index 3 of this groceryList1,
         * chicken.  After removal, the groceryList1 contains:
         * 0 eggs
         * 1 butter
         * 2 apples
         */
        System.out.println("Test #6");
        System.out.println("remove(3)");
        groceryList1.remove(3);
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #7
         * Test the add() method again.
         * add(2) should insert the item in index 2 of groceryList1.
         * The item at index 2, apples "shifts" to index 3.  After adding,
         * groceryList1 contains:
         * 0 eggs
         * 1 butter
         * 2 potatoes
         * 3 apples
         */
        System.out.println("Test #7");
        System.out.println("add(2, potatoes)");
        groceryList1.add(2, "potatoes");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #8
         * Test the add() method again.
         * add(1) should insert the item in index 1 of groceryList1.
         * The item at index 1, butter "shifts" to index 2.  After adding,
         * the groceryList1 contains:
         * 0 eggs
         * 1 tea
         * 2 butter
         * 3 potatoes
         * 4 apples
         */
        System.out.println("Test #8");
        System.out.println("add(1, tea)");
        groceryList1.add(1, "tea");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #9
         * Test the add() method again.
         * add(0) should insert the item in index 0 of groceryList1.
         * The item at index 0, eggs "shifts" to index 1.  After adding,
         * groceryList1 contains:
         * 0 distilled water
         * 1 eggs
         * 2 tea
         * 3 butter
         * 4 potatoes
         * 5 apples
         */
        System.out.println("Test #9");
        System.out.println("add(0, distilled water)");
        groceryList1.add(0, "distilled water");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #10
         * Test the add() method again.
         * add(6) should insert the item in index 6 of groceryList1.
         * This addition causes no "shifting" as the new item is added at the
         * tail of this groceryList1.  After adding, groceryList1 contains:
         * 0 distilled water
         * 1 eggs
         * 2 tea
         * 3 butter
         * 4 potatoes
         * 5 apples
         * 6 coffee
         */
        System.out.println("Test #10");
        System.out.println("add(6, coffee)");
        groceryList1.add(6, "coffee");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #11
         * Test the add() method again.
         * add(7) should insert the item in index 7 of groceryList1.
         * This addition causes no "shifting" as the new item is added at the
         * tail of groceryList1.  After adding, groceryList1 contains:
         * 0 distilled water
         * 1 eggs
         * 2 tea
         * 3 butter
         * 4 potatoes
         * 5 apples
         * 6 coffee
         * 7 celery
         */
        System.out.println("Test #11");
        System.out.println("add(7, celery)");
        groceryList1.add(7, "celery");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #12
         * Test the add() method again.
         * add(4) should insert the item in index 4 of groceryList1.
         * The item at index 4, potatoes "shifts" to index 5.  After
         * adding, groceryList1 contains:
         * 0 distilled water
         * 1 eggs
         * 2 tea
         * 3 butter
         * 4 lettuce
         * 5 potatoes
         * 6 apples
         * 7 coffee
         * 8 celery
         */
        System.out.println("Test #12");
        System.out.println("add(4, lettuce)");
        groceryList1.add(4, "lettuce");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #13
         * Test the add() method again.
         * add(7) should insert the item in index 7 of groceryList1.
         * The item at index 7, coffee "shifts" to index 8.  After adding,
         * groceryList1 contains:
         * 0 distilled water
         * 1 eggs
         * 2 tea
         * 3 butter
         * 4 lettuce
         * 5 potatoes
         * 6 apples
         * 7 radish
         * 8 coffee
         * 9 celery
         */
        System.out.println("Test #13");
        System.out.println("add(7, radish)");
        groceryList1.add(7, "radish");
        System.out.println(groceryList1.toString());
        System.out.println("*************************************************");

        /* Test #14
         * Test the isEmpty() method.
         * isEmpty() should return false.
         */
        System.out.println("Test #14");
        System.out.println("Is groceryList1 empty? " + groceryList1.isEmpty());
        System.out.println("*************************************************");

        /* Test #15
         * Test the size() method.
         * size() should return 10.
         */
        System.out.println("Test #15");
        System.out.println("groceryList1 contains " + groceryList1.size()
                + " items.");
        System.out.println("*************************************************");

        /* Test #16
         * Test the get() method using a loop.
         * The 10 items in groceryList1 should be displayed by this loop:
         * distilled water
         * eggs
         * tea
         * butter
         * lettuce
         * potatoes
         * apples
         * radish
         * coffee
         * celery
         */
        System.out.println("Test #16");
        for(int i = 0; i < groceryList1.size(); i++) {
            System.out.println(groceryList1.get(i));
        }
        System.out.println();
        System.out.println("*************************************************");

        /* Test #17
         * Test the get() method by invoking it with an invalid index of -1.
         * groceryList1.get(-1) should return an empty String.
         */
        System.out.println("Test #17");
        System.out.println(groceryList1.get(-1));
        System.out.println("*************************************************");

        /* Test #18
         * Test the get() method by invoking it with an invalid index of 10.
         * groceryList1.get(10) should return an empty String.
         */
        System.out.println("Test #18");
        System.out.println(groceryList1.get(10));
        System.out.println("*************************************************");

        /* Test #19
         * Test the remove() method using a loop.
         * The following loop will invoke the remove() method size() number
         * of times, removing the item at the head of the list each time.
         * At the end of the loop, groceryList1 should be empty and
         * isEmpty() should return true.
         */
        System.out.println("Test #19");
        int listSize = groceryList1.size();
        for(int i = 0; i < listSize; i++) {
            groceryList1.remove(0);
        }
        System.out.println("Is groceryList1 empty? "
                + groceryList1.isEmpty());
        System.out.println("groceryList1 contains "
                + groceryList1.size() + " items.");
        System.out.println("*************************************************");

        /* Test #20
         * Test the ADTMyList(String[] listItems) constructor overload by creating
         * an array of 20 food item names, then passing this array to
         * the ADTMyList(String[] listItems) constructor.  After this test, the
         * groceryList2 object should contain the 20 items.
         */
        System.out.println("Test #20");
        String[] listItems = {"peanut butter", "succotash", "fennel seeds",
                "ginger ale", "almond butter", "okra", "bleu cheese",
                "five-spice powder", "vegemite", "mozzarella", "baking powder",
                "breadfruit", "squid", "ale", "panko bread crumbs", "tortelini",
                "sugar", "salt", "maraschino cherries", "pears"};
        System.out.println();
        ADTMyList groceryList2 = new ADTMyList(listItems);
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #21
         * Test the add() method on the groceryList2 object by attempting to
         * add an item with an invalid index number, add(-1, grapes).  The ADT
         * should output an error message "-1 is an invalid index number
         * for the item grapes".  groceryList2.toString() should show that
         * the item was NOT added to groceryList2.
         */
        System.out.println("Test #21");
        groceryList2.add(-1, "grapes");
        System.out.println("\n" + groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #22
         * Test the add() method on the groceryList2 object by attempting to
         * add an item with an invalid index number, add(-100, grapes).  The ADT
         * should output an error message "-100 is an invalid index number
         * for the item grapes".  groceryList2.toString() should show that
         * the item was NOT added to groceryList2.
         */
        System.out.println("Test #22");
        groceryList2.add(-100, "grapes");
        System.out.println("\n" + groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #23
         * Test the add() method on the groceryList2 object by adding an item
         * at index 0 of the list, add(0, grapes).  groceryList2.toString()
         * should show that the item is added to the list at index 0.
         */
        System.out.println("Test #23");
        groceryList2.add(0, "grapes");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #24
         * Test the remove() method on the groceryList2 object by removing the
         * item at index 0 of the list, remove(0).  groceryList2.toString()
         * should show that the item at index 0 is removed from the list.
         */
        System.out.println("Test #24");
        groceryList2.remove(0);
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #25
         * Test the add() method on the groceryList2 object by adding an item
         * at index 1 of the list, add(1, grapes).  groceryList2.toString()
         * should show that the item is added to the list at index 1.
         */
        System.out.println("Test #25");
        groceryList2.add(1, "grapes");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #26
         * Test the remove() method on the groceryList2 object by removing the
         * item at index 1 of the list, remove(1).  groceryList2.toString()
         * should show that the item at index 1 is removed from the list.
         */
        System.out.println("Test #26");
        groceryList2.remove(1);
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #27
         * Test the add() method on the groceryList2 object by adding an item at
         * index 19 of the list, add(19 grapes).  groceryList2.toString() should
         * show that the item is added to the list at index 19.
         */
        System.out.println("Test #27");
        groceryList2.add(19, "grapes");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #28
         * Test the remove() method on the groceryList2 object by removing the
         * item at index 19 of the list, remove(19).  groceryList2.toString()
         * should show that the item at index 19 is removed from the list.
         */
        System.out.println("Test #28");
        groceryList2.remove(19);
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #29
         * Test the add() method on the groceryList2 object by attempting to
         * add an item with an index number which is equal to the current size
         * of the list, add(20, grapes).  groceryList2.toString() should show
         * that the item is added to the tail of the list.
         */
        System.out.println("Test #29");
        groceryList2.add(20, "grapes");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #30
         * Test the add() method on the groceryList2 object by attempting to
         * add an item with an index number which is greater than the current
         * size of the list, add(100, honey).  The ADT should output an error
         * message "100 is an invalid index number for the item honey".
         */
        System.out.println("Test #30");
        groceryList2.add(100, "honey");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #31
         * Test the add() method on the groceryList2 object by attempting to
         * add an item with an index number which is greater than the current
         * size of the list, add(22, honey).  The ADT should output an error
         * message "22 is an invalid index number for the item honey".
         */
        System.out.println("Test #31");
        groceryList2.add(22, "honey");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #32
         * Test the add() method on the groceryList2 object by attempting to
         * add an item with an index number which is equal to the current
         * size of the list, add(21, honey).  groceryList2.toString() should
         * show that the item is added to the tail of the list.
         */
        System.out.println("Test #32");
        groceryList2.add(21, "honey");
        System.out.println(groceryList2.toString());
        System.out.println("*************************************************");

        /* Test #33
         * Test the removeAll() method on the groceryList2 object.  After all
         * items have been removed, groceryList2.isEmpty() should return true,
         * groceryList2.size() should return 0 and groceryList2.toString()
         * should return an empty String.
         */
        System.out.println("Test #33");
        groceryList2.removeAll();
        System.out.println("groceryList2.isEmpty() returns "
                + groceryList2.isEmpty());
        System.out.println("groceryList2.size() returns "
                + groceryList2.size());
        System.out.println("groceryList2.toString() returns "
                + groceryList2.toString());
        System.out.println("*************************************************");

    }
}

