package phase1;

public class StackTester {
    public static void main(String[] args) {
        StackArrayBased stack = new StackArrayBased();

        //pushing 50 items and peeking at them as they are input
        for(int i=0; i<50; i++){
            stack.push(i);
            System.out.print(stack.peek() + " ");
        }
        System.out.println("\n" + "------------------------------------");

        //popping each item in the array and peeking as they are deleted
        for(int i=0; i<49; i++){
            //only 0-49 because if 0-50 we will hit the exception
            stack.pop();
            System.out.print(stack.peek() + " ");
        }
        System.out.println("\n" + "------------------------------------");

        //pushes more than 50 to see if the array successfully doubles
        for(int i=0; i<100; i++){
            stack.push(i);
            System.out.print(stack.peek() + " ");
        }
        System.out.println("\n" + "------------------------------------");

        //pushes for more than 100
        for(int i=0; i<200; i++){
            stack.push(i);
            System.out.print(stack.peek() + " ");
        }
        System.out.println("\n" + "------------------------------------");

        //pushes for more than 200
        for(int i=0; i<400; i++){
            stack.push(i);
            System.out.print(stack.peek() + " ");
        }
        System.out.println("\n" + "------------------------------------");

        stack.popAll();
        //should return true
        System.out.println(stack.isEmpty());

        System.out.println("\n end");
    }
}
