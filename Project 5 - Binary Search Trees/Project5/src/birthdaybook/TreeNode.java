package birthdaybook;
/*
 * Programmer: David Koh
 */
public class TreeNode {
    private String name;
    private String birthday;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode() {
        name = "";
        birthday = "";
        leftChild = null;
        rightChild = null;
    }
    public TreeNode(String newName, String newBirthday) {
        setName(newName);
        setBirthday(newBirthday);
    }
    public String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String newBirthday) { birthday = newBirthday; }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode newLeftChild) {
        leftChild = newLeftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode newRightChild) {
        rightChild = newRightChild;
    }
}

