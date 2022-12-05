/*
 * Programmer: David Koh
 */
package birthdaybook;

//class used for returning a child and its parent
class Pair {
    TreeNode parent, child;

    Pair(TreeNode p, TreeNode c){
        parent = p;
        child = c;
    }
}

public class ADTBinarySearchTree {
    private TreeNode root;

    ADTBinarySearchTree() {
        root = null;
    }

    ADTBinarySearchTree(String newName, String newBirthday){
        root = new TreeNode(newName, newBirthday);
    }

    //implementation copied from in class example
    public static void preOrder(TreeNode r){
        //(root,TL,TR)
        System.out.println(r.getName() + " " + r.getBirthday());

        if(r.getLeftChild() != null) { preOrder(r.getLeftChild()); }

        if(r.getRightChild() != null){ preOrder(r.getRightChild()); }
    }
    public static void inOrder(TreeNode r){
        //(TL,root,TR)
        if(r.getLeftChild() != null) { inOrder(r.getLeftChild()); }

        System.out.println(r.getName() + " " + r.getBirthday());

        if(r.getRightChild() != null){ inOrder(r.getRightChild()); }
    }
    public static void postOrder(TreeNode r){
        //(TL,TR,root)
        if(r.getLeftChild() != null) { postOrder(r.getLeftChild()); }

        if(r.getRightChild() != null){ postOrder(r.getRightChild()); }

        System.out.println(r.getName() + " " + r.getBirthday());
    }
    //end of class example implementation

    //function to insert a node
    public void insert(TreeNode newNode){
        //if the tree is empty
        if(root==null){
            root = newNode;
        }
        //otherwise call the helper function
        else{
            insertHelper(newNode, root);
        }
    }

    //function to recursively insert a node
    private void insertHelper(TreeNode newNode, TreeNode n){
        //if the name in newNode is bigger than the name in the node it is being compared to, traverse right
        if (newNode.getName().compareTo(n.getName()) > 0){
            if(n.getRightChild()==null){
                n.setRightChild(newNode);
                return;
            }
            else{
                insertHelper(newNode, n.getRightChild());
            }
        }
        //if the name in newNode is smaller than the name in the node it is being compared to, traverse left
        else if (newNode.getName().compareTo(n.getName()) < 0){
            if(n.getLeftChild()==null){
                n.setLeftChild(newNode);
                return;
            }
            else{
                insertHelper(newNode, n.getLeftChild());
            }
        }
    }

    //function to delete a node
    public void delete(String trashKeyWord){
        //good luck professor
        Pair temp = traverse(null, root, trashKeyWord);

        if(temp == null){
            System.out.println("This person does not exist in the Birthday Book.");
        }
        else{
            if (temp.child.getRightChild()==null){
                if(temp.child.getLeftChild()==null){
                    if(temp.parent.getLeftChild()==temp.child){
                        temp.parent.setLeftChild(null);
                    }
                    else{
                        temp.parent.setRightChild(null);
                    }
                }
                else{
                    if(temp.parent.getLeftChild()==temp.child){
                        temp.parent.setLeftChild(temp.child.getLeftChild());
                    }
                    else{
                        temp.parent.setRightChild(temp.child.getLeftChild());
                    }
                }
            }
            else {
                Pair successor = inOrderTraversal(temp.child, temp.child.getRightChild());

                if(successor.parent==temp.child){
                    successor.parent.setName(successor.child.getName());
                    successor.parent.setBirthday(successor.child.getBirthday());
                    successor.parent.setRightChild(null);
                }
                else{
                    temp.child.setName(successor.child.getName());
                    temp.child.setBirthday(successor.child.getBirthday());

                    if(successor.child.getRightChild()!=null){
                        successor.parent.setLeftChild(successor.child.getRightChild());
                    }
                    else{
                        successor.parent.setLeftChild(null);
                    }
                }
            }
        }
    }

    //function to recursively find the inorder successor and its parent
    private Pair inOrderTraversal(TreeNode parent, TreeNode r){
        if(r.getLeftChild() != null) { return inOrderTraversal(r, r.getLeftChild()); }

        return new Pair(parent, r);
    }

    //function to recursively find the node with the keyWord and its parent node
    private Pair traverse(TreeNode parent, TreeNode child, String keyWord){
        if(child==null){
            return null;
        }
        else if(child.getName().compareTo(keyWord) > 0){
            return traverse(child, child.getLeftChild(), keyWord);
        }
        else if(child.getName().compareTo(keyWord) < 0){
            return traverse(child, child.getRightChild(), keyWord);
        }
        else {
            return new Pair(parent, child);
        }
    }

    //function to change birthday from desired name
    public void editBirthday(String name, String newBirthday){
        Pair personToEdit = traverse(null, root, name);

        if(personToEdit==null){
            System.out.println("This person does not exist. Try again next time :)");
        }

        else{ personToEdit.child.setBirthday(newBirthday); }
    }

    public TreeNode getRoot(){
        return this.root;
    }

}
