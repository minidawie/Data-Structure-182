/*
 * Programmer: David Koh
 */
package birthdaybook;

public class BirthdayBook {
    public static void main(String[] args) {
        ADTBinarySearchTree entry = new ADTBinarySearchTree();

        //adds a bunch of entries to the birthday book
        entry.insert(new TreeNode("ian", "6/19/2001"));
        entry.insert(new TreeNode("paul", "6/26/2000"));
        entry.insert(new TreeNode("sam", "8/18/2000"));
        entry.insert(new TreeNode("dpark", "11/19/2000"));
        entry.insert(new TreeNode("david", "1/31/1999"));
        entry.insert(new TreeNode("casey", "10/27/1998"));
        entry.insert(new TreeNode("eric", "6/11/1999"));
        entry.insert(new TreeNode("will", "6/15/1999"));

        //output casey david dpark eric ian paul sam will
        entry.inOrder(entry.getRoot());
        System.out.println("");

        //output casey david eric spark will sam paul ian
        entry.postOrder(entry.getRoot());
        System.out.println("");

        //output ian dpark david casey eric paul sam will
        entry.preOrder(entry.getRoot());
        System.out.println("");

        //delete dpark
        entry.delete("dpark");

        //output casey david eric ian paul sam will
        entry.inOrder(entry.getRoot());
        System.out.println("");

        //delete eric
        entry.delete("eric");

        //output casey david ian paul sam will
        entry.inOrder(entry.getRoot());
        System.out.println("");

        //tries to delete name that doesn't exist
        entry.delete("eric");
        System.out.println("");

        //edits birthday
        entry.editBirthday("will", "8/18/1999");

        //should output new birthday for will
        entry.inOrder(entry.getRoot());
        System.out.println("");

    }
}
